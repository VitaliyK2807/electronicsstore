package electronicsstore.stores.web.model.response.electrogoods;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ElectroGoodsResponse {

    private Long id;
    private String name;
    private String typeElectronics;
    private Double price;
    private Integer count;
    private Boolean availability;
    private String description;

}
