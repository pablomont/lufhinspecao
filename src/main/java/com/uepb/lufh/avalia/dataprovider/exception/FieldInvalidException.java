package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;


public class FieldInvalidException extends LufhAvaliaException {

    public FieldInvalidException(final String fieldName, final String fieldValue) {
        super(MessageSourceHelper.getInstance().getMessage("error.field.invalid",fieldName,fieldValue), HttpStatus.BAD_REQUEST);
    }
}
