package guru.springframework.sfgpetclinic.model.services;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-19
 */
public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(final String lasName);
	
}
