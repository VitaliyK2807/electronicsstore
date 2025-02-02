package electronicsstore.stores.web.model.response.sales;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SalesResponse {

    private Long id;
    private String goodsName;
    private String employeeSurname;
    private String employeeFirstname;
    private String storeName;
    private LocalDateTime dateTime;
    private String typeSalesName;

}
