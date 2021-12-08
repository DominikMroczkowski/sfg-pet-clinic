package dominikmroczkowski.sfgpetclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dominikmroczkowski.sfgpetclinic.model.Vet;

public interface VetRepository extends JpaRepository<Vet, Long>  {
}

