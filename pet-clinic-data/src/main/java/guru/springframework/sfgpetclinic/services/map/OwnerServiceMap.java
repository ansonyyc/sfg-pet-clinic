package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.CrudServices;
import guru.springframework.sfgpetclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapSrvice<Owner, Long> implements OwnerService{
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.findById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return super.findAll()
                .stream()
                .filter(owner -> owner.getLastName().equals(lastName))
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Long id, Owner object) {
        return super.save(id, object);
    }

    @Override
    public Owner findById(Long id) {
       return super.findById(id);
    }
}
