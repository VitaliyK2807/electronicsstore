package electronicsstore.stores.model;

import electronicsstore.stores.model.referencebooks.TypeElectronics;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "goods")
public class ElectroGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, columnDefinition = "VARCHAR(150)")
    private String name;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_typegoods")
    private TypeElectronics typeGoods;

    private Double price;

    private Integer count;

    private Boolean availability;

    private String description;

    @OneToMany(mappedBy = "goods")
    @ToString.Exclude
    @Builder.Default
    private List<Sales> sales = new ArrayList<>();

    public void addSales(Sales sale) {
        if (sales == null) sales = new ArrayList<>();
        sales.add(sale);
    }

}
