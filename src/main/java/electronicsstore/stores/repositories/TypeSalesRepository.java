package electronicsstore.stores.repositories;

import electronicsstore.stores.model.referencebooks.TypeSales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeSalesRepository extends JpaRepository<TypeSales, Long> {
}
