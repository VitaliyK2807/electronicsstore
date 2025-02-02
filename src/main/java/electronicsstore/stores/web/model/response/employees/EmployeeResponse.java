package electronicsstore.stores.web.model.response.employees;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {

    private Long id;
    private String surname;
    private String firstname;
    private String lastname;
    private Date dateBirth;
    private String jobTitle;
    private String store;
    private Boolean sex;

}
