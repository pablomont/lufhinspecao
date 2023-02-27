package com.uepb.lufh.avalia.core.vo;

import lombok.Getter;

@Getter
public class PhoneNumberValueObject extends ValueObject {

    private static final String FIELD_NAME = "phoneNumber";

    public PhoneNumberValueObject(final String value) {
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
