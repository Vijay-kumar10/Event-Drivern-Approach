package com.orderservice.Controller;

import com.orderservice.entities.Order;
import com.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public ResponseEntity<?> createOrder(){
        //Order create logic
        Order order = orderService.createOrder();
//Send notification to the Notification Service: So that notification Service send the email to user.
        orderCreatedNotification(order);
        return ResponseEntity.ok("Order created");
    }

    //Stream bridge predefined class
    @Autowired
    private StreamBridge streamBridge;


    private void orderCreatedNotification(Order order) {
        //logic to send notification to Notification service
       Boolean send =  streamBridge.send("orderCreatedEvent-out-0",order);
       if(send){
           System.out.println("Order Success event is successfully send to notification service.");
       }else{
           System.out.println("Order event fail !!");
       }
    }



    @GetMapping("/get")
    public ResponseEntity<?> getOrder(){
        System.out.println("get order");
        return ResponseEntity.ok("Order retrieved");
    }


}
