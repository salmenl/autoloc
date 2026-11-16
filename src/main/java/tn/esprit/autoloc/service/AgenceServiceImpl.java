package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.domain.Vehicule;
import tn.esprit.autoloc.repositories.AgenceRepository;
import tn.esprit.autoloc.repositories.VehiculeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AgenceServiceImpl implements IAgenceService {

    private final AgenceRepository agenceRepository;
    private final VehiculeRepository vehiculeRepository;

    // Injection par constructeur
    public AgenceServiceImpl(AgenceRepository agenceRepository,
                             VehiculeRepository vehiculeRepository) {
        this.agenceRepository = agenceRepository;
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public Agence save(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public List<Agence> findAll() {
        return agenceRepository.findAll();
    }

    @Override
    public Optional<Agence> findById(Long id) {
        return agenceRepository.findById(id);
    }

    @Override
    public Agence update(Long id, Agence agence) {
        agence.setId(id);
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteById(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Agence ajouterAgenceEtAffecterVehicules(Agence agence) {
        // 1. mettre de côté les véhicules reçus, puis enregistrer l'agence seule
        List<Vehicule> vehicules = agence.getVehicules();
        agence.setVehicules(new ArrayList<>());
        Agence agenceSauvegardee = agenceRepository.save(agence);

        // 2. enregistrer chaque véhicule en l'affectant à l'agence
        if (vehicules != null) {
            for (Vehicule v : vehicules) {
                v.setAgence(agenceSauvegardee);
                Vehicule vSauvegarde = vehiculeRepository.save(v);
                agenceSauvegardee.getVehicules().add(vSauvegarde);
            }
        }
        return agenceSauvegardee;
    }
}