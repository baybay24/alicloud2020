package example.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SentinelServiceController {
    @SentinelResource(value = "/testA")
    @GetMapping("/testA")
    public String getService_A(){
        return "Service_A";
    }

    @GetMapping("/testB")
    public String getService_B(){
        return "Service_B";
    }
}
