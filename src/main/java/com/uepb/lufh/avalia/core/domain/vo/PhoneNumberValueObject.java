package com.uepb.lufh.avalia.core.domain.vo;

import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
public class PhoneNumberValueObject extends ValueObject {

    private static final String FIELD_NAME = "phoneNumber";

    private static final String REGEX_PHONE_NUMBER_BRASIL = "^\\(?[1-9]{2}\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$";

    public PhoneNumberValueObject(final String value) {
        super(FIELD_NAME, value);
    }

    @Override
    public boolean isValid(final String value) {

        Pattern pattern = Pattern.compile(REGEX_PHONE_NUMBER_BRASIL, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(value);

        return matcher.matches();
    }

    @Override
    public String toString() {
        return value;
    }

}
