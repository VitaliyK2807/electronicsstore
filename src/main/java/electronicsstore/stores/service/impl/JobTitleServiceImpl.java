package electronicsstore.stores.service.impl;

import electronicsstore.stores.exception.EntityNotFoundException;
import electronicsstore.stores.model.referencebooks.JobTitle;
import electronicsstore.stores.repositories.JobTitleRepository;
import electronicsstore.stores.service.JobTitleService;
import electronicsstore.stores.utils.BeanUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JobTitleServiceImpl implements JobTitleService {

    private final JobTitleRepository repository;

    @Override
    public List<JobTitle> findAll() {
        return repository.findAll();
    }

    @Override
    public JobTitle findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat.format(
                        "Должность с ID {0} не найдена!", id
                )));
    }

    @Override
    public JobTitle save(JobTitle jobTitle) {
        return repository.save(jobTitle);
    }

    @Override
    public JobTitle update(JobTitle jobTitle) {
        JobTitle existedJobTitle = findById(jobTitle.getId());

        BeanUtils.copyNonNullProperties(jobTitle, existedJobTitle);

        return existedJobTitle;
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
