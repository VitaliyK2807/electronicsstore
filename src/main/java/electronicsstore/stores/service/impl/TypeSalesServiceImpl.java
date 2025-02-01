package electronicsstore.stores.service.impl;

import electronicsstore.stores.exception.EntityNotFoundException;
import electronicsstore.stores.model.referencebooks.TypeSales;
import electronicsstore.stores.repositories.TypeSalesRepository;
import electronicsstore.stores.service.TypeSalesService;
import electronicsstore.stores.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TypeSalesServiceImpl implements TypeSalesService {

    private final TypeSalesRepository repository;

    @Override
    public List<TypeSales> findAll() {
        return repository.findAll();
    }

    @Override
    public TypeSales findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat.format(
                        "Тип продажи с ID {0} не найдено!", id
                )));
    }

    @Override
    public TypeSales save(TypeSales typeSales) {
        return repository.save(typeSales);
    }

    @Override
    public TypeSales update(TypeSales typeSales) {
        TypeSales existedTypeSales = findById(typeSales.getId());

        BeanUtils.copyNonNullProperties(typeSales, existedTypeSales);

        return repository.save(existedTypeSales);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
