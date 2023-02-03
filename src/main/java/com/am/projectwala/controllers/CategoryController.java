package com.am.projectwala.controllers;

import com.am.projectwala.model.Categories;
import com.am.projectwala.service.impl.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "category")
public class CategoryController {

    @Autowired
    CategoryServiceImpl categoryService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<Categories>> getOrderByUser() {
        return new ResponseEntity<>(categoryService.getCategories(), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<Categories> addUser(@RequestBody Categories categories) {
        return new ResponseEntity<>(categoryService.insertOrUpdateCategory(categories), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<Categories> updateUser(@RequestBody Categories categories) {
        return new ResponseEntity<>(categoryService.insertOrUpdateCategory(categories), HttpStatus.OK);
    }

    @RequestMapping(value = "", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<Categories> deleteOrder(@RequestParam Integer id) {
        return new ResponseEntity<>(categoryService.deleteCategory(id), HttpStatus.OK);
    }


}
