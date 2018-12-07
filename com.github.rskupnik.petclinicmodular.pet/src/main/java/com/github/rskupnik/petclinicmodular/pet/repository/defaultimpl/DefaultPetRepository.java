package com.github.rskupnik.petclinicmodular.pet.repository.defaultimpl;

import com.github.rskupnik.petclinicmodular.pet.domain.Pet;
import com.github.rskupnik.petclinicmodular.pet.repository.PetRepository;

import java.util.*;

public class DefaultPetRepository implements PetRepository {

    private final Map<Long, Pet> storage = new HashMap<>();

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
        if (pet.getId() != null) {
            storage.put(pet.getId(), pet);
        }
    }
}
