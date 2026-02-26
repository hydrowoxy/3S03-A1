package com.example.shop;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class OrderTests {

    @Test
    void addItem_whenCreated_addsItemSuccessfully() {
        Order order = new Order();
        OrderItem item = new OrderItem("Book", 2, 10.0);

        order.addItem(item);

        assertEquals(1, order.getItems().size());
        assertEquals(OrderStatus.CREATED, order.getStatus());
    }

    @Test
    void addItem_whenNotCreated_throwsException() {
        Order order = new Order();
        order.setStatus(OrderStatus.PAID);

        OrderItem item = new OrderItem("Pen", 1, 5.0);

        assertThrows(IllegalStateException.class,
                () -> order.addItem(item));
    }
}