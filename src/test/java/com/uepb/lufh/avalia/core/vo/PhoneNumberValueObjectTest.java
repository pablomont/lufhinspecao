package com.uepb.lufh.avalia.core.vo;

import com.uepb.lufh.avalia.core.domain.vo.EmailValueObject;
import com.uepb.lufh.avalia.core.domain.vo.PhoneNumberValueObject;
import com.uepb.lufh.avalia.dataprovider.exception.FieldInvalidException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PhoneNumberValueObjectTest {
    @Test
    void testValidPhoneNumber() {
        String phoneNumber = "(83)98623-5856";
        PhoneNumberValueObject phoneNumberValueObject = new PhoneNumberValueObject(phoneNumber);
        assertTrue(phoneNumberValueObject.isValid(phoneNumber));
    }

    @Test
    void testInvalidPhoneNumber() {
        String phoneNumber = "9998623-5856";
        assertThrows(FieldInvalidException.class, () -> new EmailValueObject(phoneNumber));

    }

}
