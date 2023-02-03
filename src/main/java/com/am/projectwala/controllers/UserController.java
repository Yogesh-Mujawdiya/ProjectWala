package com.am.projectwala.controllers;

import com.am.projectwala.model.User;
import com.am.projectwala.model.UserDetail;
import com.am.projectwala.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<UserDetail> login(@RequestParam String email, @RequestParam String password) {
        return new ResponseEntity<>(userService.login(email, password), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<UserDetail> signup(@RequestBody UserDetail userDetail, @RequestParam String password) {
        return new ResponseEntity<>(userService.signup(userDetail, password), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<UserDetail> deleteUser(@RequestParam String email) {
        return new ResponseEntity<>(userService.deleteUser(email), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<UserDetail> updateUser(@RequestBody UserDetail userDetail, @RequestParam String password) {
        return new ResponseEntity<>(userService.signup(userDetail, password), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<User> updateUserType(@RequestParam String emailId, String type) {
        return new ResponseEntity<>(userService.setUserType(emailId, type), HttpStatus.OK);
    }

}
