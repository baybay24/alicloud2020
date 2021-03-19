package com.ali.cloud.seata;


import com.ali.cloud.seata.entity.AccountDTO;
import com.ali.cloud.seata.service.AccountService;
import org.junit.Assert;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;


@SpringBootTest(classes = SeataClientAccount.class)
public class SeataClientAccountDTOTest {
    @Autowired
    AccountService service;

    @ParameterizedTest
    @ValueSource(strings  = "1")
    public void findAccount(String string){
        System.out.println("findAccount");

        Assert.assertNotEquals(null, AccountDTO.class,service.selectAccount(string));
    }

    @ParameterizedTest
    @CsvSource("'1',100.0")
    public void updateAccount(String string, BigDecimal doubles){
        Assert.assertNotEquals(null,Integer.class,service.updateAccountMemony(string,doubles));
    }

}
