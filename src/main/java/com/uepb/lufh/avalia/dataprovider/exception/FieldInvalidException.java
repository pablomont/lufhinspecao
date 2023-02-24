package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;


public class FieldInvalidException extends LufhAvaliaException {

    private static final String MESSAGE = "%s field has an invalid value: %s";

    public FieldInvalidException(final String fieldName, final String fieldValue) {
        super(String.format(MESSAGE,fieldName,fieldValue), HttpStatus.BAD_REQUEST);
    }

}
