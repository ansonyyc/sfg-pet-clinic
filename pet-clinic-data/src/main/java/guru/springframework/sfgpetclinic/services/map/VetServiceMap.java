package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.CrudServices;
import guru.springframework.sfgpetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapSrvice<Vet, Long> implements VetService{
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Long id, Vet object) {
        return super.save(id, object);
    }

    @Override
    public Vet findById(Long id) {
       return super.findById(id);
    }

    @Override
    public Vet findByLastName(String lastName) {
        return super.findAll()
                .stream()
                .filter(vet -> vet.getLastName().equals(lastName))
                .findFirst()
                .orElse(null);
    }
}
