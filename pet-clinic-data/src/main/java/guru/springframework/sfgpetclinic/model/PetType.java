package guru.springframework.sfgpetclinic.model;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-19
 */
public class PetType extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name1) {
		this.name = name1;
	}
	
}
