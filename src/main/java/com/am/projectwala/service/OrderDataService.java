package com.am.projectwala.service;

import com.am.projectwala.model.OrderData;

import java.util.List;

public interface OrderDataService {

    List<OrderData> getOrderByUser(String emailId);

    OrderData addOrUpdateOrder(OrderData orderData);

    OrderData deleteOrder(Integer id);
}
