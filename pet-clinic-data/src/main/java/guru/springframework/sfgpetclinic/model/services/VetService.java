package guru.springframework.sfgpetclinic.model.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;

/**
 * 
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-19
 */
public interface VetService {

	Vet findById(long id);
	Vet save(Vet vet);
	Set<Vet> findAll();

}
