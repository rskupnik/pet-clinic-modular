package com.github.rskupnik.petclinicmodular.domain.customer;

import com.github.rskupnik.petclinicmodular.domain.pet.Pet;

import java.util.List;

public class Customer {

    private Long id;
    private String firstName, lastName;
    private List<Pet> pets;

    public Customer() {

    }

    public Customer(String firstName, String lastName, List<Pet> pets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pets = pets;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}
