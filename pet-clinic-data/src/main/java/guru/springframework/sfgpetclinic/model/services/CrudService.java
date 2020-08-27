package guru.springframework.sfgpetclinic.model.services;

import java.util.Set;

/**
 * @author bruno <bruno_alessi@yahoo.com.br>
 * @since 2020-08-27
 */
public interface CrudService<T, ID> {

	Set<T> findAll();
	
	T findById(final ID id);
	
	T save(final T object);
	
	void delete(final T object);
	
	void deleteById(final ID id);
		
}
