package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.repositories.PaiementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PaiementServiceImpl implements IPaiementService {

    private final PaiementRepository paiementRepository;

    public PaiementServiceImpl(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    @Override
    public Paiement save(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }

    @Override
    public Optional<Paiement> findById(Long id) {
        return paiementRepository.findById(id);
    }

    @Override
    public Paiement update(Long id, Paiement paiement) {
        paiement.setId(id);
        return paiementRepository.save(paiement);
    }

    @Override
    public void deleteById(Long id) {
        paiementRepository.deleteById(id);
    }
}