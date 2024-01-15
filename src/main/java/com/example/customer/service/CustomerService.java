package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public String getCustomer(Customer customer) {
        List<Customer> customers = customerRepository.findByUsername(customer.getUsername());
        if(customer != null && customers.size()>0 )
        {
            return "Success";
        }
        return "Failed";
    }

    @Override
    public void addCustomer(Customer customer) {
        Customer added = customerRepository.save(customer);

    }
}
