package dominikmroczkowski.sfgpetclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dominikmroczkowski.sfgpetclinic.model.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long>  {
}

