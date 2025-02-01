package electronicsstore.stores.service;

import electronicsstore.stores.model.Sales;

import java.util.List;

public interface SalesService {

    List<Sales> findAll();

    Sales findById(Long id);

    Sales save(Sales sales);

    Sales update(Sales sales);

    void deleteById(Long id);
}
