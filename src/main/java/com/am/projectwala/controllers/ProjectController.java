package com.am.projectwala.controllers;

import com.am.projectwala.model.Project;
import com.am.projectwala.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    @RequestMapping(value = "/project", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Project>> get(){
        String s;
        return new ResponseEntity<>(projectRepository.findAll(), HttpStatus.OK);
    }

}
