package guru.springframework.sfgpetclinic.model.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;

/**
 * 
 * @author bruno <bruno_alessi@yahoo.com.br>
 * @since 2020-08-27
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(final Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(final Pet object) {
		return object != null ? super.save(object.getId(), object) : null;
	}

	@Override
	public void delete(final Pet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(final Long id) {
		super.deleteById(id);
	}

}
