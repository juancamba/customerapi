package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class CustomerController {

    @Autowired
    ICustomerService customerService;

    @PostMapping("/login")
    @ResponseBody
    public String getCustomer(@RequestBody Customer customer)
    {
        return customerService.getCustomer(customer);
    }

    @PostMapping("/addCustomer")
    public void addCustomer(@RequestBody Customer customer)
    {
        customerService.addCustomer(customer);
    }
}
