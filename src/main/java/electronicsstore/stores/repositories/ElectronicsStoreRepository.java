package electronicsstore.stores.repositories;

import electronicsstore.stores.model.referencebooks.ElectronicsStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectronicsStoreRepository extends JpaRepository<ElectronicsStore, Long> {
}
