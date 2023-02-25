package com.uepb.lufh.avalia.dataprovider.exception;

import org.springframework.http.HttpStatus;


public class ProductNotFoundException extends LufhAvaliaException{

    public ProductNotFoundException(final String productId) {
        super(MessageSourceHelper.getInstance().getMessage("error.product.not.found", productId), HttpStatus.NOT_FOUND);
    }

}
