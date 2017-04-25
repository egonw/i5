package net.idea.i6._2.ambit2.wrappers;

import java.lang.reflect.Method;
import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.Params;
import ambit2.base.data.study.Protocol;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityoral._2.ENDPOINTSTUDYRECORDRepeatedDoseToxicityOral;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityoral._2.EfflevelEntry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityoral._2.Entry;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_repeateddosetoxicityoral._2.LowestEffectiveDoseConc;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;

public class RepeatedDoseToxicityOral_RecordWrapper
		extends RepeatedDoseToxicity_RecordWrapper<ENDPOINTSTUDYRECORDRepeatedDoseToxicityOral> {

	public RepeatedDoseToxicityOral_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignProtocolParameters(ProtocolApplication<Protocol, IParams, String, IParams, String> papp) {
		super.assignProtocolParameters(papp);
		Object remarks = papp.getParameters().get("Remarks");
		Object doses = papp.getParameters().get(I5CONSTANTS.cDoses);
		// i6 migrations moves the doses into remarks ...
		if (doses == null || "".equals(doses.toString()))
			papp.getParameters().put(I5CONSTANTS.cDoses, remarks);
		
		try {
			IParams params = ((IParams) papp.getParameters());
			params.put(I5CONSTANTS.cTestType, p2Value(getStudyRecord().getAdministrativeData().getEndpoint()).trim());
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage());
		}
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDRepeatedDoseToxicityOral studyrecord) {

		if (studyrecord.getResultsAndDiscussion().getEffectLevels() != null)
			for (EfflevelEntry e : studyrecord.getResultsAndDiscussion().getEffectLevels().getEfflevel().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				
				try {
					effect.setEndpoint(p2Value(e.getEndpoint()));
				} catch (Exception x) {
					effect.setEndpoint(null);
				}
				q2effectrecord(e.getEffectLevel(), effect);
				papp.addEffect(effect);
				try {
					effect.getConditions().put(I5CONSTANTS.cSex, p2Value(e.getSex()));
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.cSex, null);
				}
				try {
					effect.getConditions().put(I5CONSTANTS.cConcType, p2Value(e.getBasedOn()));
				} catch (Exception x) {
					effect.getConditions().put(I5CONSTANTS.cConcType, null);
				}

				effect.getConditions().put(I5CONSTANTS.cSpecies,
						p2Value(studyrecord.getMaterialsAndMethods().getTestAnimals().getSpecies()));
				effect.getConditions().put(I5CONSTANTS.cTestType,((IParams)papp.getParameters()).get(I5CONSTANTS.cTestType));

			}
		if (studyrecord.getResultsAndDiscussion().getResultsOfExaminations() != null) {

			Method[] allMethods = studyrecord.getResultsAndDiscussion().getResultsOfExaminations().getClass()
					.getDeclaredMethods();
			for (Method m : allMethods)
				try {
					if (m.getName().startsWith("get"))
						try {
							Object r = m.invoke(materialsAndMethods);
							if (r == null)
								continue;
							String key = m.getName();
							IParams p = new Params();
							Object value = _getMethodValue(r, p);
							if (value != null && !"".equals(value)) {
								EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
								effect.setEndpoint(dictionaryEndpoint(methodname2key(key)));
								effect.setTextValue(p2Value(value));
								papp.addEffect(effect);
							}
						} catch (Exception xx) {
						}
				} catch (Exception x) {
					logger.log(Level.WARNING, x.getMessage(), x);
				}
		}
		if (studyrecord.getResultsAndDiscussion().getTargetSystemOrganToxicity() != null) {
			for (Entry entry : studyrecord.getResultsAndDiscussion().getTargetSystemOrganToxicity()
					.getTargetSystemOrganToxicity().getEntry()) {

				if (entry.getLowestEffectiveDoseConc().getValue() != null
						&& !"".equals(entry.getLowestEffectiveDoseConc())) {
					try {
						EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
						effect.setEndpoint("LOEL");
						q2effectrecord(entry.getLowestEffectiveDoseConc(), effect);
						effect.getConditions().put("System", p2Value(entry.getSystem()));
						effect.getConditions().put("Organ", p2Value(entry.getOrgan()));
						effect.getConditions().put("TreatmentRelated", p2Value(entry.getTreatmentRelated()));
						papp.addEffect(effect);
					} catch (Exception x) {

					}
					if (entry.getCriticalEffectsObserved() != null) {
						EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
						effect.setEndpoint("CriticalEffectsObserved");
						effect.setTextValue(p2Value(entry.getCriticalEffectsObserved()));
						effect.setEndpoint("DoseResponseRelationship");
						effect.setTextValue(p2Value(entry.getDoseResponseRelationship()));
						papp.addEffect(effect);
					}
				}
			}
		}

	}

	protected static void q2effectrecord(LowestEffectiveDoseConc field,
			EffectRecord<String, IParams, String> effectrecord) {

		if (field.getValue() != null)
			try {
				effectrecord.setLoValue(Double.parseDouble(field.getValue()));
			} catch (Exception x) {
				effectrecord.setTextValue(field.getValue());
			}
		if (field.getUnitCode() != null)
			effectrecord.setUnit(getPhrase(field.getUnitCode(), field.getUnitOther()));
	}
}
