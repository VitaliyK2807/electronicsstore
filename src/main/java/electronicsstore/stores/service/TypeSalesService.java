package electronicsstore.stores.service;

import electronicsstore.stores.model.referencebooks.TypeSales;

import java.util.List;

public interface TypeSalesService {

    List<TypeSales> findAll();

    TypeSales findById(Long id);

    TypeSales save(TypeSales typeSales);

    TypeSales update(TypeSales typeSales);

    void deleteById(Long id);
}
