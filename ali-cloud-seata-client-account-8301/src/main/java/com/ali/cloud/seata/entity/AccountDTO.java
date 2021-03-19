package com.ali.cloud.seata.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AccountDTO implements Serializable {
    private Long id;
    private String userId;
    private BigDecimal money;
}
