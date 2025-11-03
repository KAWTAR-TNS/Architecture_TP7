package ma.ws.jaxrs.entities;

import jakarta.persistence.*;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@XmlRootElement
@AllArgsConstructor
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double solde;
    private LocalDate dateCreation;
    @Enumerated(EnumType.STRING)
    private TypeCompte type;


}