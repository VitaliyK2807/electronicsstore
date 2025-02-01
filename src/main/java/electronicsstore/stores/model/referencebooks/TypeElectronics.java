package electronicsstore.stores.model.referencebooks;

import electronicsstore.stores.model.ElectroGoods;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "type_electronics")
public class TypeElectronics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, columnDefinition = "VARCHAR(150)")
    private String name;

    @OneToMany(mappedBy = "typeGoods")
    @ToString.Exclude
    @Builder.Default
    private List<ElectroGoods> electroGoods = new ArrayList<>();

    public void addElectroGoods(ElectroGoods goods) {
        if (electroGoods == null) electroGoods = new ArrayList<>();
        electroGoods.add(goods);
    }

}
