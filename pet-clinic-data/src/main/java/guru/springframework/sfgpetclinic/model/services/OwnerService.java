package guru.springframework.sfgpetclinic.model.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-19
 */
public interface OwnerService {

	Owner findById(long id);
	Owner findByLastName(String lasName);
	Owner save(Owner owner);
	Set<Owner> findAll();
	
}
