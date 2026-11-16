package tn.esprit.autoloc.service;

import tn.esprit.autoloc.domain.Vehicule;

import java.util.List;
import java.util.Optional;

public interface IVehiculeService {
    Vehicule save(Vehicule vehicule);
    List<Vehicule> findAll();
    Optional<Vehicule> findById(Long id);
    Vehicule update(Long id, Vehicule vehicule);
    void deleteById(Long id);
    Vehicule affecterEquipement(Long idVehicule, Long idEquipement);
    Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement);
}