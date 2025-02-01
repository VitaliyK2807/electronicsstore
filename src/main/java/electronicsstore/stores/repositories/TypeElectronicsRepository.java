package electronicsstore.stores.repositories;

import electronicsstore.stores.model.referencebooks.TypeElectronics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeElectronicsRepository extends JpaRepository<TypeElectronics, Long> {
}
