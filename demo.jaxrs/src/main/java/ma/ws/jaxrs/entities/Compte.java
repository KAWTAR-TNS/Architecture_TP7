package ma.ws.jaxrs.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;
    private LocalDate dateCreation;
    @Enumerated(EnumType.ORDINAL)
    private TypeCompte type;

    public Compte(Long id, double solde, Date date, TypeCompte typeCompte) {
    }
}