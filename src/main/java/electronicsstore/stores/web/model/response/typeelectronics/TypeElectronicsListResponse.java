package electronicsstore.stores.web.model.response.typeelectronics;

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
public class TypeElectronicsListResponse {

    private List<TypeElectronicsResponse> typeElectronics = new ArrayList<>();

}
