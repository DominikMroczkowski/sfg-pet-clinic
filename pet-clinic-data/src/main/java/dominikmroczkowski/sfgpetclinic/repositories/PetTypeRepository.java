package dominikmroczkowski.sfgpetclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dominikmroczkowski.sfgpetclinic.model.PetType;

public interface PetTypeRepository extends JpaRepository<PetType, Long>  {
}

