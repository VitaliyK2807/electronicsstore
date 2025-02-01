package electronicsstore.stores.model;

import electronicsstore.stores.model.referencebooks.ElectronicsStore;
import electronicsstore.stores.model.referencebooks.TypeSales;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sales")
public class Sales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_goods")
    private ElectroGoods goods;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_employee")
    private Employees employee;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_store")
    private ElectronicsStore store;

    @Column(nullable = false, name = "date_time")
    private LocalDateTime dateTime;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_type_sales")
    private TypeSales typeSales;
}
