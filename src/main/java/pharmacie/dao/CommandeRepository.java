package pharmacie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacie.entity.Commande;
import java.time.LocalDate;
import java.util.List;

public interface CommandeRepository extends JpaRepository<Commande, Integer> {
    // Custom method: Find all orders created after a specific date
    List<Commande> findBySaisieLeAfter(LocalDate date);
}