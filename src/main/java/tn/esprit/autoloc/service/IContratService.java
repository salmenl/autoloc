package tn.esprit.autoloc.service;
import tn.esprit.autoloc.domain.Contrat;
import java.util.List;
import java.util.Optional;

public interface IContratService {
    Contrat save(Contrat contrat);
    List<Contrat> findAll();
    Optional<Contrat> findById(Long id);
    Contrat update(Long id, Contrat contrat);
    void deleteById(Long id);
}
