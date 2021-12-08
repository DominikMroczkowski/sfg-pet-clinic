package dominikmroczkowski.sfgpetclinic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "specialities")
public class Speciality extends BaseEntity {
	public Speciality(long id, String description) {
		super(id);
		this.description = description;
	}
	private String description;
}
