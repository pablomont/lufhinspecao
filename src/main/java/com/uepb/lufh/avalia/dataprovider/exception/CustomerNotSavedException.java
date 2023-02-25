package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;

public class CustomerNotSavedException extends LufhAvaliaException {


    public CustomerNotSavedException(final String cpfCnpj) {
        super(MessageSourceHelper.getInstance().getMessage("error.customer.not.saved", cpfCnpj), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
