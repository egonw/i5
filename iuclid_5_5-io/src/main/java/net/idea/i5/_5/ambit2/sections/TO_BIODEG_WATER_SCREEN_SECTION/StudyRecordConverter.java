package net.idea.i5._5.ambit2.sections.TO_BIODEG_WATER_SCREEN_SECTION;

import net.idea.i5._5.ambit2.sections.AbstractStudyRecordConverter;
import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord.ScientificPart;



public class StudyRecordConverter extends AbstractStudyRecordConverter<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord>{
	private static final String cTimePoint = "Sampling time";
	private static final String cPercentDegradation = "% Degradation";
	private static final String cTestType = "Test type";
	
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled, SubstanceRecord record) {
		eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord.ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getTOBIODEGWATERSCREEN()==null) return null;
		
		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = new ProtocolApplication<Protocol,Params,String,Params,String>(new Protocol(unmarshalled.getName()));
		papp.getProtocol().setTopCategory("ENV FATE");
		papp.getProtocol().setCategory("TO_BIODEG_WATER_SCREEN_SECTION");
		papp.setParameters(new Params());
		record.addtMeasurement(papp);

		//UUID
		papp.setDocumentUUID(unmarshalled.getDocumentReferencePK());
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record,unmarshalled.getOwnerRef().getUniqueKey());
		}
		//TODO data owner - it's probably not in this file
		
		if (sciPart.getTOBIODEGWATERSCREEN().getGUIDELINE()!=null)
			for (ScientificPart.TOBIODEGWATERSCREEN.GUIDELINE.Set set : sciPart.getTOBIODEGWATERSCREEN().getGUIDELINE().getSet()) {
				if (set.getPHRASEOTHERGUIDELINE()!=null)
					papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());

			}
		if (sciPart.getTOBIODEGWATERSCREEN().getMETHODNOGUIDELINE()!=null) try {
			papp.getProtocol().addGuideline(sciPart.getTOBIODEGWATERSCREEN().getMETHODNOGUIDELINE().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}	
		/*
		if (sciPart.getECFISHTOX().getREFERENCESUBSTANCE()!=null) {
			record.setReferenceSubstanceUUID(sciPart.getECFISHTOX().getREFERENCESUBSTANCE().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue())
		}
		*/

		//TEST TYPE
		papp.getParameters().put(cTestType,
				sciPart.getTOBIODEGWATERSCREEN().getOXYGENCONDITIONS()==null?null:
				sciPart.getTOBIODEGWATERSCREEN().getOXYGENCONDITIONS().getSet().getPHRASEOTHERLISTPOPFIX().getLISTPOPFIXValue());

		if (sciPart.getTOBIODEGWATERSCREEN().getINTERPRETRESULTSSUBM()!=null) {
			papp.setInterpretationResult(sciPart.getTOBIODEGWATERSCREEN().getINTERPRETRESULTSSUBM().getSet().getPHRASEOTHERLISTPOP().getLISTPOPValue());
		} else
			papp.setInterpretationResult(null);
		
		papp.setInterpretationCriteria(null);
		if (sciPart.getTOBIODEGWATERSCREEN().getRESULTSDETAILS()!=null) try {
			papp.setInterpretationCriteria(sciPart.getTOBIODEGWATERSCREEN().getRESULTSDETAILS().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {}
		

		if (sciPart.getTOBIODEGWATERSCREEN().getDEGRAD()!=null) {
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.TO_BIODEG_WATER_SCREEN_SECTION.EndpointStudyRecord.ScientificPart.TOBIODEGWATERSCREEN.DEGRAD.Set set : sciPart.getTOBIODEGWATERSCREEN().getDEGRAD().getSet()) {
				EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
				effect.setEndpoint(cPercentDegradation);
				effect.setUnit("%");
				if (set.getPHRASEOTHERPARAMETER()!=null)
					effect.setEndpoint(set.getPHRASEOTHERPARAMETER().getPARAMETERValue());

				effect.setConditions(new Params());
				
				papp.addEffect(effect);
				
				if (set.getPRECISIONLOQUALIFIER()!=null) {
					if (set.getPRECISIONLOQUALIFIER().getLOVALUE()!=null) try {
						effect.setLoValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getLOVALUE().getValue()));
						effect.setLoQualifier(set.getPRECISIONLOQUALIFIER().getLOQUALIFIERValue());
					} catch (Exception x) {}
					if (set.getPRECISIONLOQUALIFIER().getUPVALUE()!=null) try {
						effect.setUpValue(Double.parseDouble(set.getPRECISIONLOQUALIFIER().getUPVALUE().getValue()));
						effect.setUpQualifier(set.getPRECISIONLOQUALIFIER().getUPQUALIFIERValue());
					} catch (Exception x) {}
				}	
				
				if (set.getVALUEUNITTIMEPOINTVALUE()!=null)
					effect.getConditions().put(cTimePoint,
							(set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE()==null?null:set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTVALUE().getValue())+
							" " + 
							(set.getVALUEUNITTIMEPOINTVALUE()==null?null:set.getVALUEUNITTIMEPOINTVALUE().getTIMEPOINTUNITValue()));	

				
			}
		} 		
	
		System.out.println(papp);
		return record;
	}
}
