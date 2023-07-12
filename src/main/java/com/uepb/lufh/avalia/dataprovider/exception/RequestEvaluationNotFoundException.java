package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;

public class RequestEvaluationNotFoundException extends LufhAvaliaException {

    public RequestEvaluationNotFoundException(final Long id) {
        super(MessageSourceHelper.getInstance().getMessage("error.request.evaluation.not.found", id), HttpStatus.NOT_FOUND);
    }

}
