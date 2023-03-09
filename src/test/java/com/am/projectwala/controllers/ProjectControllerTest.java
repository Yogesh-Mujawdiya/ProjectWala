package com.am.projectwala.controllers;

import com.am.projectwala.model.Project;
import com.am.projectwala.service.impl.ProjectServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(MockitoJUnitRunner.class)
class ProjectControllerTest {

    @Mock
    ProjectServiceImpl projectService;

    @InjectMocks
    ProjectController projectController;

    @Test
    void get() {
        assertNotNull(projectController.get());
    }

    @Test
    void updateData() {
        assertNotNull(projectController.updateData(123, new Project()));
    }

    @Test
    void insertData() {
        assertNotNull(projectController.insertData(new Project()));
    }

    @Test
    void verify() {
        assertNotNull(projectController.verify(12, true));
    }

    @Test
    void delete() {
        assertNotNull(projectController.delete(123));
    }
}