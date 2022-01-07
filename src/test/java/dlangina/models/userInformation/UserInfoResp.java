package dlangina.models.userInformation;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserInfoResp {

  @JsonProperty("data")
  private UserDataResp userDataResp;

  @JsonProperty("support")
  private UserSupportResp userSupportResp;
}
