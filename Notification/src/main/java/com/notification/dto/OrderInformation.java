package com.notification.dto;

import lombok.Data;

import java.util.Date;

@Data
public class OrderInformation {

    private String orderId;
    private String userId;
    private String userName;
    private Date createdDate;
    private String price;
    private String email;
    private String phone;
}
