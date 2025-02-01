package electronicsstore.stores.model.referencebooks;

import electronicsstore.stores.model.Employees;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "job_title")
public class JobTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, columnDefinition = "VARCHAR(150)")
    private String name;

    @OneToMany(mappedBy = "jobTitle")
    @ToString.Exclude
    @Builder.Default
    private List<Employees> employees = new ArrayList<>();

    public void addEmployee(Employees employee) {
        if (employee == null) employees = new ArrayList<>();
        employees.add(employee);
    }

}
