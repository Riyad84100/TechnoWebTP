package pharmacie.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ligne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Min(1)
    private Integer quantite;

    @ManyToOne
    @JoinColumn(name = "commande_numero")
    private Commande commande;

    @ManyToOne
    @JoinColumn(name = "medicament_reference")
    private Medicament medicament;
}