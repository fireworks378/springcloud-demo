package com.itcast.service;

import com.itcast.entity.Order;
import com.itcast.entity.User;
import com.itcast.feignClients.UserClient;
import com.itcast.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private UserClient userClient;

    public Order queryOrderById(Long orderId) {
        Order order = orderMapper.findById(orderId);
        User user = userClient.getUser(order.getUserId());
        order.setUser(user);
        return order;
    }
}
