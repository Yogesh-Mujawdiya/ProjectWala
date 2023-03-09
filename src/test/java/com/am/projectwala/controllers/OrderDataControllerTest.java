package com.am.projectwala.controllers;

import com.am.projectwala.model.OrderData;
import com.am.projectwala.service.impl.OrderDataServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class OrderDataControllerTest {

    @Mock
    OrderDataServiceImpl orderDataService;

    @InjectMocks
    OrderDataController orderDataController;

    @Test
    void getOrderByUser() {
        assertNotNull(orderDataController.getOrderByUser("123"));
    }

    @Test
    void addUser() {
        assertNotNull(orderDataController.addUser(new OrderData()));
    }

    @Test
    void updateUser() {
        assertNotNull(orderDataController.updateUser(new OrderData()));
    }

    @Test
    void deleteOrder() {
        assertNotNull(orderDataController.deleteOrder(123));
    }
}