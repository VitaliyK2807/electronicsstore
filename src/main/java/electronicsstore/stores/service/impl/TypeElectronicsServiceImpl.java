package electronicsstore.stores.service.impl;

import electronicsstore.stores.exception.EntityNotFoundException;
import electronicsstore.stores.model.referencebooks.TypeElectronics;
import electronicsstore.stores.repositories.TypeElectronicsRepository;
import electronicsstore.stores.service.TypeElectronicsService;
import electronicsstore.stores.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeElectronicsServiceImpl implements TypeElectronicsService {

    private final TypeElectronicsRepository repository;

    @Override
    public List<TypeElectronics> findAll() {
        return repository.findAll();
    }

    @Override
    public TypeElectronics findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat.format(
                        "Тип электроники с ID {0} не найдено!", id
                )));
    }

    @Override
    public TypeElectronics save(TypeElectronics typeElectronics) {
        return repository.save(typeElectronics);
    }

    @Override
    public TypeElectronics update(TypeElectronics typeElectronics) {
        TypeElectronics existedTypeElectronics = findById(typeElectronics.getId());

        BeanUtils.copyNonNullProperties(typeElectronics, existedTypeElectronics);

        return repository.save(existedTypeElectronics);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
