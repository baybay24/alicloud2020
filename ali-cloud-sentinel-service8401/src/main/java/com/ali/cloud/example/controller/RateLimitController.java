package com.ali.cloud.example.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RateLimitController {

    @GetMapping(value = "/testC")
    @SentinelResource(value = "testC", blockHandler = "testChandler")
    public String testC(@RequestParam(value = "v1", required = false)String v1, @PathVariable(value = "v2", required = false)String v2){
        return "testC";
    }

    public String testChandler(String v1, String v2, BlockException exception){
        return "testChandler";
    }
}
