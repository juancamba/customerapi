package com.example.customer.repository;

import com.example.customer.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, String> {
    List<Customer> findByUsername(String username);
    Customer findById(int id);
    void deleteById(int id);




}
