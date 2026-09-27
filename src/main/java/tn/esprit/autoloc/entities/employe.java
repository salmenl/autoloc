package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import tn.esprit.autoloc.domain.Role;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idemploye;
    String nom;
    String prenom;

    @Enumerated(EnumType.STRING)
    Role role;
}