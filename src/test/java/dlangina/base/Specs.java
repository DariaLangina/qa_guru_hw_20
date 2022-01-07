package dlangina.base;

import static dlangina.filters.CustomLogFilter.customLogFilter;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.ALL;
import static io.restassured.http.ContentType.JSON;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specs {

  public static RequestSpecification request = with()
      .filter(customLogFilter().withCustomTemplates())
      .baseUri("https://reqres.in")
      .basePath("/api")
      .contentType(JSON)
      .accept(JSON)
      .log().all();

  public static ResponseSpecification response = new ResponseSpecBuilder()
      .expectContentType(JSON)
      .log(ALL)
      .build();
}
