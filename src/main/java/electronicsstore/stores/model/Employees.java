package electronicsstore.stores.model;

import electronicsstore.stores.model.referencebooks.ElectronicsStore;
import electronicsstore.stores.model.referencebooks.JobTitle;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, columnDefinition = "VARCHAR(100)")
    private String surname;

    @Column(nullable = false, columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(nullable = false, columnDefinition = "VARCHAR(100)")
    private String lastname;

    @Column(nullable = false)
    private Date dateBirth;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_jobtitle")
    private JobTitle jobTitle;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_store")
    private ElectronicsStore store;

    @Column(nullable = false)
    private Boolean sex;
}
