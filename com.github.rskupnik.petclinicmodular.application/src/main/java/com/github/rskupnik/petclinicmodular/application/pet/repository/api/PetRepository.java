package com.github.rskupnik.petclinicmodular.application.pet.repository.api;

import com.github.rskupnik.petclinicmodular.application.pet.repository.DefaultPetRepository;
import com.github.rskupnik.petclinicmodular.domain.pet.Pet;

import java.util.List;

public interface PetRepository {

    List<Pet> getAll();

    Pet get(long id);

    void add(Pet pet);

    static PetRepository defaultRepository() {
        return new DefaultPetRepository();
    }
}
