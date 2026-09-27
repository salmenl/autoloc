package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class employe {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idemploye;
    String nom;
    String prenom;

    @Enumerated(EnumType.STRING)
    Role role;

}
