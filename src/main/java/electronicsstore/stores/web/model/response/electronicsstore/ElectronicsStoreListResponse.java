package electronicsstore.stores.web.model.response.electronicsstore;

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
public class ElectronicsStoreListResponse {

    private List<ElectronicsStoreResponse> stores = new ArrayList<>();

}
