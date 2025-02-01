package electronicsstore.stores.service;

import electronicsstore.stores.model.referencebooks.ElectronicsStore;

import java.util.List;

public interface ElectronicsStoreService {

    List<ElectronicsStore> findAll();

    ElectronicsStore findById(Long id);

    ElectronicsStore save(ElectronicsStore store);

    ElectronicsStore update(ElectronicsStore store);

    void deleteById(Long id);

}
