package electronicsstore.stores.web.model.response.typesales;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TypeSalesResponse {

    private Long id;
    private String name;

}
