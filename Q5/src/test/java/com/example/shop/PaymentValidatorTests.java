package com.example.shop;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PaymentValidatorTests {

    @Test
    void validPaymentMethod_returnsTrue() {
        PaymentValidator validator = new PaymentValidator();

        assertTrue(validator.isPaymentMethodValid("card"));
        assertTrue(validator.isPaymentMethodValid("paypal"));
    }

    @Test
    void unknownPaymentMethod_throwsException() {
        PaymentValidator validator = new PaymentValidator();

        assertThrows(UnsupportedOperationException.class,
                () -> validator.isPaymentMethodValid("banktransfer"));
    }
}