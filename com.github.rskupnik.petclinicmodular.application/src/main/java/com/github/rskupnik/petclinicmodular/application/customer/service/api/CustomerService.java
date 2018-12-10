package com.github.rskupnik.petclinicmodular.application.customer.service.api;

import com.github.rskupnik.petclinicmodular.application.customer.repository.api.CustomerRepository;
import com.github.rskupnik.petclinicmodular.application.customer.service.DefaultCustomerService;
import com.github.rskupnik.petclinicmodular.domain.customer.Customer;

import java.util.List;

public interface CustomerService {

    Customer get(long id);

    List<Customer> getAll();

    void add(Customer customer);

    static CustomerService defaultService(CustomerRepository repository) {
        return new DefaultCustomerService(repository);
    }
}
