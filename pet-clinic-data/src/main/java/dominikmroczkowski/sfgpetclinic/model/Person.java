package dominikmroczkowski.sfgpetclinic.model;

import javax.persistence.MappedSuperclass;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

	public Person(long id, String firstName, String lastName) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private String firstName;
	private String lastName;
}
