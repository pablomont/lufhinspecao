package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;

import java.util.List;

public class QuestionsNotFoundException extends LufhAvaliaException{

    public QuestionsNotFoundException(List<Long> questionIds) {
        super(MessageSourceHelper.getInstance().getMessage("error.questions.not.found", questionIds), HttpStatus.NOT_FOUND);
    }

}
