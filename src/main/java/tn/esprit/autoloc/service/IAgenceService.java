package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Agence;

import java.util.List;
import java.util.Optional;

public interface IAgenceService {
    Agence save(Agence agence);            // Create
    List<Agence> findAll();                // Read (tous)
    Optional<Agence> findById(Long id);    // Read (un seul)
    Agence update(Long id, Agence agence); // Update
    void deleteById(Long id);// Delete
    Agence ajouterAgenceEtAffecterVehicules(Agence agence);

}
