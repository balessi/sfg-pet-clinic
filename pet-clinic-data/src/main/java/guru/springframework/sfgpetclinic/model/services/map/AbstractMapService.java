package guru.springframework.sfgpetclinic.model.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import guru.springframework.sfgpetclinic.model.services.CrudService;

/**
 * 
 * @author bruno <bruno_alessi@yahoo.com.br>
 * @since 2020-08-27
 */
public abstract class AbstractMapService<T, ID> implements CrudService<T, ID> {

	protected Map<ID, T> data;
	
	public AbstractMapService() {
		this.data = new HashMap<>();
	}
	
	@Override
	public Set<T> findAll() {
		return new HashSet<>(this.data.values());
	}
	
	@Override
	public T findById(final ID id) {
		if (id == null) {
			return null;
		}	
		return this.data.get(id);
	}
 	
	public T save(final ID id, final T object) {
		if (id == null || object == null) {
			return null;
		}
		return this.data.put(id, object);
	}
	
	@Override
	public void delete(final T object) {
		if (object != null) {
			this.data.entrySet().removeIf(entry -> entry.getValue().equals(object));
		}
	}
	
	@Override
	public void deleteById(final ID id) {
		if (id != null) {
			this.data.remove(id);
		}
	}
	
}
