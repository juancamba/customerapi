package com.example.customer.service;

import com.example.customer.model.Customer;

public interface ICustomerService {

    public String getCustomer(Customer customer);

    void addCustomer(Customer customer);
}
