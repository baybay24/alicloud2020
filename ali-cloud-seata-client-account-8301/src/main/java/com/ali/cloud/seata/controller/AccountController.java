package com.ali.cloud.seata.controller;

import com.ali.cloud.seata.entity.AccountDTO;
import com.ali.cloud.seata.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
public class AccountController {

    @Resource
    AccountService accountService;

    @PostMapping("/account")
    public int updateAccountMemony(@RequestBody AccountDTO dto){
        log.info("AccountDTO ———— "+dto);
        return accountService.updateAccountMemony(dto.getUserId(),dto.getMoney());
    }

    @GetMapping("/oneaccount/{userId}")
    @ResponseBody
    public AccountDTO findAccount(@PathVariable("userId") String userId){

        return accountService.selectAccount(userId);
    }
}
