package com.example.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class OrderItemTests {

    @Test
    void validOrderItem_calculatesTotalPriceCorrectly() {
        OrderItem item = new OrderItem("Notebook", 3, 15.0);

        assertEquals(45.0, item.getTotalPrice());
        assertEquals(3, item.getQuantity());
    }

    @Test
    void zeroQuantity_throwsException() {
        assertThrows(IllegalArgumentException.class,
                () -> new OrderItem("Pen", 0, 5.0));
    }
}