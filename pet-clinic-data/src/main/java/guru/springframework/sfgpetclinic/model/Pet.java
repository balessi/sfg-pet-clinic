package guru.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-19
 */
public class Pet extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;
	
	public PetType getPetType() {
		return this.petType;
	}
	public void setPetType(PetType petType1) {
		this.petType = petType1;
	}
	public Owner getOwner() {
		return this.owner;
	}
	public void setOwner(Owner owner1) {
		this.owner = owner1;
	}
	public LocalDate getBirthDate() {
		return this.birthDate;
	}
	public void setBirthDate(LocalDate birthDate1) {
		this.birthDate = birthDate1;
	}
	
}
