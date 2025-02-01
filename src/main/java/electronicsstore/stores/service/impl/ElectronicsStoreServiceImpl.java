package electronicsstore.stores.service.impl;

import electronicsstore.stores.exception.EntityNotFoundException;
import electronicsstore.stores.model.referencebooks.ElectronicsStore;
import electronicsstore.stores.repositories.ElectronicsStoreRepository;
import electronicsstore.stores.service.ElectronicsStoreService;
import electronicsstore.stores.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ElectronicsStoreServiceImpl implements ElectronicsStoreService {

    private final ElectronicsStoreRepository repository;

    @Override
    public List<ElectronicsStore> findAll() {
        return repository.findAll();
    }

    @Override
    public ElectronicsStore findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat.format(
                        "Магазин электроники с ID {0} не найден!", id
                )));
    }

    @Override
    public ElectronicsStore save(ElectronicsStore store) {
        return repository.save(store);
    }

    @Override
    public ElectronicsStore update(ElectronicsStore store) {
        ElectronicsStore existedStore = findById(store.getId());

        BeanUtils.copyNonNullProperties(store, existedStore);

        return repository.save(existedStore);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
