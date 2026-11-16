package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Equipement;
import tn.esprit.autoloc.service.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("equipement")
public class EquipementController {

    private final IEquipementService equipementService;

    @PostMapping
    public Equipement ajouterEquipement(@RequestBody Equipement equipement) {
        return equipementService.save(equipement);
    }

    @PutMapping("/update/{id}")
    public Equipement modifierEquipement(@PathVariable Long id, @RequestBody Equipement equipement) {
        return equipementService.update(id, equipement);
    }

    @GetMapping
    public List<Equipement> getall() {
        return equipementService.findAll();
    }

    @GetMapping("/getById/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return equipementService.findById(id).orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        equipementService.deleteById(id);
    }
}