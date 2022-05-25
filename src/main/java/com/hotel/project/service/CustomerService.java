package com.hotel.project.service;

import com.hotel.project.model.Customer;

public interface CustomerService {

        Iterable<Customer> findAll();

        Customer createCustomer(Customer customer);
    }

