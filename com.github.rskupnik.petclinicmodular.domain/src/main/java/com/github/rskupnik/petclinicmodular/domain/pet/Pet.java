package com.github.rskupnik.petclinicmodular.domain.pet;

import com.github.rskupnik.petclinicmodular.domain.customer.Customer;

public class Pet {

    private Long id;
    private String name;
    private Customer owner;

    public Pet(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
}
