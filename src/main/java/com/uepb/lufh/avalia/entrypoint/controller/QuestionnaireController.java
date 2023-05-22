package com.uepb.lufh.avalia.entrypoint.controller;

import com.uepb.lufh.avalia.entrypoint.contract.api.QuestionnairesApi;
import com.uepb.lufh.avalia.entrypoint.contract.model.Questionnaire;
import org.springframework.http.ResponseEntity;

public class QuestionnaireController implements QuestionnairesApi{


    @Override
    public ResponseEntity<Void> createQuestionaire(final Questionnaire questionnaire) throws Exception {
        return QuestionnairesApi.super.createQuestionaire(questionnaire);
    }

}
