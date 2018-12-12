package com.github.rskupnik.petclinicmodular.application.shared.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class InMemoryRepository<T> {

    private final Map<Long, T> storage = new HashMap<>();

    private long currentId = 0;

    private long nextId() {
        return ++currentId;
    }

    protected List<T> getAll() {
        return List.copyOf(storage.values());
    }

    protected T get(Long id) {
        return storage.get(id);
    }

    protected long store(T entity) {
        long id = nextId();
        storage.put(id, entity);
        return id;
    }
}
