package com.github.rskupnik.petclinicmodular.application.customer.repository;

import com.github.rskupnik.petclinicmodular.application.customer.repository.api.CustomerRepository;
import com.github.rskupnik.petclinicmodular.application.shared.repository.InMemoryRepository;
import com.github.rskupnik.petclinicmodular.domain.customer.Customer;

import java.util.List;

public class DefaultCustomerRepository extends InMemoryRepository<Customer> implements CustomerRepository {

    @Override
    public List<Customer> getAll() {
        return super.getAll();
    }

    @Override
    public Customer get(Long id) {
        return super.get(id);
    }

    @Override
    public void add(Customer customer) {
        customer.setId(super.store(customer));
    }
}
