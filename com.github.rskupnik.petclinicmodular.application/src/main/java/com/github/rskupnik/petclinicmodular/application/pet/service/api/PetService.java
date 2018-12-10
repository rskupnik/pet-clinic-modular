package com.github.rskupnik.petclinicmodular.application.pet.service.api;

import com.github.rskupnik.petclinicmodular.application.pet.repository.api.PetRepository;
import com.github.rskupnik.petclinicmodular.application.pet.service.DefaultPetService;
import com.github.rskupnik.petclinicmodular.domain.pet.Pet;

import java.util.List;

public interface PetService {

    List<Pet> getAll();

    void add(Pet pet);

    static PetService defaultService(PetRepository repository) {
        return new DefaultPetService(repository);
    }
}
