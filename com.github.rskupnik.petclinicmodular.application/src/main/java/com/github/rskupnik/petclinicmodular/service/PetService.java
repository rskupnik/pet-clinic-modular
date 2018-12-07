package com.github.rskupnik.petclinicmodular.service;

import com.github.rskupnik.petclinicmodular.pet.domain.Pet;

import java.util.List;

public interface PetService {

    List<Pet> getAll();

    void add(Pet pet);
}
