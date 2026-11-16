package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Paiement;
import tn.esprit.autoloc.service.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("paiement")
public class PaiementController {

    private final IPaiementService paiementService;

    @PostMapping
    public Paiement ajouterPaiement(@RequestBody Paiement paiement) {
        return paiementService.save(paiement);
    }

    @PutMapping("/update/{id}")
    public Paiement modifierPaiement(@PathVariable Long id, @RequestBody Paiement paiement) {
        return paiementService.update(id, paiement);
    }

    @GetMapping
    public List<Paiement> getall() {
        return paiementService.findAll();
    }

    @GetMapping("/getById/{id}")
    public Paiement getPaiementById(@PathVariable Long id) {
        return paiementService.findById(id).orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        paiementService.deleteById(id);
    }
}