package com.example.ms_customer_bff.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
import com.example.ms_customer_bff.model.dto.CustomerDTO;
import com.example.ms_customer_bff.service.CustomerService;

@RestController
@CrossOrigin("*")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public List<CustomerDTO> selectAllCustomer() {
        return customerService.selectAllCustomer();
    }

}
