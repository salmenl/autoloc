package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.repositories.ContratRepository;

import java.util.List;
import java.util.Optional;
@Service
public class IContratServiceImp implements IContratService{

    private final ContratRepository contratRepository;

    public IContratServiceImp(ContratRepository contratRepository) {

        this.contratRepository = contratRepository;
    }

    @Override
    public Contrat save(Contrat contrat) {

        return contratRepository.save(contrat);
    }

    @Override
    public List<Contrat> findAll() {

        return contratRepository.findAll();
    }

    @Override
    public Optional<Contrat> findById(Long id) {

        return contratRepository.findById(id);
    }

    @Override
    public Contrat update(Long id, Contrat contrat) {
        contrat.setId(id);
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteById(Long id) {
        contratRepository.deleteById(id);

    }
}
