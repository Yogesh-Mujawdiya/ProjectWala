package com.am.projectwala.service.impl;

import com.am.projectwala.model.OrderData;
import com.am.projectwala.repositories.OrderDataRepository;
import com.am.projectwala.service.OrderDataService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class OrderDataServiceImpl implements OrderDataService {

    @Autowired
    OrderDataRepository orderDataRepository;

    @Override
    public List<OrderData> getOrderByUser(String emailId) {
        return orderDataRepository.findByEmailIdOrderByDateTimeDesc(emailId);
    }

    @Override
    public OrderData addOrUpdateOrder(OrderData orderData) {
        return orderDataRepository.save(orderData);
    }

    @Override
    public OrderData deleteOrder(Integer id) {
        Optional<OrderData> orderDataOptional = orderDataRepository.findById(id);
        if (orderDataOptional.isEmpty()) return null;
        orderDataRepository.deleteById(id);
        return orderDataOptional.get();
    }
}
