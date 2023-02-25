package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;


public class NotFoundException extends LufhAvaliaException{

    private static final String MESSAGE = "%s not found with value: %s";

    public NotFoundException(final String domainName, final String domainValue) {
        super(String.format(MESSAGE,domainName,domainValue), HttpStatus.NOT_FOUND);
    }

}
