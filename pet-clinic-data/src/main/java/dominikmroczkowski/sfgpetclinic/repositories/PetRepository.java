package dominikmroczkowski.sfgpetclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dominikmroczkowski.sfgpetclinic.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>  {
}
