package electronicsstore.stores.service;

import electronicsstore.stores.model.referencebooks.TypeElectronics;

import java.util.List;

public interface TypeElectronicsService {

    List<TypeElectronics> findAll();

    TypeElectronics findById(Long id);

    TypeElectronics save(TypeElectronics typeElectronics);

    TypeElectronics update(TypeElectronics typeElectronics);

    void deleteById(Long id);
}
