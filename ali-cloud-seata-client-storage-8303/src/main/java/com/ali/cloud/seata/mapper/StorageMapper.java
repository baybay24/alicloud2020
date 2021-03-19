package com.ali.cloud.seata.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StorageMapper {

    public int divStorage(@Param("count") int count ,@Param("commodityCode") String commodityCode);

}
