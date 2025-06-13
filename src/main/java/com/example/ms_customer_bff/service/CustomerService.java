package com.example.ms_customer_bff.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ms_customer_bff.clients.CustomerBsFeignClient;
import com.example.ms_customer_bff.model.dto.CustomerDTO;

@Service
public class CustomerService {

    @Autowired
    CustomerBsFeignClient customerBsFeignClient;

    public List<CustomerDTO> selectAllCustomer(){
        List<CustomerDTO> listaClientes = customerBsFeignClient.selectAllCustomer();
        return listaClientes;
    }

}
