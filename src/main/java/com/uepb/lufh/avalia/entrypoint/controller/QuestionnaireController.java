package com.uepb.lufh.avalia.entrypoint.controller;

import com.uepb.lufh.avalia.entrypoint.contract.api.QuestionnairesApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.QuestionnaireInput;
import org.springframework.http.ResponseEntity;

public class QuestionnaireController implements QuestionnairesApi{

    @Override
    public ResponseEntity<Void> createQuestionaire(final QuestionnaireInput questionnaireInput) throws Exception {
        return QuestionnairesApi.super.createQuestionaire(questionnaireInput);
    }

}
