package com.am.projectwala.controllers;

import com.am.projectwala.model.Notification;
import com.am.projectwala.service.impl.NotificationServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class NotificationControllerTest {

    @Mock
    NotificationServiceImpl notificationService;

    @InjectMocks
    NotificationController notificationController;

    @Test
    void getOrderByUser() {
        assertNotNull(notificationController.getOrderByUser("1234"));
    }

    @Test
    void addUser() {
        assertNotNull(notificationController.addUser(new Notification()));
    }

    @Test
    void deleteOrder() {
        assertNotNull(notificationController.deleteOrder(12));
    }
}