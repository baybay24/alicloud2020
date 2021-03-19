package com.ali.cloud.example.controller;

import com.ali.cloud.example.result.ResultBean;
import com.ali.cloud.example.service.SentinelService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class CircbreakController {

    @Resource
    RestTemplate restTemplate;

    String SERVER_URL = "http://provider-payment";

    @GetMapping(value = "/nacos/payment")
    @SentinelResource(value = "payment", blockHandler = "sourceHandler", blockHandlerClass = SentinelService.class, fallback = "")
    public String testService9002(){
        return restTemplate.getForObject(SERVER_URL+"/nacos/payment" ,String.class);
    }

}
