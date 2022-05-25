package com.hotel.project.repository;

import com.hotel.project.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends CrudRepository<Customer, Long> {
}
