package com.ali.cloud.seata.controller;

import com.ali.cloud.seata.entity.AccountDTO;
import com.ali.cloud.seata.entity.OrderDTO;
import com.ali.cloud.seata.entity.StorageDTO;
import com.ali.cloud.seata.feignService.AccountFeignClient;
import com.ali.cloud.seata.feignService.StorageFeignClient;
import com.ali.cloud.seata.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class SeataClientOrderController {

    @Resource
    OrderService orderService;

    @Resource
    AccountFeignClient accountFeignClient;

    @Resource
    StorageFeignClient storageFeignClient;

    StorageDTO storageDTO = new StorageDTO();
    AccountDTO accountDTO = new AccountDTO();

    @GlobalTransactional
    @PostMapping(value = "/order")
    int createOrder(@RequestBody OrderDTO orderDTO) {
        log.info("createOrder info ++ "+orderDTO.getCommodityCode()+":"+orderDTO.getCount());
        storageDTO.setCount(orderDTO.getCount());
        storageDTO.setCommodityCode(orderDTO.getCommodityCode());
        storageFeignClient.divStorage(storageDTO);

        accountDTO.setMoney(orderDTO.getMoney());
        accountDTO.setUserId(orderDTO.getUserId());

        accountFeignClient.updateAccountMemony(accountDTO);

       return orderService.createOrder(orderDTO);
    }

}