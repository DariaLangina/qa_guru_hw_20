package dlangina.models.userInformation;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDataResp {

  @JsonProperty("last_name")
  private String lastName;

  private Integer id;

  private String avatar;

  @JsonProperty("first_name")
  private String firstName;

  private String email;
}
