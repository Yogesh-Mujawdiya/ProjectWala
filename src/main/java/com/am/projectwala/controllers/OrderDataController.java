package com.am.projectwala.controllers;

import com.am.projectwala.model.OrderData;
import com.am.projectwala.service.impl.OrderDataServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "order")
public class OrderDataController {

    @Autowired
    OrderDataServiceImpl orderDataService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<OrderData>> getOrderByUser(@RequestParam String email) {
        return new ResponseEntity<>(orderDataService.getOrderByUser(email), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<OrderData> addUser(@RequestBody OrderData orderData) {
        return new ResponseEntity<>(orderDataService.addOrUpdateOrder(orderData), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<OrderData> updateUser(@RequestBody OrderData orderData) {
        return new ResponseEntity<>(orderDataService.addOrUpdateOrder(orderData), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<OrderData> deleteOrder(@RequestParam Integer id) {
        return new ResponseEntity<>(orderDataService.deleteOrder(id), HttpStatus.OK);
    }


}
