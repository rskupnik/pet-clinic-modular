package com.github.rskupnik.petclinicmodular.application.customer.service;

import com.github.rskupnik.petclinicmodular.application.customer.repository.api.CustomerRepository;
import com.github.rskupnik.petclinicmodular.application.customer.service.api.CustomerService;
import com.github.rskupnik.petclinicmodular.domain.customer.Customer;

import java.util.List;

public class DefaultCustomerService implements CustomerService {

    private final CustomerRepository customerRepository;

    public DefaultCustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer get(long id) {
        return customerRepository.get(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }
}
