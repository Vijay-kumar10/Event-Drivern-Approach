package com.notification.entities;
import lombok.Data;

@Data
public class Order {
    private String orderId;
    private String userId;
    private String email;
    private String userPhone;
    private Boolean orderPaymentStatus=false;
    private Boolean orderStatus=false;
    private String courseId;
}

