package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Employe;
import tn.esprit.autoloc.service.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("employe")
public class EmployeController {

    private final IEmployeService employeService;

    @PostMapping
    public Employe ajouterEmploye(@RequestBody Employe employe) {
        return employeService.save(employe);
    }

    @PutMapping("/update/{id}")
    public Employe modifierEmploye(@PathVariable Long id, @RequestBody Employe employe) {
        return employeService.update(id, employe);
    }

    @GetMapping
    public List<Employe> getall() {
        return employeService.findAll();
    }

    @GetMapping("/getById/{id}")
    public Employe getEmployeById(@PathVariable Long id) {
        return employeService.findById(id).orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        employeService.deleteById(id);
    }
    @PutMapping("/desaffecter/{idEmploye}")
    public Employe desaffecter(@PathVariable Long idEmploye) {
        return employeService.desaffecterEmploye(idEmploye);
    }

    @PutMapping("/affecter/{idEmploye}/{idAgence}")
    public Employe affecter(@PathVariable Long idEmploye, @PathVariable Long idAgence) {
        return employeService.affecterEmploye(idEmploye, idAgence);
    }
}