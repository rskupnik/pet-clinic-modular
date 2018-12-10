module com.github.rskupnik.petclinicmodular.service {
    requires com.github.rskupnik.petclinicmodular.domain;

    exports com.github.rskupnik.petclinicmodular.application.customer.service;
    exports com.github.rskupnik.petclinicmodular.application.customer.repository.api;
    exports com.github.rskupnik.petclinicmodular.application.pet.service;
}