package com.notification.Function;

import com.notification.entities.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Configuration
public class OrderRelatedFunction {

    @Bean
    public Function<Order,String> orderEventReceiver() {
        return  (order -> {
            //logig to send to email and message to user
            System.out.println("Notification Receive from user.");
            logicToSendEmailAndMessageToUser(order.getEmail(),order.getUserPhone());
            return "Order received Successfully. Thank you.";
        });
    }

    private void logicToSendEmailAndMessageToUser(String email, String userPhone) {
        System.out.println("Send email to "+email);
        System.out.println("Send message to "+userPhone);
        System.out.println("Order receive from the user successfully.");
        System.out.println("--------------------");
    }
}
