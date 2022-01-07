package dlangina.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserReq {

  private String name;
  private String job;
}
