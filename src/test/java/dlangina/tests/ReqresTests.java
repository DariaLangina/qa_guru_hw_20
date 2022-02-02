package dlangina.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ReqresTests extends TestBase {

  @Test
  @DisplayName("Запрос информации о пользователе по id")
  void getUserInfo() {
    api.getInformationOfUserById(1);
  }

  @Test
  @DisplayName("Запрос кол-ва страниц с пользователями")
  void getAmountPagesWithUsers() {
    System.out.println("Кол-во страниц: " + api.getTotalUsers());
  }

  @Test
  @DisplayName("Добавление нового пользователя по API")
  void createUserForTests() {
    api.createUser("Daria", "R-vision");
  }

  @Test
  @DisplayName("Изменение имени и места работы пользователя")
  void changingNameAndJob() {
    api.updateUserNameAndJob(2, "morpheus", "zion resident");
  }

  @Test
  @DisplayName("Проверка выполнения регистрации пользователя по API")
  void registration() {
    api.registrationByApi();
  }

  @Test
  @DisplayName("Проверка невозможности регистрации без указания пароля")
  void registrationNoPassword() {
    api.unsuccessfulRegistrationNoPassword();
  }

  @Test
  @DisplayName("Проверка наличия пользователя по email с опредененным доменным именем")
  void checkAddedUserByEmail() {
    api.checkEmailWithDomainName("eve.holt@reqres.in");
  }
}
