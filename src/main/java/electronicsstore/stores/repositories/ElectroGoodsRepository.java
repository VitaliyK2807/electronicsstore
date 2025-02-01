package electronicsstore.stores.repositories;

import electronicsstore.stores.model.ElectroGoods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectroGoodsRepository extends JpaRepository<ElectroGoods, Long> {
}
