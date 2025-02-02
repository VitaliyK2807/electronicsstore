package electronicsstore.stores.web.model.response.electrogoods;

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
public class ElectroGoodsListResponse {

    private List<ElectroGoodsResponse> goods = new ArrayList<>();
}
