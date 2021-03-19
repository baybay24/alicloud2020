package com.ali.cloud.example.controller;

import com.ali.cloud.example.service.SentinelService;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController

public class SentinelServiceController {
    @Autowired
    SentinelService service;

    @GetMapping("/testA")
    public String getService_A(){

        try{
            TimeUnit.MILLISECONDS.sleep(300);

            return service.source("Service_A");
        }catch (InterruptedException e){
            return null;
        }

    }

    @GetMapping("/testB")
    public String getService_B() {

        return service.source("Service_B");

    }


}
