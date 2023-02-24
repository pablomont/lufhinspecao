package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;


public class ProductNotFoundException extends LufhAvaliaException{

    public ProductNotFoundException(final String message) {
        super(message, HttpStatus.NOT_FOUND);
    }

}
