package electronicsstore.stores.service.impl;

import electronicsstore.stores.exception.EntityNotFoundException;
import electronicsstore.stores.model.ElectroGoods;
import electronicsstore.stores.model.Employees;
import electronicsstore.stores.model.Sales;
import electronicsstore.stores.model.referencebooks.ElectronicsStore;
import electronicsstore.stores.repositories.ElectroGoodsRepository;
import electronicsstore.stores.repositories.ElectronicsStoreRepository;
import electronicsstore.stores.repositories.EmployeesRepository;
import electronicsstore.stores.repositories.SalesRepository;
import electronicsstore.stores.service.ElectroGoodsService;
import electronicsstore.stores.service.ElectronicsStoreService;
import electronicsstore.stores.service.EmployeesService;
import electronicsstore.stores.service.SalesService;
import electronicsstore.stores.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SalesServiceImpl implements SalesService {

    private final SalesRepository salesRepository;
    private final EmployeesService employeesService;
    private final ElectroGoodsService electroGoodsService;
    private final ElectronicsStoreService electronicsStoreService;


    @Override
    public List<Sales> findAll() {
        return salesRepository.findAll();
    }

    @Override
    public Sales findById(Long id) {
        return salesRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat.format(
                        "Покупа с ID {0} не найдена!", id
                )));
    }

    @Override
    public Sales save(Sales sales) {
        return salesRepository.save(sales);
    }

    @Override
    public Sales update(Sales sales) {
        Employees employee = employeesService.findById(sales.getEmployee().getId());
        ElectroGoods electroGoods = electroGoodsService.findById(sales.getGoods().getId());
        ElectronicsStore store = electronicsStoreService.findById(sales.getStore().getId());
        Sales existedSales = findById(sales.getId());

        BeanUtils.copyNonNullProperties(sales, existedSales);

        existedSales.setEmployee(employee);
        existedSales.setGoods(electroGoods);
        existedSales.setStore(store);

        return salesRepository.save(existedSales);
    }

    @Override
    public void deleteById(Long id) {
        salesRepository.deleteById(id);
    }
}
