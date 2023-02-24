package com.uepb.lufh.avalia.core.vo;

import com.uepb.lufh.avalia.dataprovider.exception.FieldInvalidException;

public abstract class ValueObject {

    protected String value;
    protected String fieldName;

    protected abstract boolean isValid(String value);

    protected ValueObject(final String value, final String fieldName) {
        this.value = value;
        this.fieldName = fieldName;

        if(!isValid(value)){
            throw new FieldInvalidException(fieldName,value);
        }
    }

}
