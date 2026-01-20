package pharmacie.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero;

    @NotNull
    private LocalDate saisieLe;

    private LocalDate envoyeeLe;

    @DecimalMin("0.0")
    private BigDecimal port;

    @DecimalMin("0.0")
    @DecimalMax("100.0")
    private BigDecimal remise;

    @Size(max = 40)
    private String destinataire;

    @Size(max = 60)
    private String adresse;

    @Size(max = 15)
    private String ville;

    @ManyToOne
    @JoinColumn(name = "dispensaire_code")
    private Dispensaire dispensaire;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ligne> lignes;
}
