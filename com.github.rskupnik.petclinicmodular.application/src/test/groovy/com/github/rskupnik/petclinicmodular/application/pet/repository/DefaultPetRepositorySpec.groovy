package com.github.rskupnik.petclinicmodular.application.pet.repository

import com.github.rskupnik.petclinicmodular.domain.pet.Pet
import spock.lang.Specification

class DefaultPetRepositorySpec extends Specification {

    def "should store and retrieve entity"() {
        given:
        def repository = new DefaultPetRepository()
        def storedPet = new Pet("Barry")

        when:
        repository.add(storedPet)
        def pet = repository.get(1L);

        then:
        pet != null
        pet.name == storedPet.name
    }

    def "should retrieve null if entity not found"() {
        given:
        def repository = new DefaultPetRepository()

        when:
        def pet = repository.get(1L);

        then:
        pet == null
    }

    def "should retrieve all entities"() {
        given:
        def repository = new DefaultPetRepository()
        def pets = [new Pet("Barry"), new Pet("Larry")]

        when:
        pets.each {c -> repository.add(c)}
        def retrievedPets = repository.getAll()

        then:
        pets.size() == retrievedPets.size()
    }
}
