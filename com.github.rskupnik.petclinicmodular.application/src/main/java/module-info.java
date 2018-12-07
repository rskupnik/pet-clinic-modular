module com.github.rskupnik.petclinicmodular.application {
    requires transitive com.github.rskupnik.petclinicmodular.pet;

    exports com.github.rskupnik.petclinicmodular.service;
    exports com.github.rskupnik.petclinicmodular.service.defaultimpl;
}