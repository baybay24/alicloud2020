package com.ali.cloud.seata.service;


import com.ali.cloud.seata.entity.AccountDTO;

import java.math.BigDecimal;

public interface AccountService {
    public int updateAccountMemony(String userId , BigDecimal money);

    public AccountDTO selectAccount(String userId);
}
