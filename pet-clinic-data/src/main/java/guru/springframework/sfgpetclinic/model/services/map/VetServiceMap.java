package guru.springframework.sfgpetclinic.model.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Vet;

/**
 * 
 * @author bruno <bruno_alessi@yahoo.com.br>
 * @since 2020-08-27
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> {

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(final Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(final Vet object) {
		return object != null ? super.save(object.getId(), object) : null;
	}

	@Override
	public void delete(final Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(final Long id) {
		super.deleteById(id);
	}

}
