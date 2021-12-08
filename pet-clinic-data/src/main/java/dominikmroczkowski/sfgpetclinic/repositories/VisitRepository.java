package dominikmroczkowski.sfgpetclinic.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dominikmroczkowski.sfgpetclinic.model.Visit;

public interface VisitRepository extends JpaRepository<Visit, Long>  {
}
