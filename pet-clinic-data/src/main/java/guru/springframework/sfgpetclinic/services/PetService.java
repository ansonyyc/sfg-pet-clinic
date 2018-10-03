package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findByName(String name);

    Pet findById(Long Id);

    void save(Pet pet);

    Set<Pet> findAll();
}
