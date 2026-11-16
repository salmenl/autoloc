package tn.esprit.autoloc.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.domain.Client;
import tn.esprit.autoloc.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("client")
public class ClientController {

    private final IClientService clientService;

    @PostMapping
    public Client ajouterClient(@RequestBody Client client) {
        return clientService.save(client);
    }

    @PutMapping("/update/{id}")
    public Client modifierClient(@PathVariable Long id, @RequestBody Client client) {
        return clientService.update(id, client);
    }

    @GetMapping
    public List<Client> getall() {
        return clientService.findAll();
    }

    @GetMapping("/getById/{id}")
    public Client getClientById(@PathVariable Long id) {
        return clientService.findById(id).orElse(null);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id) {
        clientService.deleteById(id);
    }
}
