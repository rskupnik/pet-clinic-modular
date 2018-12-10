package com.github.rskupnik.petclinicmodular.application.customer.repository;

import com.github.rskupnik.petclinicmodular.application.customer.repository.api.CustomerRepository;
import com.github.rskupnik.petclinicmodular.domain.customer.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultCustomerRepository implements CustomerRepository {

    private final Map<Long, Customer> storage = new HashMap<>();

    private long currentId = 0;

    private long nextId() {
        return ++currentId;
    }

    @Override
    public List<Customer> getAll() {
        return List.copyOf(storage.values());
    }

    @Override
    public Customer get(Long id) {
        return storage.get(id);
    }

    @Override
    public void add(Customer customer) {
        long id = nextId();
        customer.setId(id);
        storage.put(id, customer);
    }
}
