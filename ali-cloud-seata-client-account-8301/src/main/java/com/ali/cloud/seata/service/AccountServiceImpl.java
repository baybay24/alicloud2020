package com.ali.cloud.seata.service;


import com.ali.cloud.seata.entity.AccountDTO;
import com.ali.cloud.seata.mapper.AccountMapper;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
@GlobalTransactional
public class AccountServiceImpl implements AccountService{

    @Resource
    AccountMapper accountMapper;

    @Override
    public int updateAccountMemony(String userId, BigDecimal money) {
        return accountMapper.updateAccountMemony(userId,money);
    }

    public AccountDTO selectAccount(String userId) {

        return accountMapper.selectAccount(userId);
    }
}
