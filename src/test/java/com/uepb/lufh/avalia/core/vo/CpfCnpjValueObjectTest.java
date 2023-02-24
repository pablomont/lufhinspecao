package com.uepb.lufh.avalia.core.vo;

import com.uepb.lufh.avalia.dataprovider.exception.FieldInvalidException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpfCnpjValueObjectTest {
    @Test
    void testValidCpf() {
        String cpf = "10190673494";
        CpfCnpjValueObject cpfCnpj = new CpfCnpjValueObject(cpf);
        assertTrue(cpfCnpj.isValid(cpf));
    }

    @Test
    void testInvalidCpf() {
        String cpf = "11144477736";
        assertThrows(FieldInvalidException.class, () -> new CpfCnpjValueObject(cpf));

    }

    @Test
    void testValidCnpj() {
        String cnpj = "74329815000155";
        CpfCnpjValueObject cpfCnpj = new CpfCnpjValueObject(cnpj);
        assertTrue(cpfCnpj.isValid(cnpj));
    }

    @Test
    void testInvalidCnpj() {
        String cnpj = "74329815000154";
        assertThrows(FieldInvalidException.class, () -> new CpfCnpjValueObject(cnpj));
    }
}