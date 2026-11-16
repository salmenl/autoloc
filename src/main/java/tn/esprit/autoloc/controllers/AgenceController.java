package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Agence;
import tn.esprit.autoloc.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @PostMapping
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.save(agence);
    }

    @PutMapping("/update/{id}")
    public Agence modifierAgence(@PathVariable Long id, @RequestBody Agence agence) {
        return agenceService.update(id, agence);
    }

    @GetMapping
    public List<Agence> getall() {
        return agenceService.findAll();
    }

    @GetMapping("/getById/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return agenceService.findById(id).orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        agenceService.deleteById(id);
    }
    @PostMapping("/ajouterAvecVehicules")
    public Agence ajouterAvecVehicules(@RequestBody Agence agence) {
        return agenceService.ajouterAgenceEtAffecterVehicules(agence);
    }
}