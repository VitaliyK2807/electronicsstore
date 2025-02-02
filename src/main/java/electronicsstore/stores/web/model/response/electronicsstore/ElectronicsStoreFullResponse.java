package electronicsstore.stores.web.model.response.electronicsstore;

import electronicsstore.stores.model.Employees;
import electronicsstore.stores.model.Sales;
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
public class ElectronicsStoreFullResponse {

    private Long id;
    private String name;
    private String address;
    private List<Employees> employees = new ArrayList<>();
    private List<Sales> sales = new ArrayList<>();

}
