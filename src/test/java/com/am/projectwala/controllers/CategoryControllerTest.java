package com.am.projectwala.controllers;

import com.am.projectwala.model.Categories;
import com.am.projectwala.service.CategoryService;
import com.am.projectwala.service.impl.CategoryServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class CategoryControllerTest {

    @Mock
    CategoryServiceImpl categoryService;

    @InjectMocks
    CategoryController categoryController;

    @Test
    void getOrderByUser() {
        assertNotNull(categoryController.getOrderByUser());
    }

    @Test
    void addUser() {

        assertNotNull(categoryController.addUser(new Categories()));
    }

    @Test
    void updateUser() {
        assertNotNull(categoryController.updateUser(new Categories()));
    }

    @Test
    void deleteOrder() {
        assertNotNull(categoryController.deleteOrder(12));
    }
}