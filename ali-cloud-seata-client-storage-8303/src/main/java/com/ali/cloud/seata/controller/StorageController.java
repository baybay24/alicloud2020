package com.ali.cloud.seata.controller;

import com.ali.cloud.seata.entity.StorageDTO;
import com.ali.cloud.seata.service.StorageService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class StorageController {

    @Resource
    StorageService storageService;

    @PostMapping("/storage")
    public int divStorage(@RequestBody StorageDTO storageDTO){
        return storageService.divStorage(storageDTO);
    }
}
