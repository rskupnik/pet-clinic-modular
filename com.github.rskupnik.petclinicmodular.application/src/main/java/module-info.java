module com.github.rskupnik.petclinicmodular.application {
    requires transitive com.github.rskupnik.petclinicmodular.pet;
    requires transitive com.github.rskupnik.petclinicmodular.customer;

    exports com.github.rskupnik.petclinicmodular.service;
    exports com.github.rskupnik.petclinicmodular.service.defaultimpl;
}