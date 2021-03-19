package com.ali.cloud.seata.service;


import com.ali.cloud.seata.entity.OrderDTO;



public interface OrderService {
    public int createOrder(OrderDTO order);

}
