package com.github.rskupnik.petclinicmodular.pet;

import com.github.rskupnik.petclinicmodular.pet.domain.Pet;

public interface PetRepository {

    Pet get(long id);

    void add(Pet pet);
}
