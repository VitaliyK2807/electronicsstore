package electronicsstore.stores.web.model.response.jobtitle;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobTitleResponse {

    private Long id;
    private String name;

}
