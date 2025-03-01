package electronicsstore.stores.web.model.response.jobtitle;

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
public class JobTitleListResponse {

    private List<JobTitleResponse> jobTitles = new ArrayList<>();

}
