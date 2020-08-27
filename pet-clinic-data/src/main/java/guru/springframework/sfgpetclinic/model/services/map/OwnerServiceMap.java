package guru.springframework.sfgpetclinic.model.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;

/**
 * 
 * @author bruno <bruno_alessi@yahoo.com.br>
 * @since 2020-08-27
 */
public class OwnerServiceMap extends AbstractMapService<Owner, Long> {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public Owner findById(final Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(final Owner object) {
		return object != null ? super.save(object.getId(), object) : null;
	}

	@Override
	public void delete(final Owner object) {
		super.delete(object);
	}

	@Override
	public void deleteById(final Long id) {
		super.deleteById(id);
	}


}
