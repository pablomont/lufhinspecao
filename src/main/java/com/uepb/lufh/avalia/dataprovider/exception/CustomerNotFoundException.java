package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;

public class CustomerNotFoundException extends LufhAvaliaException {


    public CustomerNotFoundException(final String cpfCnpj) {
        super(MessageSourceHelper.getInstance().getMessage("error.customer.not.found", cpfCnpj), HttpStatus.NOT_FOUND);
    }

}
