package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import ambit2.base.data.study.Value;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2.Duration;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2.ENDPOINTSTUDYRECORDToxicityToTerrestrialPlants;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_toxicitytoterrestrialplants._2.EffectConcentrationsEntry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class ToxicityToTerrestrialPlants_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDToxicityToTerrestrialPlants> {

	public ToxicityToTerrestrialPlants_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDToxicityToTerrestrialPlants studyrecord) {

		if (studyrecord.getResultsAndDiscussion().getEffectConcentrations() == null)
			return;

		for (EffectConcentrationsEntry e : studyrecord.getResultsAndDiscussion().getEffectConcentrations().getEntry()) {

			EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
			q2effectrecord(e.getEffectConc(), effect);
			effect.setEndpoint(p2Value(e.getEndpoint().getValue()));
			papp.addEffect(effect);
			effect.getConditions().put(I5CONSTANTS.cEffect, p2Value(e.getBasisForEffect()));
			effect.getConditions().put(I5CONSTANTS.cConcType, p2Value(e.getConcBasedOn()));
			effect.getConditions().put(I5CONSTANTS.cMeasuredConcentration,p2Value(e.getNominalMeasured()));
			effect.getConditions().put(I5CONSTANTS.cExposure, q2value(e.getDuration()));
		}
	}

	protected static Value q2value(Duration field) {
		try {
			Value v = new Value();
			v.setLoValue(Double.parseDouble(field.getValue()));
			v.setUnits(getPhrase(field.getUnitCode(), field.getUnitOther()));
			return v;
		} catch (Exception x) {
			return null;
		}

	}

}
