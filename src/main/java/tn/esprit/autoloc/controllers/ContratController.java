package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Contrat;
import tn.esprit.autoloc.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("contrat")
public class ContratController {

    private final IContratService contratService;

    @PostMapping
    public Contrat ajouterContrat(@RequestBody Contrat contrat) {
        return contratService.save(contrat);
    }

    @PutMapping("/update/{id}")
    public Contrat modifierContrat(@PathVariable Long id, @RequestBody Contrat contrat) {
        return contratService.update(id, contrat);
    }

    @GetMapping
    public List<Contrat> getall() {
        return contratService.findAll();
    }

    @GetMapping("/getById/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return contratService.findById(id).orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        contratService.deleteById(id);
    }
}