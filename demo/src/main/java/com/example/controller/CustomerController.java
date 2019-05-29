package com.example.controller;

import com.example.entity.customer.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class CustomerController {
    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/addOrder")
    public Map addOrder(Customer customer){
        Map<String, Object> map = new HashMap<>();
        customerRepository.save(customer);
        map.put("success", true);
        return map;
    }

    @GetMapping("/findOrderById")
    public List<Customer> getOrderByIdOrName(Integer id, String name){
        List<Customer> customers = customerRepository.findByIdOrName(id,name);
        return customers;
    }

}
