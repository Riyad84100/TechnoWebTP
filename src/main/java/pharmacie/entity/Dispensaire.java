package pharmacie.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Dispensaire {
    @Id
    @Column(length = 5)
    private String code;

    @NotBlank
    @Size(max = 40)
    private String nom;

    @Size(max = 60)
    private String adresse;

    @Size(max = 15)
    private String ville;

    @Size(max = 15)
    private String region;

    @Size(max = 10)
    private String codePostal;

    @Size(max = 15)
    private String pays;

    @Size(max = 30)
    private String contact;

    @Size(max = 30)
    private String fonction;

    @Size(max = 24)
    private String telephone;

    @Size(max = 24)
    private String fax;

    @OneToMany(mappedBy = "dispensaire")
    private List<Commande> commandes;
}