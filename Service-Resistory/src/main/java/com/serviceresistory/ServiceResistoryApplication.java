package com.serviceresistory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceResistoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceResistoryApplication.class, args);
    }

}
