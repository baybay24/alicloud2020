package com.ali.cloud.seata.feignService;


import com.ali.cloud.seata.entity.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "seata-client-account" )
public interface AccountFeignClient {

    @GetMapping(value = "/account/{userId}")
    public AccountDTO selectAccount (@PathVariable("userId") String userId);


    @GetMapping("/account")
    public int updateAccountMemony(@RequestBody AccountDTO dto);

}
