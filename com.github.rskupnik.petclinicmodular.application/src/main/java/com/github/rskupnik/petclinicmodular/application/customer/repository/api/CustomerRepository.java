package com.github.rskupnik.petclinicmodular.application.customer.repository.api;

import com.github.rskupnik.petclinicmodular.application.customer.repository.DefaultCustomerRepository;
import com.github.rskupnik.petclinicmodular.domain.customer.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> getAll();

    Customer get(Long id);

    void add(Customer customer);

    static CustomerRepository defaultRepository() {
        return new DefaultCustomerRepository();
    }
}
