package com.ali.cloud.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ConsumerOrderController {
    @Resource
    @LoadBalanced
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String SERVICE_URL;

    @GetMapping(value = "/consumer/nacos/payment")
    public String getRemoteService(){
        return restTemplate.getForObject(SERVICE_URL+"/nacos/payment",String.class);
    }


}
