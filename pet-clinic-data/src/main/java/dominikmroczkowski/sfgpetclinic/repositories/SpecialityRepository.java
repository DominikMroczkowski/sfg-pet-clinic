package dominikmroczkowski.sfgpetclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dominikmroczkowski.sfgpetclinic.model.Speciality;

public interface SpecialityRepository extends JpaRepository<Speciality, Long>  {
}

