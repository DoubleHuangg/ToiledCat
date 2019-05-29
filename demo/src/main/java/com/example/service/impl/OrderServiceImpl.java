package com.example.service.impl;

import com.example.entity.order.Order;
import com.example.repository.BaseRepository;
import com.example.repository.OrderRepository;
import com.example.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by 一只芬达 on 2019/3/7.
 */
@Service
@Transactional
@Slf4j
public class OrderServiceImpl extends BaseServiceAdapter<Order, String> implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    protected BaseRepository getRepository() {
        return orderRepository;
    }


}
