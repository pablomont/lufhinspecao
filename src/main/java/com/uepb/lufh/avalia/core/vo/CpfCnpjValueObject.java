package com.uepb.lufh.avalia.core.vo;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;


@Getter
@Slf4j
public class CpfCnpjValueObject extends ValueObject{

    private static final String FIELD_NAME = "cpfCnpj";

    private static final String REGEX_CPF_CNPJ = "[^\\d]+";
    private static final String EMPTY_STRING = "";

    public CpfCnpjValueObject(final String value) {
        super(FIELD_NAME, getReplaceAll(value));
    }

    public static String getReplaceAll(final String value) {
        return value.replaceAll(REGEX_CPF_CNPJ, EMPTY_STRING);
    }

    @Override
    protected boolean isValid(final String value) {
        return (isValidCpf(value) || isValidCnpj(value));
    }

    private boolean isValidCnpj(final String value) {
        try {
            new CNPJValidator().assertValid(value);
            return true;
        } catch (InvalidStateException e) {
            log.error("Invalid CPF: {}", value);
            return false;
        }
    }

    private boolean isValidCpf(final String value) {

        try {
            new CPFValidator().assertValid(value);
            return true;
        } catch (InvalidStateException e) {
            log.error("Invalid CNPJ: {}", value);
            return false;
        }
    }

    @Override
    public String toString() {
        return value;
    }

}
