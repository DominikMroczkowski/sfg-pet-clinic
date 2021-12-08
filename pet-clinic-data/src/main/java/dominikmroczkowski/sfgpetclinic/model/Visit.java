package dominikmroczkowski.sfgpetclinic.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "visits")
public class Visit extends BaseEntity {
	public Visit(long id, String description) {
		super(id);
		this.description = description;
	}
	private String description;
	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pet pet;
	private LocalDate date;

	public Visit(long id, String description, Pet pet, LocalDate date) {
		super(id);
		this.description = description;
		this.pet = pet;
		this.date = date;
	}
}
