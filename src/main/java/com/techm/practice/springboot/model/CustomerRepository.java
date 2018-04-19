package com.techm.practice.springboot.model;

import java.util.List;

import com.techm.practice.springboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
    List<Customer> findById(long id);
}