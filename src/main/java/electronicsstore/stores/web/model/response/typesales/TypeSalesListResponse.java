package electronicsstore.stores.web.model.response.typesales;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TypeSalesListResponse {

    List<TypeSalesResponse> typeSales = new ArrayList<>();

}
