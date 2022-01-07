package dlangina.tests;

import static dlangina.base.Api.setUpRestAssured;

import com.codeborne.selenide.logevents.SelenideLogger;
import dlangina.base.Api;
import io.qameta.allure.junit5.AllureJunit5;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith({AllureJunit5.class})
public class TestBase {

  public static Api api = new Api();

  @BeforeAll
  static void setUp() {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    setUpRestAssured();
  }

}
