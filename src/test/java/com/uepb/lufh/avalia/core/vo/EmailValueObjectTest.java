package com.uepb.lufh.avalia.core.vo;

import com.uepb.lufh.avalia.core.domain.vo.EmailValueObject;
import com.uepb.lufh.avalia.dataprovider.exception.FieldInvalidException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmailValueObjectTest {
    @Test
    void testValidEmail() {
        String email = "pablouepb@gmail.com";
        EmailValueObject emailValueObject = new EmailValueObject(email);
        assertTrue(emailValueObject.isValid(email));
    }

    @Test
    void testInvalidEmail() {
        String email = "pablouepb.com";
        assertThrows(FieldInvalidException.class, () -> new EmailValueObject(email));

    }

}
