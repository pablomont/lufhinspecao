package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;

public class QuestionNotSavedException extends LufhAvaliaException{


    public QuestionNotSavedException() {
        super(MessageSourceHelper.getInstance().getMessage("error.question.not.saved"), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
