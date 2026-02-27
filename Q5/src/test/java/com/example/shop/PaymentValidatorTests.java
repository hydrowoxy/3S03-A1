package com.example.shop;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class PaymentValidatorTests {

    private final PaymentValidator validator = new PaymentValidator();

    @Test
    void validPaymentMethod_returnsTrue() {
        assertTrue(validator.isPaymentMethodValid("card"));
        assertTrue(validator.isPaymentMethodValid("paypal"));
    }

    @Test
    void cryptoPayment_returnsFalse() {
        assertFalse(validator.isPaymentMethodValid("crypto"));
    }

    @Test
    void nullPayment_returnsFalse() {
        assertFalse(validator.isPaymentMethodValid(null));
    }

    @Test
    void unknownPaymentMethod_throwsException() {
        assertThrows(UnsupportedOperationException.class,
                () -> validator.isPaymentMethodValid("banktransfer"));
    }
}