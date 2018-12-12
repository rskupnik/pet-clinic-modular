package com.github.rskupnik.petclinicmodular.application.customer.service;

import com.github.rskupnik.petclinicmodular.application.customer.repository.api.CustomerRepository;
import com.github.rskupnik.petclinicmodular.application.customer.service.api.CustomerService;
import com.github.rskupnik.petclinicmodular.application.pet.service.api.PetService;
import com.github.rskupnik.petclinicmodular.domain.customer.Customer;
import com.github.rskupnik.petclinicmodular.domain.pet.Pet;

import java.util.List;

public class DefaultCustomerService implements CustomerService {

    private final CustomerRepository customerRepository;
    private final PetService petService;

    public DefaultCustomerService(CustomerRepository customerRepository, PetService petService) {
        this.customerRepository = customerRepository;
        this.petService = petService;
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
        if (customer.getPets() != null && !customer.getPets().isEmpty()) {
            for (Pet pet : customer.getPets()) {
                petService.add(pet);
            }
        }
        customerRepository.add(customer);
    }
}
