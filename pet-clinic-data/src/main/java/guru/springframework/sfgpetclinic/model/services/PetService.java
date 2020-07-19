package guru.springframework.sfgpetclinic.model.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;

/**
 * 
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-19
 */
public interface PetService {

	Pet findById(long id);
	Pet save(Pet pet);
	Set<Pet> findAll();

}
