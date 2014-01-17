package net.idea.i5._5.ambit2.sections.TO_PHOTOTRANS_AIR_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart.TOPHOTOTRANSAIR.REFERENCE.Set;



public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord>{
	
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOPHOTOTRANSAIR()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName(),"ENV FATE","TO_PHOTOTRANS_AIR_SECTION");
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),
				unmarshalled.getStudyResultType().getValueID()
			);
		record.addtMeasurement(papp);
	
		//UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		if (sciPart.getTOPHOTOTRANSAIR().getGUIDELINE()!=null)
			for (ScientificPart.TOPHOTOTRANSAIR.GUIDELINE.Set set : sciPart.getTOPHOTOTRANSAIR().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getTOPHOTOTRANSAIR().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOPHOTOTRANSAIR().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		
		// citation
		if (sciPart.getTOPHOTOTRANSAIR().getREFERENCE() != null)
			for (Set set : sciPart
					.getTOPHOTOTRANSAIR().getREFERENCE().getSet()) {
				if (set.getREFERENCEAUTHOR()!=null)
					papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
				if (set.getREFERENCEYEAR()!=null) {
					papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
				}
			}
		papp.getParameters().put("Reactant",null);
		if (sciPart.getTOPHOTOTRANSAIR().getRATECONSTANT()!=null)
		for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart.TOPHOTOTRANSAIR.RATECONSTANT.Set set : sciPart.getTOPHOTOTRANSAIR().getRATECONSTANT().getSet()) {
			papp.getParameters().put("Reactant",set.getPHRASEOTHERTYPE().getTYPEValue());
			//TODO array
		}
	
		if (sciPart.getTOPHOTOTRANSAIR().getDISSIP()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_PHOTOTRANS_AIR_SECTION.EndpointStudyRecord.ScientificPart.TOPHOTOTRANSAIR.DISSIP.Set set : sciPart.getTOPHOTOTRANSAIR().getDISSIP().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setEndpoint("DT50");

				effect.setConditions(new Params());
				papp.addEffect(effect);
				try {
					effect.getConditions().put(TestCondition,set.getTESTCONDITION().getTESTCONDITION().getValue());
				} catch (Exception x) {
					effect.getConditions().put(TestCondition,null);
				}
				
				//results
				if (set.getPRECISIONHALFLIFELOQUALIFIER()!=null) {
					effect.setUnit(set.getPRECISIONHALFLIFELOQUALIFIER().getHALFLIFEUNITValue());
					if (set.getPRECISIONHALFLIFELOQUALIFIER().getHALFLIFELOVALUE()!=null) try {
						effect.setLoQualifier(set.getPRECISIONHALFLIFELOQUALIFIER().getHALFLIFELOQUALIFIERValue());
						effect.setLoValue(Double.parseDouble(set.getPRECISIONHALFLIFELOQUALIFIER().getHALFLIFELOVALUE().getValue()));
					} catch (Exception x) {
						effect.setTextValue(set.getPRECISIONHALFLIFELOQUALIFIER().getHALFLIFELOVALUE().getValue());
					}
					if (set.getPRECISIONHALFLIFELOQUALIFIER().getHALFLIFEUPVALUE()!=null) try {
						effect.setUpQualifier(set.getPRECISIONHALFLIFELOQUALIFIER().getHALFLIFEUPQUALIFIERValue());
						effect.setUpValue(Double.parseDouble(set.getPRECISIONHALFLIFELOQUALIFIER().getHALFLIFEUPVALUE().getValue()));
					} catch (Exception x) {
						effect.setTextValue(set.getPRECISIONHALFLIFELOQUALIFIER().getHALFLIFEUPVALUE().getValue());
					}
				}	

				
			}
		} 		

		return record;
	}
}