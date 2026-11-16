package tn.esprit.autoloc.service;

import org.springframework.stereotype.Service;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.repositories.EquipementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EquipementServiceImpl implements IEquipementService {

    private final EquipementRepository equipementRepository;

    public EquipementServiceImpl(EquipementRepository equipementRepository) {
        this.equipementRepository = equipementRepository;
    }

    @Override
    public Equipement save(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public List<Equipement> findAll() {
        return equipementRepository.findAll();
    }

    @Override
    public Optional<Equipement> findById(Long id) {
        return equipementRepository.findById(id);
    }

    @Override
    public Equipement update(Long id, Equipement equipement) {
        equipement.setId(id);
        return equipementRepository.save(equipement);
    }

    @Override
    public void deleteById(Long id) {
        equipementRepository.deleteById(id);
    }
}
