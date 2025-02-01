package electronicsstore.stores.model.referencebooks;

import electronicsstore.stores.model.Employees;
import electronicsstore.stores.model.Sales;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "electronics_store")
public class ElectronicsStore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, columnDefinition = "VARCHAR(150)")
    private String name;

    @Column(nullable = false)
    private String address;

    @OneToMany(mappedBy = "store")
    @ToString.Exclude
    @Builder.Default
    private List<Employees> employees = new ArrayList<>();

    @OneToMany(mappedBy = "store")
    @ToString.Exclude
    @Builder.Default
    private List<Sales> sales = new ArrayList<>();


    public void addEmployee(Employees employee) {
        if (employee == null) employees = new ArrayList<>();
        employees.add(employee);
    }

    public void addSales(Sales sale) {
        if (sales == null) sales = new ArrayList<>();
        sales.add(sale);
    }

}