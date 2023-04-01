package com.uepb.lufh.avalia.core.domain.vo;

import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Getter
public class EmailValueObject extends ValueObject{

    private static final String FIELD_NAME = "email";

    private static final String REGEX_EMAIL_RFC_5322 = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

    public EmailValueObject(final String value) {
        super(FIELD_NAME, value);
    }

    @Override
    public boolean isValid(final String value) {

        Pattern pattern = Pattern.compile(REGEX_EMAIL_RFC_5322, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(value);


        return matcher.matches();
    }

    @Override
    public String toString() {
        return value;
    }

}
