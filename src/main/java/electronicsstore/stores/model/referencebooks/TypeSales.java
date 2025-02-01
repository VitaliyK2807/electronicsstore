package electronicsstore.stores.model.referencebooks;

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
@Table(name = "type_sales")
public class TypeSales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, columnDefinition = "VARCHAR(150)")
    private String name;

    @OneToMany(mappedBy = "typeSales")
    @ToString.Exclude
    @Builder.Default
    private List<Sales> sales = new ArrayList<>();

    public void addSales(Sales sale) {
        if (sales == null) sales = new ArrayList<>();
        sales.add(sale);
    }
}