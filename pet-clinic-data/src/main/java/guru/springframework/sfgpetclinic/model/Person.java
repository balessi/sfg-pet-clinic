package guru.springframework.sfgpetclinic.model;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-19
 */
public class Person extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName1) {
		this.firstName = firstName1;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName1) {
		this.lastName = lastName1;
	}
	
}
