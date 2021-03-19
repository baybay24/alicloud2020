package com.ali.cloud.seata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.ali.cloud.seata.mapper")
public class SeataClientStorage {
    public static void main(String[] args) {
        SpringApplication.run(SeataClientStorage.class,args);
    }
}
