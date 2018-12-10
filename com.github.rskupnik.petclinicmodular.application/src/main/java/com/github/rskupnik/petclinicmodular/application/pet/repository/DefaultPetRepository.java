package com.github.rskupnik.petclinicmodular.application.pet.repository;

import com.github.rskupnik.petclinicmodular.application.pet.repository.api.PetRepository;
import com.github.rskupnik.petclinicmodular.domain.pet.Pet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultPetRepository implements PetRepository {

    private final Map<Long, Pet> storage = new HashMap<>();

    private long currentId = 0;

    private long nextId() {
        return ++currentId;
    }

    @Override
    public List<Pet> getAll() {
        return List.copyOf(storage.values());
    }

    @Override
    public Pet get(long id) {
        return storage.get(id);
    }

    @Override
    public void add(Pet pet) {
        long id = nextId();
        pet.setId(id);
        storage.put(id, pet);
    }
}
