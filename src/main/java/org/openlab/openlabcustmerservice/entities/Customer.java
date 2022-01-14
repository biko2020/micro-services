//creer  l'entite customer

package org.openlab.openlabcustmerservice.entities;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Ajouter les notations

// entite jpa , pour enregistrer les entities dans database
@Entity
// pour lombok (générer les gitter-setter-constructeur)
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    @Id
    private String id;
    private String name;
    private String email;
}
