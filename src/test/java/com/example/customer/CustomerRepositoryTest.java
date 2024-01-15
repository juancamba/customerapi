package com.example.customer;

import com.example.customer.model.Customer;
import com.example.customer.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void creteCustomer()
    {
        Customer customer = Customer
                .builder()
                .username("juancamba")
                .email("juancamba@juancamba.com")
                .build();

        Customer customerdb = customerRepository.save(customer);
        assertThat(customerdb.getId()).isNotNull();
        assertThat(customerdb.getUsername()).isEqualTo(customer.getUsername());

    }

}
