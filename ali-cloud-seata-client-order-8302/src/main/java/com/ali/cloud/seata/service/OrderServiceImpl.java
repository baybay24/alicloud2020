package com.ali.cloud.seata.service;

import com.ali.cloud.seata.entity.OrderDTO;
import com.ali.cloud.seata.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderMapper orderMapper;



    @Override
    public int createOrder(OrderDTO order) {
        return orderMapper.createOrder(order);
    }
}

