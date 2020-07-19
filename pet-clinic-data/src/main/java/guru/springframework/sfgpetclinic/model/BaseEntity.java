package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * 
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-19
 */
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id1) {
		this.id = id1;
	}
	
}
