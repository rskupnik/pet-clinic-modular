package com.github.rskupnik.petclinicmodular.application

import com.github.rskupnik.petclinicmodular.application.customer.repository.DefaultCustomerRepository
import com.github.rskupnik.petclinicmodular.application.customer.service.DefaultCustomerService
import com.github.rskupnik.petclinicmodular.application.customer.service.api.CustomerService
import com.github.rskupnik.petclinicmodular.application.pet.repository.DefaultPetRepository
import com.github.rskupnik.petclinicmodular.application.pet.service.DefaultPetService
import com.github.rskupnik.petclinicmodular.domain.customer.Customer
import com.github.rskupnik.petclinicmodular.domain.pet.Pet
import spock.lang.Specification

class ApplicationSpec extends Specification {

    def "should store and retrieve a customer with a list of pets"() {
        given:
        def app = createCustomerService()
        def customer = new Customer("John", "Smith", [new Pet("Barry")])

        when:
        app.add(customer)
        def retrievedCustomer = app.get(1L)

        then:
        retrievedCustomer != null
        retrievedCustomer.firstName == customer.firstName
        retrievedCustomer.lastName == customer.lastName
        retrievedCustomer.pets != null && !retrievedCustomer.pets.isEmpty()
        retrievedCustomer.pets.get(0).name == customer.pets.get(0).name
    }

    def createCustomerService() {
        return new DefaultCustomerService(new DefaultCustomerRepository(), new DefaultPetService(new DefaultPetRepository()))
    }
}
