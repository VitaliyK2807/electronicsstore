package electronicsstore.stores.web.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeesRequest {

    private String surname;
    private String firstname;
    private String lastname;
    private Date dateBirth;
    private Long jobTitleId;
    private Long storeId;
    private Boolean sex;

}
