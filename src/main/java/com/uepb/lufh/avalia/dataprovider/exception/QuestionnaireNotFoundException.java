package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;

public class QuestionnaireNotFoundException extends LufhAvaliaException{

    public QuestionnaireNotFoundException(final Long id) {
        super(MessageSourceHelper.getInstance().getMessage("error.questionnaire.not.found", id), HttpStatus.NOT_FOUND);
    }

}
