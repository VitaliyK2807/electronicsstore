package electronicsstore.stores.service.impl;

import electronicsstore.stores.exception.EntityNotFoundException;
import electronicsstore.stores.model.Employees;
import electronicsstore.stores.model.referencebooks.ElectronicsStore;
import electronicsstore.stores.model.referencebooks.JobTitle;
import electronicsstore.stores.repositories.EmployeesRepository;
import electronicsstore.stores.service.ElectronicsStoreService;
import electronicsstore.stores.service.EmployeesService;
import electronicsstore.stores.service.JobTitleService;
import electronicsstore.stores.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeesServiceImpl implements EmployeesService {

    private final EmployeesRepository repository;
    private final JobTitleService jobTitleService;
    private final ElectronicsStoreService electronicsStoreService;

    @Override
    public List<Employees> findAll() {
        return repository.findAll();
    }

    @Override
    public Employees findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat.format(
                        "Сотрудник с ID {0} не найден!", id
                )));
    }

    @Override
    public Employees save(Employees employee) {
        return repository.save(employee);
    }

    @Override
    public Employees update(Employees employee) {
        JobTitle jobTitle = jobTitleService.findById(employee.getJobTitle().getId());
        ElectronicsStore store = electronicsStoreService.findById(employee.getStore().getId());
        Employees existedEmployee = findById(employee.getId());

        BeanUtils.copyNonNullProperties(employee, existedEmployee);

        existedEmployee.setJobTitle(jobTitle);
        existedEmployee.setStore(store);

        return repository.save(existedEmployee);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
