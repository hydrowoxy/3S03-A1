package com.example.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class PricingServiceTests {

    private final PricingService pricing = new PricingService();

    @Test
    void calculateSubtotal_sumsAllItemTotals() {
        Order order = new Order();
        order.addItem(new OrderItem("A", 2, 10.0)); // 20
        order.addItem(new OrderItem("B", 1, 5.5));  // 5.5

        double subtotal = pricing.calculateSubtotal(order);

        assertEquals(25.5, subtotal, 1e-9);
    }

    @Test
    void calculateTax_negativeSubtotal_throwsException() {
        assertThrows(IllegalArgumentException.class,
                () -> pricing.calculateTax(-0.01));
    }
}