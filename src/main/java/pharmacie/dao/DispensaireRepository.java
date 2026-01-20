package pharmacie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pharmacie.entity.Dispensaire;
import java.util.List;

public interface DispensaireRepository extends JpaRepository<Dispensaire, String> {
    // Custom method: Find all dispensaries in a given region
    List<Dispensaire> findByRegion(String region);
}
