package electronicsstore.stores.service;

import electronicsstore.stores.model.Employees;

import java.util.List;

public interface EmployeesService {

    List<Employees> findAll();

    Employees findById(Long id);

    Employees save(Employees employee);

    Employees update(Employees employee);

    void deleteById(Long id);
}
