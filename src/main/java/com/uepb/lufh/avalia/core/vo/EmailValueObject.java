package com.uepb.lufh.avalia.core.vo;

import lombok.Getter;

@Getter
public class EmailValueObject extends ValueObject{

    private static final String FIELD_NAME = "email";

    public EmailValueObject(final String value) {
        super(FIELD_NAME, value);
    }

    @Override
    protected boolean isValid(final String value) {
        return true;
    }

    @Override
    public String toString() {
        return value;
    }

}
