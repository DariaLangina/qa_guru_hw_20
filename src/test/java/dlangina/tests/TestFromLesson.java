package dlangina.tests;

import static dlangina.filters.CustomLogFilter.customLogFilter;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestFromLesson {

  @Disabled("Не является частью дз")
  @Test
  void authorizeTest() {
    String data = "{" +
                  "  \"userName\": \"alex\"," +
                  "  \"password\": \"asdsad#frew_DFS2\"" +
                  "}";

    given()
        .filter(customLogFilter().withCustomTemplates())
        .contentType("application/json")
        .accept("application/json")
        .body(data)
        .when()
        .log().uri()
        .log().body()
        .post("https://demoqa.com/Account/v1/GenerateToken")
        .then()
        .log().body()
        .body("status", is("Success"))
        .body("result", is("User authorized successfully."));
  }
}
