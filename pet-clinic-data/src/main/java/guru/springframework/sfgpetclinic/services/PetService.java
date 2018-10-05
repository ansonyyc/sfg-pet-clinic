package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService extends CrudServices<Pet, Long>{
    Pet findByName(String name);
}
