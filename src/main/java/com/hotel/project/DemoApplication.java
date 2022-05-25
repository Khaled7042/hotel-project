package com.hotel.project;

import com.hotel.project.model.Customer;
import com.hotel.project.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //Customer customer = new Customer("John de Witt","hoptillepad 56",45);
        Customer customer2 = new Customer(0,"John de Witt","hoptillepad 56",45);
        Customer customer = customerRepository.save(customer2);
        System.out.println("ID :"+customer.getId());

    }
}

