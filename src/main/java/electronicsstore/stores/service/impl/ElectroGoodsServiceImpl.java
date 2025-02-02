package electronicsstore.stores.service.impl;

import electronicsstore.stores.exception.EntityNotFoundException;
import electronicsstore.stores.model.ElectroGoods;
import electronicsstore.stores.model.referencebooks.TypeElectronics;
import electronicsstore.stores.repositories.ElectroGoodsRepository;
import electronicsstore.stores.service.ElectroGoodsService;
import electronicsstore.stores.service.TypeElectronicsService;
import electronicsstore.stores.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ElectroGoodsServiceImpl implements ElectroGoodsService {

    private final ElectroGoodsRepository repository;
    private final TypeElectronicsService typeElectronicsService;

    @Override
    public List<ElectroGoods> findAll() {
        return repository.findAll();
    }

    @Override
    public ElectroGoods findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat.format(
                                "Электро товары с ID {0} не найдены!", id
                        )));
    }

    @Override
    public ElectroGoods save(ElectroGoods goods) {
        return repository.save(goods);
    }

    @Override
    public ElectroGoods update(ElectroGoods goods) {
        TypeElectronics typeElectronics = typeElectronicsService.findById(goods.getTypeElectronics().getId());
        ElectroGoods existedGoods = findById(goods.getId());

        BeanUtils.copyNonNullProperties(goods, existedGoods);

        existedGoods.setTypeElectronics(typeElectronics);

        return repository.save(existedGoods);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
