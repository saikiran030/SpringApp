package com.learning.springapp.service;

import com.learning.springapp.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    public List<Customer> listAll() {
        List<Customer> ll = new ArrayList<>();
        Customer c= new Customer();
        c.setAddress("dfds");
        c.setCustid(2);
        c.setName("dsfsd");
        ll.add(c);
        return ll;
    }
}
