package com.github.rskupnik.petclinicmodular.customer.repository;

import com.github.rskupnik.petclinicmodular.customer.domain.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> getAll();

    Customer get(Long id);

    void add(Customer customer);
}
