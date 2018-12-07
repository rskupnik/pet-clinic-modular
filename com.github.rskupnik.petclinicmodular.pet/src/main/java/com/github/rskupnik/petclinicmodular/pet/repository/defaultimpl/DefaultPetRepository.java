package com.github.rskupnik.petclinicmodular.pet.repository.defaultimpl;

import com.github.rskupnik.petclinicmodular.pet.domain.Pet;
import com.github.rskupnik.petclinicmodular.pet.repository.PetRepository;

import java.util.*;

public class DefaultPetRepository implements PetRepository {

    private final Map<Long, Pet> storage = new HashMap<>();

    private long currentId = 0;

    private long nextId() {
        return ++currentId;
    }

    @Override
    public Collection<Pet> getAll() {
        return Collections.unmodifiableCollection(storage.values());
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
