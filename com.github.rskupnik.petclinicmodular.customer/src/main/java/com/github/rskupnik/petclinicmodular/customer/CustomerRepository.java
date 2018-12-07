package com.github.rskupnik.petclinicmodular.customer;

import com.github.rskupnik.petclinicmodular.customer.domain.Customer;

public interface CustomerRepository {

    Customer get(Long id);

    void add(Customer customer);
}
