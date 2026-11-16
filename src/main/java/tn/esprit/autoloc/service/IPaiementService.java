package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Paiement;

import java.util.List;
import java.util.Optional;

public interface IPaiementService {
    Paiement save(Paiement paiement);
    List<Paiement> findAll();
    Optional<Paiement> findById(Long id);
    Paiement update(Long id, Paiement paiement);
    void deleteById(Long id);
}