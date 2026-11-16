package tn.esprit.autoloc.repositories;

import tn.esprit.autoloc.domain.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}