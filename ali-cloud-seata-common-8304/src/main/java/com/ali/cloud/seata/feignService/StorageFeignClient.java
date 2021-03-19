package com.ali.cloud.seata.feignService;

import com.ali.cloud.seata.entity.StorageDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "seata-client-storage")
public interface StorageFeignClient {
    @PostMapping("/storage")
    public int divStorage(@RequestBody StorageDTO storageDTO);
}
