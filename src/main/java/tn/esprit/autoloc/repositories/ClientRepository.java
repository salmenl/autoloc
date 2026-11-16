package tn.esprit.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloc.domain.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}