package com.am.projectwala.controllers;

import com.am.projectwala.model.Notification;
import com.am.projectwala.service.impl.NotificationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "notification")
public class NotificationController {

    @Autowired
    NotificationServiceImpl notificationService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Notification>> getOrderByUser(@RequestParam String email) {
        return new ResponseEntity<>(notificationService.getNotificationByUser(email), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Notification> addUser(@RequestBody Notification notification) {
        return new ResponseEntity<>(notificationService.addNotification(notification), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Notification> deleteOrder(@RequestParam Integer id) {
        return new ResponseEntity<>(notificationService.deleteNotification(id), HttpStatus.OK);
    }

}
