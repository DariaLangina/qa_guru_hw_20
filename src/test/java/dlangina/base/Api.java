package dlangina.base;

import static io.restassured.RestAssured.given;

import dlangina.models.CreateUserResp;
import dlangina.models.UpdateUserNameAndJobReq;
import dlangina.models.UpdateUserResp;
import dlangina.models.UserRegistrationReq;
import dlangina.models.UserRegistrationResp;
import dlangina.models.UserReq;
import dlangina.models.userInformation.UserInfoResp;
import dlangina.models.userInformation.UserSupportResp;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import org.assertj.core.api.SoftAssertions;

public class Api {

  SoftAssertions softly = new SoftAssertions();

  @Step
  public static void setUpRestAssured() {
    RestAssured.requestSpecification = Specs.request;
    RestAssured.responseSpecification = Specs.response;
  }

  @Step
  public void getInformationOfUserById(int id) {
    UserSupportResp userSupportResp = new UserSupportResp();
    UserInfoResp userInfoResp = given()
        .pathParams("id", id)
        .get(EndPoints.user)
        .then()
        .statusCode(200)
        .extract().body().as(UserInfoResp.class);
    softly.assertThat(userInfoResp.getUserDataResp().getId()).isEqualTo(id);
    softly.assertThat(userInfoResp.getUserDataResp().getEmail()).isNotNull();
    softly.assertThat(userInfoResp.getUserDataResp().getFirstName()).isNotNull();
    softly.assertThat(userInfoResp.getUserDataResp().getLastName()).isNotNull();
    softly.assertThat(userInfoResp.getUserDataResp().getAvatar()).isNotNull();
    softly.assertThat(userInfoResp.getUserSupportResp().getUrl()).isEqualTo(
        userSupportResp.getUrl());
    softly.assertThat(userInfoResp.getUserSupportResp().getText()).isEqualTo(
        userSupportResp.getText());
    softly.assertAll();
  }

  @Step
  public String getTotalUsers() {
    return given()
        .get(EndPoints.users)
        .then()
        .statusCode(200)
        .extract().body().jsonPath().getString("total");
  }

  @Step
  public void createUser(String name, String job) {
    UserReq createUserReq = new UserReq(name, job);
    CreateUserResp createUserResp = given()
        .body(createUserReq)
        .post(EndPoints.users)
        .then()
        .statusCode(201)
        .extract().body().as(CreateUserResp.class);
    softly.assertThat(createUserResp.getId()).isNotNull();
    softly.assertThat(createUserResp.getCreatedAt()).isNotNull();
    softly.assertThat(createUserResp.getName()).isEqualTo(name);
    softly.assertThat(createUserResp.getJob()).isEqualTo(job);
    softly.assertAll();
  }

  @Step
  public void updateUserNameAndJob(int id, String name, String job) {
    UpdateUserNameAndJobReq updateUserReq = new UpdateUserNameAndJobReq(name, job);
    UpdateUserResp updateUserResp = given()
        .body(updateUserReq)
        .pathParams("id", id)
        .put(EndPoints.user)
        .then()
        .statusCode(200)
        .extract().body().as(UpdateUserResp.class);

    softly.assertThat(updateUserResp.getName()).isEqualTo(name);
    softly.assertThat(updateUserResp.getJob()).isEqualTo(job);
    softly.assertThat(updateUserResp.getUpdatedAt()).isNotNull();
    softly.assertAll();
  }

  @Step
  public void registrationByApi() {
    UserRegistrationReq userRegistrationReq = new UserRegistrationReq();
    UserRegistrationResp userRegistrationResp = given()
        .body(userRegistrationReq)
        .post(EndPoints.register)
        .then()
        .statusCode(200)
        .extract().body().as(UserRegistrationResp.class);

    softly.assertThat(userRegistrationResp.getId()).isEqualTo(4);
    softly.assertThat(userRegistrationResp.getToken()).isEqualTo("QpwL5tke4Pnpja7X4");
    softly.assertAll();
  }
}
