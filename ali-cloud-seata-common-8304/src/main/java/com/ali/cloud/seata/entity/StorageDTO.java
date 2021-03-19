package com.ali.cloud.seata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StorageDTO {
    private int id;
    private String commodityCode;
    private int count;
}
