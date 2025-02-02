package electronicsstore.stores.web.model.response.electronicsstore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ElectronicsStoreResponse {

    private Long id;
    private String name;
    private String address;
}
