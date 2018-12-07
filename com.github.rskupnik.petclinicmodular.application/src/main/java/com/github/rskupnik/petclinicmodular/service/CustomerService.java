package com.github.rskupnik.petclinicmodular.service;

import com.github.rskupnik.petclinicmodular.customer.domain.Customer;

import java.util.List;

public interface CustomerService {

    Customer get(long id);

    List<Customer> getAll();

    void add(Customer customer);
}
