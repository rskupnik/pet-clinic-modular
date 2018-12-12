package com.github.rskupnik.petclinicmodular.application.customer.repository

import com.github.rskupnik.petclinicmodular.domain.customer.Customer
import spock.lang.Specification

class DefaultCustomerRepositorySpec extends Specification {

    def "should store and retrieve entity"() {
        given:
        def repository = new DefaultCustomerRepository()
        def storedCustomer = new Customer("John", "Smith", null)

        when:
        repository.add(storedCustomer)
        def customer = repository.get(1L);

        then:
        customer != null
        customer.firstName == storedCustomer.firstName
        customer.lastName == storedCustomer.lastName
    }

    def "should retrieve null if entity not found"() {
        given:
        def repository = new DefaultCustomerRepository()

        when:
        def customer = repository.get(1L);

        then:
        customer == null
    }

    def "should retrieve all entities"() {
        given:
        def repository = new DefaultCustomerRepository()
        def customers = [new Customer("John", "Smith", null), new Customer("Mary", "Jane", null)]

        when:
        customers.each {c -> repository.add(c)}
        def retrievedCustomers = repository.getAll()

        then:
        customers.size() == retrievedCustomers.size()
    }
}
