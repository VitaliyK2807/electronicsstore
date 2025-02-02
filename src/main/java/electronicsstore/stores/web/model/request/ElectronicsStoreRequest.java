package electronicsstore.stores.web.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ElectronicsStoreRequest {

    private String name;
    private String address;

}
