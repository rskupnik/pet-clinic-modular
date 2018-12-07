package com.github.rskupnik.petclinicmodular.service;

import com.github.rskupnik.petclinicmodular.pet.PetRepository;
import com.github.rskupnik.petclinicmodular.pet.domain.Pet;

import java.util.List;

public class DefaultPetService implements PetService {

    private final PetRepository petRepository;

    public DefaultPetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public List<Pet> getAll() {
        return petRepository.getAll();
    }

    @Override
    public void add(Pet pet) {
        petRepository.add(pet);
    }
}
