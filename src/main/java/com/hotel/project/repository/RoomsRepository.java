package com.hotel.project.repository;

import com.hotel.project.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends CrudRepository<Customer, Long> {
}
