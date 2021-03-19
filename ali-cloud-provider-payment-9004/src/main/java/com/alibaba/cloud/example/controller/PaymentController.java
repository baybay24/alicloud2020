package com.alibaba.cloud.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentController {
    @Value("${server.port}")
    String port ;

    @GetMapping(value = "/nacos/payment")
    public String getPayment(){
        return UUID.randomUUID().toString().substring(1,5)+" nacos provider endpoint port: "+port ;
    }
}
