package com.example.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OrderStatusTests {

    @Test
    void enumContainsExpectedValues() {
        OrderStatus[] statuses = OrderStatus.values();

        assertEquals(3, statuses.length);
        assertEquals(OrderStatus.CREATED, statuses[0]);
        assertEquals(OrderStatus.PAID, statuses[1]);
        assertEquals(OrderStatus.CANCELLED, statuses[2]);
    }

    @Test
    void valueOfReturnsCorrectEnumConstant() {
        OrderStatus status = OrderStatus.valueOf("PAID");

        assertEquals(OrderStatus.PAID, status);
    }
}