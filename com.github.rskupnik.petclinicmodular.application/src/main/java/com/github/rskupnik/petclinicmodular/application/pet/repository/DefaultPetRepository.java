package com.github.rskupnik.petclinicmodular.application.pet.repository;

import com.github.rskupnik.petclinicmodular.application.pet.repository.api.PetRepository;
import com.github.rskupnik.petclinicmodular.application.shared.repository.InMemoryRepository;
import com.github.rskupnik.petclinicmodular.domain.pet.Pet;

import java.util.List;

public class DefaultPetRepository extends InMemoryRepository<Pet> implements PetRepository {

    @Override
    public List<Pet> getAll() {
        return super.getAll();
    }

    @Override
    public Pet get(long id) {
        return super.get(id);
    }

    @Override
    public void add(Pet pet) {
        pet.setId(super.store(pet));
    }
}
