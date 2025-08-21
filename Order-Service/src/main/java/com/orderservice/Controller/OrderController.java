package com.orderservice.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    public ResponseEntity<?> createOrder(){
        return ResponseEntity.ok("Order created");
    }

    @GetMapping("/get")
    public ResponseEntity<?> getOrder(){
        System.out.println("get order");
        return ResponseEntity.ok("Order retrieved");
    }
}
