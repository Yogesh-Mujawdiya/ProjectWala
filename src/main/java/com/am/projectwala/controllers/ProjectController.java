package com.am.projectwala.controllers;

import com.am.projectwala.model.Project;
import com.am.projectwala.service.impl.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "project")
public class ProjectController {

    @Autowired
    ProjectServiceImpl projectService;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Project>> get(){
        return new ResponseEntity<>(projectService.getAllProject(), HttpStatus.OK);
    }


    @RequestMapping(value = "{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<Project> updateData(@PathVariable int id, @RequestBody Project project){
        project.setId(id);
        return new ResponseEntity<>(projectService.updateAndInsertProject(project), HttpStatus.CREATED);
    }


    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Project> insertData(@RequestBody Project project){
        return new ResponseEntity<>(projectService.updateAndInsertProject(project), HttpStatus.CREATED);
    }


    @RequestMapping(value = "/verify/{id}", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Project> verify(@PathVariable long id, @RequestParam boolean verify){
        return new ResponseEntity<>(projectService.verifyProject(id, verify), HttpStatus.OK);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Project> delete(@PathVariable long id){
        return new ResponseEntity<>(projectService.deleteProject(id), HttpStatus.OK);
    }


}
