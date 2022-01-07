package dlangina.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UpdateUserNameAndJobReq {

  private String name;
  private String job;
}
