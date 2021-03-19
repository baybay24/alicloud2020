package com.ali.cloud.seata.mapper;

import com.ali.cloud.seata.entity.OrderDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {

    int createOrder(OrderDTO dto);
}
