package com.ali.cloud.example.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

import static sun.misc.Version.println;

@Service
public class SentinelService {
    @SentinelResource(value = "source", blockHandler = "sourceHandler")
    public String source(String str){
     
        return "Source--"+str;
    }

    public String sourceHandler(){
        return "sourceHandler";
    }
}
