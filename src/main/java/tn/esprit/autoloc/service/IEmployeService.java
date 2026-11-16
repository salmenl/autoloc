package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Employe;

import java.util.List;
import java.util.Optional;

public interface IEmployeService {
    Employe save(Employe employe);
    List<Employe> findAll();
    Optional<Employe> findById(Long id);
    Employe update(Long id, Employe employe);
    void deleteById(Long id);
    Employe desaffecterEmploye(Long idEmploye);
    Employe affecterEmploye(Long idEmploye, Long idAgence);
}