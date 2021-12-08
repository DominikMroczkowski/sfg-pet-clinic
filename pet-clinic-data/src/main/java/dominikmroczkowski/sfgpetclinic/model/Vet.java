package dominikmroczkowski.sfgpetclinic.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "vets")
public class Vet extends Person {

	public Vet (Long id, String firstName, String lastName, HashSet<Speciality> specialities) {
		super(id, firstName, lastName);
		this.specialities = specialities;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "vets_specialities", joinColumns = @JoinColumn(name = "vet_id"),
	           inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	private HashSet<Speciality> specialities = new HashSet<>();
}
