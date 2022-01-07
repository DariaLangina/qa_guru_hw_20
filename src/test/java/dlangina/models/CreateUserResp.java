package dlangina.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUserResp {

  private String name;
  private String job;
  private int id;
  private String createdAt;
}
