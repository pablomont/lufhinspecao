package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;

public class ProductNotSavedException extends LufhAvaliaException{

    public ProductNotSavedException(final String productName) {
        super(MessageSourceHelper.getInstance().getMessage("error.product.not.saved", productName), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
