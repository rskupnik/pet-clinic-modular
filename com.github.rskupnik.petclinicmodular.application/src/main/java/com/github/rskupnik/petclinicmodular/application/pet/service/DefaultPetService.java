package com.github.rskupnik.petclinicmodular.application.pet.service;

import com.github.rskupnik.petclinicmodular.application.pet.repository.api.PetRepository;
import com.github.rskupnik.petclinicmodular.application.pet.service.api.PetService;
import com.github.rskupnik.petclinicmodular.domain.pet.Pet;

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
