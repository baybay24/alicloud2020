package com.ali.cloud.seata.service;

import com.ali.cloud.seata.entity.StorageDTO;
import com.ali.cloud.seata.mapper.StorageMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService{

    @Resource
    StorageMapper storageMapper;

    @Override
    public int divStorage(StorageDTO storageDTO) {
        return storageMapper.divStorage(storageDTO.getCount(),storageDTO.getCommodityCode());
    }
}
