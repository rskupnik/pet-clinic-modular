package com.github.rskupnik.petclinicmodular.pet;

import com.github.rskupnik.petclinicmodular.pet.domain.Pet;

import java.util.List;

public interface PetRepository {

    List<Pet> getAll();

    Pet get(long id);

    void add(Pet pet);
}
