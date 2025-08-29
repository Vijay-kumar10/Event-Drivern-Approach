package com.orderservice.service;

import com.orderservice.entities.Order;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    public Order createOrder() {
    Order order= new Order();
    order.setOrderId(UUID.randomUUID().toString());
    order.setUserId("10");
    order.setEmail("Vijay@gmail.com");
    order.setUserPhone("7498433555");
    order.setCourseId(UUID.randomUUID().toString());
    return order;

    }


}
