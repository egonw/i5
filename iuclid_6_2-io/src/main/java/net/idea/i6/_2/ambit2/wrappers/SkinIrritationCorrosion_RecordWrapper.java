package net.idea.i6._2.ambit2.wrappers;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinirritationcorrosion._2.ENDPOINTSTUDYRECORDSkinIrritationCorrosion;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinirritationcorrosion._2.ENDPOINTSTUDYRECORDSkinIrritationCorrosion.ResultsAndDiscussion.InVivo.Results.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class SkinIrritationCorrosion_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDSkinIrritationCorrosion> {

	public SkinIrritationCorrosion_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	protected String dictionaryParams(String key) {
		if (I5CONSTANTS.cSpecies.equals(key)) return key;
		else return super.dictionaryParams(key);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDSkinIrritationCorrosion studyrecord) {

		if (studyrecord.getResultsAndDiscussion().getInVivo() != null) {
			for (Entry e : studyrecord.getResultsAndDiscussion().getInVivo().getResults().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
				effect.setEndpoint(p2Value(e.getParameter()));
				q2effectrecord(e.getScore(), effect);
				papp.addEffect(effect);

				effect.getConditions().put(I5CONSTANTS.cBasisForEffect, p2Value(e.getBasis()));
				effect.getConditions().put(I5CONSTANTS.cReversibility, p2Value(e.getReversibility()));
				effect.getConditions().put(I5CONSTANTS.cTimePoint, p2Value(e.getTimePoint()));
				try {
					effect.getConditions().put(I5CONSTANTS.cMaxScore, p2Value(e.getScale().intValue()));
				} catch (Exception x) {
				}
			}
			((IParams) papp.getParameters()).put(I5CONSTANTS.cTypeMethod, "in vivo");
		}	
		if (studyrecord.getResultsAndDiscussion().getInVitro() != null) {
			for (eu.europa.echa.iuclid6.namespaces.endpoint_study_record_skinirritationcorrosion._2.ENDPOINTSTUDYRECORDSkinIrritationCorrosion.ResultsAndDiscussion.InVitro.Results.Entry e : studyrecord
					.getResultsAndDiscussion().getInVitro().getResults().getEntry()) {
				EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();

				effect.setEndpoint(p2Value(e.getIrritationCorrosionParameter()));
				q2effectrecord(e.getValue(), effect);
				papp.addEffect(effect);
			}
			((IParams) papp.getParameters()).put(I5CONSTANTS.cTypeMethod, "in vitro");
		}	
	}
}
