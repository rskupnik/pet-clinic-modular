package com.github.rskupnik.petclinicmodular.service.defaultimpl;

import com.github.rskupnik.petclinicmodular.customer.domain.Customer;
import com.github.rskupnik.petclinicmodular.customer.repository.CustomerRepository;
import com.github.rskupnik.petclinicmodular.service.CustomerService;

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
