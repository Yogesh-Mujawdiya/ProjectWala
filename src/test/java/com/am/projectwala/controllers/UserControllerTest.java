package com.am.projectwala.controllers;

import com.am.projectwala.model.UserDetail;
import com.am.projectwala.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class UserControllerTest {

    @Mock
    UserServiceImpl userService;

    @InjectMocks
    UserController userController;

    @Test
    void loginUser() {
        assertNotNull(userController.loginUser("123", "123"));
    }

    @Test
    void signupUser() {
        assertNotNull(userController.signupUser(new UserDetail(), "123"));
    }

    @Test
    void deleteUser() {
        assertNotNull(userController.deleteUser("123"));
    }

    @Test
    void updateUser() {
        assertNotNull(userController.updateUser(new UserDetail(), "123"));
    }

    @Test
    void updateUserType() {
        assertNotNull(userController.updateUserType("123", "admin"));
    }
}