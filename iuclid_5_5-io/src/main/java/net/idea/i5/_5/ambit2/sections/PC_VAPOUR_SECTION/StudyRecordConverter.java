package net.idea.i5._5.ambit2.sections.PC_VAPOUR_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart.PCVAPOUR.REFERENCE.Set;

public class StudyRecordConverter
		extends
		AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord> {


	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart sciPart = 
				unmarshalled.getScientificPart();
		if (sciPart.getPCVAPOUR()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"P-CHEM","PC_VAPOUR_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID());
		record.addtMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		if (sciPart.getPCVAPOUR().getREFERENCE() != null)
			for (Set set : sciPart.getPCVAPOUR().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}			
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getPCVAPOUR().getGUIDELINE() != null)
			for (ScientificPart.PCVAPOUR.GUIDELINE.Set set : sciPart
					.getPCVAPOUR().getGUIDELINE().getSet()) {
				papp.getProtocol().addGuideline(
						set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getPCVAPOUR().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getPCVAPOUR().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.PC_VAPOUR_SECTION.EndpointStudyRecord.ScientificPart.PCVAPOUR.VAPOURPR.Set set : sciPart.getPCVAPOUR().getVAPOURPR().getSet()) {
			EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
			effect.setEndpoint(VapourPressure);
			effect.setConditions(new Params());
			papp.addEffect(effect);

			if (set.getTEMPQUALIFIER() != null) {
				Params tvalue = new Params();
				if (set.getTEMPQUALIFIER().getTEMPQUALIFIERValue()!= null) {
					tvalue.put(
							loValue,getNumber(set.getTEMPQUALIFIER().getTEMPQUALIFIERValue()));
				}
				if (set.getVALUEUNITTEMPVALUE()!=null)
					tvalue.put(
							unit,getNumber(set.getVALUEUNITTEMPVALUE().getTEMPUNITValue()));
				effect.getConditions().put(Temperature, tvalue);				
			} else
				effect.getConditions().put(Temperature, null);
			
			

			if (set.getPRECISIONPRESSURELOQUALIFIER() != null) {
				effect.setUnit(set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUNITValue());
				if (set.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOQUALIFIERValue() != null)
					try {
						effect.setLoQualifier(set.getPRECISIONPRESSURELOQUALIFIER()
								.getPRESSURELOQUALIFIERValue());						
						effect.setLoValue(Double.parseDouble(set
								.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOQUALIFIERValue()
								));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONPRESSURELOQUALIFIER().getPRESSURELOQUALIFIERValue());
					}
				if (set.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPQUALIFIERValue() != null)
					try {
						effect.setUpQualifier(set.getPRECISIONPRESSURELOQUALIFIER()
								.getPRESSUREUPQUALIFIER());						
						effect.setUpValue(Double.parseDouble(set
								.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPVALUE()
								.getValue()));
					} catch (Exception x) {
						effect.setTextValue(set
								.getPRECISIONPRESSURELOQUALIFIER().getPRESSUREUPVALUE().getValue()
								);
					}
			}
		}

		return record;
	}
	
	protected Object getNumber(Object value) {
		if (value == null) return null;
		if (value instanceof Number) return value;
		try {
			return Double.parseDouble(value.toString());
		} catch (Exception x) {
			return value;
		}
		
	}
}