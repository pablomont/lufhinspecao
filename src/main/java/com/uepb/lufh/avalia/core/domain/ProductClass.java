package com.uepb.lufh.avalia.core.domain;

import com.uepb.lufh.avalia.dataprovider.exception.FieldInvalidException;

import java.util.Arrays;

public enum ProductClass {
    CLASS_I("Class I"),
    CLASS_II("Class II"),
    CLASS_III("Class III"),
    CLASS_IV("Class IV");

    private final String className;

    ProductClass(final String className) {
        this.className = className;
    }

    public static ProductClass fromValue(String value) {

        return Arrays.stream(ProductClass.values())
            .filter(productClass -> value.equals(productClass.toString()))
            .findFirst()
            .orElseThrow(() -> new FieldInvalidException("productClass", value));
    }

    @Override
    public String toString() {
        return className;
    }
}
