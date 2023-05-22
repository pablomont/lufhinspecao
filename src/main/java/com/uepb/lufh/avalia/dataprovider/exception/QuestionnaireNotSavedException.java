package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;

public class QuestionnaireNotSavedException extends LufhAvaliaException{

    public QuestionnaireNotSavedException() {
        super(MessageSourceHelper.getInstance().getMessage("error.questionnaire.not.saved"), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
