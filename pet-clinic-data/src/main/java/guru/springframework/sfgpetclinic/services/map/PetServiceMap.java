package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.CrudServices;
import guru.springframework.sfgpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapSrvice<Pet, Long> implements PetService{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Long id, Pet object) {
        return super.save(id, object);
    }

    @Override
    public Pet findById(Long id) {
       return super.findById(id);
    }


    @Override
    public Pet findByName(String name) {
        return super.findAll()
                .stream()
                .filter(pet -> pet.getPetType().getName().equals(name))
                .findFirst()
                .orElse(null);
    }
}
