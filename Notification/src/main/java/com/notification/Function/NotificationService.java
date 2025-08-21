package com.notification.Function;
import com.notification.dto.OrderInformation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class NotificationService {

    @Bean
    public Supplier<String> testing(){
        return () -> "this is a testing";
    }

    @Bean
    public Function<String, String> hello(){
        return (message)-> "how are you ? "+message;
    }

    @Bean
    public Function<OrderInformation,String> orderNotification(){
            return orderInformation ->{
                sendNotification(orderInformation);
                System.out.println(orderInformation.getEmail());
                System.out.println(orderInformation.getOrderId());
                System.out.println(orderInformation.getPrice());
                System.out.println(orderInformation.getCreatedDate());
                return orderInformation.getUserId();
            };
    }

    private void sendNotification(OrderInformation orderInformation) {
    }
}
