package net.idea.i5._5.ambit2.sections.ASPECT_RATIO_SHAPE_SECTION;

import javax.xml.bind.JAXBElement;

import net.idea.i5._5.ambit2.sections.PChemStudyRecordConvertor;
import net.idea.i5.io.I5_ROOT_OBJECTS;
import net.idea.i5.io.QACriteriaException;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import ambit2.base.data.SubstanceRecord;
import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.exceptions.AmbitException;
import ambit2.base.interfaces.IStructureRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.DocumentTypeType;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord.ScientificPart;
import eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord.ScientificPart.ASPECTRATIOSHAPE.REFERENCE.Set;


public class StudyRecordConverter
		extends
		PChemStudyRecordConvertor<eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord> {
	
	public StudyRecordConverter() {
		super(I5_ROOT_OBJECTS.ASPECT_RATIO_SHAPE);
	}
	@Override
	protected boolean hasScientificPart(EndpointStudyRecord unmarshalled) {
		return unmarshalled.getScientificPart()!=null;
	}
	@Override
	protected boolean isDataWaiving(EndpointStudyRecord unmarshalled) {
		return unmarshalled.getDataWaiving()!=null;
	}
	@Override
	protected String getTestMaterialIdentity(EndpointStudyRecord unmarshalled) {
		try {
			return unmarshalled.getScientificPart().getASPECTRATIOSHAPE().getTESTMATEQSUBMSUB().getSet().getLISTBELOWSEL().getLISTBELOWSEL();
		} catch (Exception x) {
			return null;	
		}
	}	
			
	@Override
	protected void parseReference(EndpointStudyRecord unmarshalled, ProtocolApplication papp) throws QACriteriaException {
		// citation
		QACriteriaException qax = null;
		if (unmarshalled.getScientificPart().getASPECTRATIOSHAPE().getREFERENCE() != null)
			for (Set set : unmarshalled.getScientificPart().getASPECTRATIOSHAPE().getREFERENCE().getSet()) {
				try {
					if (set.getREFERENCEAUTHOR()!=null && set.getREFERENCEAUTHOR().getREFERENCEAUTHOR()!=null)
						papp.setReference(set.getREFERENCEAUTHOR().getREFERENCEAUTHOR().getValue());
					if (set.getREFERENCEYEAR()!=null) try {
						papp.setReferenceYear(set.getREFERENCEYEAR().getREFERENCEYEAR().getValue());
					} catch (Exception x) {}
					try {
						papp.setReferenceOwner(set.getREFERENCECOMPANYID().getREFERENCECOMPANYID().getValue());
					} catch (Exception x) {	papp.setReferenceOwner("");}					
					isReferenceTypeAccepted(set.getPHRASEOTHERREFERENCETYPE()==null?null:set.getPHRASEOTHERREFERENCETYPE().getREFERENCETYPE());					
					return;
				} catch (QACriteriaException x) {
					qax = x;
					continue;
				} catch (Exception x) {
					qax = new QACriteriaException(x.getMessage());
					continue;
				}

			}	
		else qax = new QACriteriaException("Empty reference!");
		if (qax!=null) throw qax;
	}			
	@Override
	public IStructureRecord transform2record(EndpointStudyRecord unmarshalled,
			SubstanceRecord record) throws AmbitException {
		if (super.transform2record(unmarshalled, record)==null) return null;
		ScientificPart sciPart = unmarshalled.getScientificPart();
		if (sciPart.getASPECTRATIOSHAPE()==null) return null;

		record.clear();
		ProtocolApplication<Protocol,Params,String,Params,String> papp = createProtocolApplication(
				unmarshalled.getDocumentReferencePK(),
				unmarshalled.getName());
		parseReliability(papp, unmarshalled.getReliability().getValueID()
				,unmarshalled.isRobustStudy(),unmarshalled.isUsedForClassification(),unmarshalled.isUsedForMSDS()
				,unmarshalled.getPurposeFlag().getValueID(),unmarshalled.getStudyResultType().getValueID(),
				getTestMaterialIdentity(unmarshalled));
		record.addtMeasurement(papp);		
		
		// UUID
		if (unmarshalled.getOwnerRef().getType().equals(DocumentTypeType.SUBSTANCE)) {
			setCompanyUUID(record, unmarshalled.getOwnerRef().getUniqueKey());
		}
		
		// citation
		parseReference(unmarshalled, papp);			
		// TODO data owner - it's probably not in this file
		
		if (sciPart.getASPECTRATIOSHAPE().getGUIDELINE() != null)
			for (eu.europa.echa.schemas.iuclid5._20130101.studyrecord.ASPECT_RATIO_SHAPE_SECTION.EndpointStudyRecord.ScientificPart.ASPECTRATIOSHAPE.GUIDELINE.Set set : sciPart.getASPECTRATIOSHAPE().getGUIDELINE().getSet()) try {
				papp.getProtocol().addGuideline(set.getPHRASEOTHERGUIDELINE().getGUIDELINEValue());
			} catch (Exception x) {		
			}
			
		if (sciPart.getASPECTRATIOSHAPE().getMETHODNOGUIDELINE() != null)
			try {
				papp.getProtocol().addGuideline(
						sciPart.getASPECTRATIOSHAPE().getMETHODNOGUIDELINE()
								.getSet().getTEXTAREABELOW().getTEXTAREABELOW()
								.getValue());
			} catch (Exception x) {
			}

		try {
			papp.getParameters().put(cTypeMethod,
					sciPart.getASPECTRATIOSHAPE().getMETHOD()==null?null:
					sciPart.getASPECTRATIOSHAPE().getMETHOD().getSet().getPHRASEOTHERLISTSELFIX().getLISTSELFIXValue());
		} catch (Exception x) {
			papp.getParameters().put(cTypeMethod,null);
		}

		try {
			papp.getParameters().put("Method details",
				sciPart.getASPECTRATIOSHAPE().getMETHODSDETAILSDATAEVAL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put("Method details",null);
		}
		/*
		papp.getParameters().put(cTestMaterialForm,
				sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM()==null?null:
				sciPart.getAGGLOMERATIONAGGREGATION().getTESTMATFORM().getSet().getPHRASEOTHERTESTMATFORM().getTESTMATFORMValue());
		*/

		try {
			papp.getParameters().put("Sampling",sciPart.getASPECTRATIOSHAPE().getSAMPLING().getSet().getFREETEXTBELOW().getFREETEXTBELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put("Sampling",null);			
		}
		try {
			papp.getParameters().put("Instruments",sciPart.getASPECTRATIOSHAPE().getDATAGATHERINGINSTRUMENTS().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.getParameters().put("Instruments",null);
		}
				
		
		if (sciPart.getASPECTRATIOSHAPE().getSHAPEDESCRIPTION()!=null) {
			parseElement(sciPart.getASPECTRATIOSHAPE().getSHAPEDESCRIPTION(),papp);
		}
		if (sciPart.getASPECTRATIOSHAPE().getASPECTRATIO()!=null) {
			parseElement(sciPart.getASPECTRATIOSHAPE().getASPECTRATIO(),papp);
		}
		try {
			papp.setInterpretationResult(sciPart.getASPECTRATIOSHAPE().getAPPLCL().getSet().getTEXTAREABELOW().getTEXTAREABELOW().getValue());
		} catch (Exception x) {
			papp.setInterpretationResult(null);			
		}
		return record;
	}
	
	protected void parseElement(JAXBElement<Object> element,ProtocolApplication<Protocol,Params,String,Params,String> papp) {
		String endpoint = null;
		if (element.getValue() instanceof Node) {
			endpoint = ((Node) element.getValue()).getLocalName();
			//parseNode((Node) element.getValue(),">");
		}
		if (element.getValue() instanceof NodeList) {
			NodeList nodes = (NodeList)element.getValue();
			//i5:set
			for (int i=0; i < nodes.getLength(); i++) {
				Node set = nodes.item(i);
				if ("set".equals(set.getLocalName())) {
					EffectRecord<String, Params, String> effect = new EffectRecord<String, Params, String>();
					effect.setEndpoint(endpoint);
					effect.setConditions(new Params());
					Params xyz = new Params();xyz.put(loValue,null);
					effect.getConditions().put(EFFECT.PRECISION_X_LOQUALIFIER.getTag(), xyz);
					xyz = new Params();xyz.put(loValue,null);
					effect.getConditions().put(EFFECT.PRECISION_Y_LOQUALIFIER.getTag(), xyz);
					xyz = new Params();xyz.put(loValue,null);
					effect.getConditions().put(EFFECT.PRECISION_Z_LOQUALIFIER.getTag(), xyz);
					papp.addEffect(effect);
					NodeList r = set.getChildNodes();
					for (int j=0; j < r.getLength(); j++) try {
						EFFECT field = EFFECT.valueOf(r.item(j).getLocalName());
						field.setValue(effect,r.item(j).getChildNodes());
					} catch (Exception x) {
						
					}
				} else {
					//don't know what's this
				}
			}
		}

	}
	enum P {
		SHAPE_DESCRIPTIVE_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.put(loValue,node.getTextContent());
				params.put(loQualifier," ");
			}	
		},
		SHAPE_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					effect.setLoValue(Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {effect.setTextValue(node.getTextContent());}
			}	
		},
		SHAPE_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				String q = node.getTextContent();
				effect.setUnit("NOT_SPECIFIED".equals(q)?null:q);
			}	
		},
		STD_DEV_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(loValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(loValue,node.getTextContent());
				}
			}				
		},
		STD_DEV_UNIT_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.put(unit,node.getTextContent());
			}			
		},
		X_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.put(loQualifier,node.getTextContent());
			}				
		},
		X_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(loValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(loValue,node.getTextContent());
				}
			}				
		},
		X_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.put(upQualifier,node.getTextContent());
			}							
		},
		X_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(upValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(upValue,node.getTextContent());
				}
			}				
		},
		X_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(loValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(loValue,node.getTextContent());
				}
			}
			@Override
			public String getTag() {
				return "STD_DEV";
			}
		},
		//y
		Y_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.put(loQualifier,node.getTextContent());
			}				
		},
		Y_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(loValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(loValue,node.getTextContent());
				}
			}				
		},
		Y_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.put(upQualifier,node.getTextContent());
			}							
		},
		Y_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(upValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(upValue,node.getTextContent());
				}
			}				
		},
		Y_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(loValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(loValue,node.getTextContent());
				}
			}
			@Override
			public String getTag() {
				return "STD_DEV";
			}
		},
		//z
		Z_LOQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.put(loQualifier,node.getTextContent());
			}				
		},
		Z_LOVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(loValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(loValue,node.getTextContent());
				}
			}				
		},
		Z_UPQUALIFIER_value {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				params.put(upQualifier,node.getTextContent());
			}							
		},
		Z_UPVALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(upValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(upValue,node.getTextContent());
				}
			}				
		},
		Z_STD_DEVI_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
				try {
					params.put(loValue,Double.parseDouble(node.getTextContent()));
				} catch (Exception x) {
					params.put(loValue,node.getTextContent());
				}
			}
			@Override
			public String getTag() {
				return "STD_DEV";
			}
		}
		
		;
		public void setValue(EffectRecord<String, Params, String> effect,Params params,Node node) {
		}
		public String getTag() {
			return name();
		}
	}
	enum EFFECT {
		//i5:ZETA_POTENTIAL_TABLE
		PHRASEOTHER_SHAPE_DESCRIPTIVE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return "SHAPE_DESCRIPTIVE";
			}
		},
		SHAPE_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				effect.setEndpoint("SHAPE");
				useChildrenNodesEffect(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return "SHAPE";
			}
		},
		PHRASEOTHER_SHAPE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				effect.setEndpoint("SHAPE");
				useChildrenNodesEffect(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return "SHAPE";
			}			
		},
		VALUEUNIT_STD_DEV_VALUE {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				useChildrenNodesParams(effect, nodes);	
			}	
			@Override
			public String getTag() {
				return "STD_DEV";
			}			
		},
		PRECISION_X_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				effect.setEndpoint("ASPECT RATIO");
				useChildrenNodesParams(effect, nodes);
			}	
			public String getTag() {
				return "X";
			}			
		},
		PRECISION_Y_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				effect.setEndpoint("ASPECT RATIO");
				useChildrenNodesParams(effect, nodes);		
			}	
			public String getTag() {
				return "Y";
			}			
		},
		PRECISION_Z_LOQUALIFIER {
			@Override
			public void setValue(EffectRecord<String, Params, String> effect,
					NodeList nodes) {
				effect.setEndpoint("ASPECT RATIO");
				useChildrenNodesParams(effect, nodes);
			}	
			public String getTag() {
				return "Z";
			}			
		},
		REMARKS {
			@Override
			public void setValue(EffectRecord<String,Params,String> effect,NodeList nodes) {
				if (nodes!=null)
					for (int i=0; i < nodes.getLength(); i++) {
						effect.getConditions().put(name(),nodes.item(i).getTextContent());
					}
			}			
		};
		public String getTag() {
			return name();
		}
		public void setValue(EffectRecord<String,Params,String> effect,NodeList nodes) {
			
		}
		public void useChildrenNodesParams(EffectRecord<String, Params, String> effect,
				NodeList nodes) {
			if (nodes!=null) {
				Params params = new Params();
				effect.getConditions().put(getTag(),params);
				for (int i=0; i < nodes.getLength(); i++) try {
					P p = P.valueOf(nodes.item(i).getLocalName().replace(".","_"));
					p.setValue(effect,params, nodes.item(i));
				} catch (Exception x) {}
			}	
		}		
		public void useChildrenNodesEffect(EffectRecord<String, Params, String> effect,
				NodeList nodes) {
			if (nodes!=null) {
				for (int i=0; i < nodes.getLength(); i++) try {
					P p = P.valueOf(nodes.item(i).getLocalName().replace(".","_"));
					p.setValue(effect,null, nodes.item(i));
				} catch (Exception x) {}
			}	
		}
	}
	
	
}