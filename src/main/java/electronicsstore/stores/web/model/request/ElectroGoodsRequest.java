package electronicsstore.stores.web.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectroGoodsRequest {

    private String name;
    private Long typeGoodsId;
    private Double price;
    private Integer count;
    private Boolean availability;
    private String description;

}
