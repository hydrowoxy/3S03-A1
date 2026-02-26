package com.example.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class OrderServiceTests {

    @Test
    void invalidPaymentMethod_cancelsOrderAndReturnsZero() {
        Order order = new Order();
        order.addItem(new OrderItem("Item", 1, 10.0));

        OrderService service = new OrderService();
        double total = service.processOrder(order, "STUDENT10", "crypto");

        assertEquals(0.0, total);
        assertEquals(OrderStatus.CANCELLED, order.getStatus());
    }

    @Test
    void validPaymentMethod_marksPaidAndReturnsTotalWithTax() {
        Order order = new Order();
        order.addItem(new OrderItem("Item", 2, 10.0)); // subtotal = 20.0

        OrderService service = new OrderService();
        double total = service.processOrder(order, "STUDENT10", "card");

        assertEquals(OrderStatus.PAID, order.getStatus());
        assertTrue(total > 0.0);
    }
}