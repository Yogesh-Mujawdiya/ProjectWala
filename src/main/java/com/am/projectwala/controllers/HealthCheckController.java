package com.am.projectwala.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class HealthCheckController {


    @RequestMapping(value = "/health", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> getOrderByUser() {
        return new ResponseEntity<>("API is up and running", HttpStatus.OK);
    }

}
