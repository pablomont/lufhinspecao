package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;

public class RequestEvaluationNotSavedException extends LufhAvaliaException {


    public RequestEvaluationNotSavedException(final String cpfCnpj, final String productId) {
        super(MessageSourceHelper.getInstance().getMessage("error.request.not.saved", cpfCnpj, productId), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}