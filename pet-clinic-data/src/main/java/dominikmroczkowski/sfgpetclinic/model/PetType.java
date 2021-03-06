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
@Table(name = "pet_types")
public class PetType extends BaseEntity {
	public PetType(long id, String name) {
		super(id);
		this.name = name;
	}
	private String name;
}
