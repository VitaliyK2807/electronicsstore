package electronicsstore.stores.web.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesRequest {

    private Long goodsId;
    private Long employeeId;
    private Long storeId;
    private LocalDateTime dateTime;
    private Long typeSalesId;

}
