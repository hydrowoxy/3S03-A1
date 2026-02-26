package com.example.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class DiscountServiceTests {

    private final DiscountService service = new DiscountService();

    @Test
    void studentDiscount_appliesCorrectPercentage() {
        double result = service.applyDiscount(200.0, "STUDENT10");
        assertEquals(180.0, result);
    }

    @Test
    void invalidDiscount_throwsException() {
        assertThrows(IllegalArgumentException.class,
                () -> service.applyDiscount(100.0, "INVALID"));
    }
}