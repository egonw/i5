package net.idea.i6._2.ambit2.wrappers;

import java.util.logging.Level;

import ambit2.base.data.study.EffectRecord;
import ambit2.base.data.study.IParams;
import ambit2.base.data.study.ProtocolApplication;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_generalinformation._2.ENDPOINTSTUDYRECORDGeneralInformation;
import eu.europa.echa.iuclid6.namespaces.endpoint_study_record_generalinformation._2.ENDPOINTSTUDYRECORDGeneralInformation.ResultsAndDiscussion.FormBlock.Entry;
import eu.europa.echa.iuclid6.namespaces.platform_container.v1.Document;
import net.idea.i5.io.I5CONSTANTS;
import net.idea.i6._2.ambit2.EndpointStudyRecordWrapper;

public class GeneralInformation_RecordWrapper
		extends EndpointStudyRecordWrapper<ENDPOINTSTUDYRECORDGeneralInformation> {

	public GeneralInformation_RecordWrapper(Document doc) throws Exception {
		super(doc);
	}

	@Override
	public void assignEffectLevels(ProtocolApplication papp, ENDPOINTSTUDYRECORDGeneralInformation studyrecord) {
		if (studyrecord.getResultsAndDiscussion() == null)
			return;
		StringBuilder physstate = new StringBuilder();
		try {
			if (studyrecord.getResultsAndDiscussion().getSubstancePhysicalState() != null)
				physstate.append(getPhrase(studyrecord.getResultsAndDiscussion().getSubstancePhysicalState().getValue(),
						studyrecord.getResultsAndDiscussion().getSubstancePhysicalState().getOther()));
		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage(), x);
		}
		// TODO move these into separate effectrecords with textvalues
		StringBuilder form = null;

		try {
			for (Entry e : studyrecord.getResultsAndDiscussion().getFormBlock().getEntry()) {
				if (form == null)
					form = new StringBuilder();
				else
					form.append(" ");
				form.append(p2Value(e.getForm().getValue()));
			}

		} catch (Exception x) {
			logger.log(Level.WARNING, x.getMessage(), x);
		}

		EffectRecord<String, IParams, String> effect = endpointCategory.createEffectRecord();
		effect.setEndpoint(physstate == null ? null : physstate.toString());
		effect.getConditions().put(I5CONSTANTS.Remark, form == null ? "" : form.toString());
		papp.addEffect(effect);
	}

	@Override
	public void assignInterpretationResult(ProtocolApplication papp,
			ENDPOINTSTUDYRECORDGeneralInformation studyRecord) {
		try {
			papp.setInterpretationResult(getPhrase(studyRecord.getResultsAndDiscussion().getSubstanceType().getValue(),
					studyRecord.getResultsAndDiscussion().getSubstanceType().getOther()));
		} catch (Exception x) {
			papp.setInterpretationResult("");
		}
	}
}
