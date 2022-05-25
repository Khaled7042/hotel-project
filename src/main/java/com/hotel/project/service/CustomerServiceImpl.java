package com.hotel.project.service;


import com.hotel.project.model.Customer;
import com.hotel.project.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer (Customer customer){
        Customer customerCreated = customerRepository.save(customer);
        return  customerCreated;
    }
}