package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudServices<Owner, Long>{
    Owner findByLastName(String lastName);
}
