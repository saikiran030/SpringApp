package com.learning.springapp.controller;

import com.learning.springapp.entity.Customer;
import com.learning.springapp.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    @Autowired
    private CustomerService service;
    @GetMapping
    public List<Customer> list() {
        System.out.println("List");
        return service.listAll();
    }

    @GetMapping("list/")
    public ResponseEntity<List<Customer>> list1() {
        System.out.println("List1");
        return new ResponseEntity<List<Customer>>(service.listAll(), HttpStatus.OK);
    }
}
