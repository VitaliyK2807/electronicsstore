package electronicsstore.stores.service;

import electronicsstore.stores.model.referencebooks.JobTitle;

import java.util.List;

public interface JobTitleService {

    List<JobTitle> findAll();

    JobTitle findById(Long id);

    JobTitle save(JobTitle jobTitle);

    JobTitle update(JobTitle jobTitle);

    void deleteById(Long id);
}
