<h1 align="center"> :robot: Проект по автоматизации тестирования в рамках обучения на курсе QA.GURU </h1>

## :rocket: Технологический стек

IntelliJ IDEA, Java, Gradle, JUnit5, Selenide, Jenkins, Allure Report, Allure TestOps,
Jira, Github, Telegram

<p  align="center"

<code><img width="5%" title="IntelliJ IDEA" src="images/logo/IDEA-logo.svg"></code>
<code><img width="5%" title="Java" src="images/logo/java-logo.svg"></code>
<code><img width="5%" title="Gradle" src="images/logo/gradle-logo.svg "></code>
<code><img width="5%" title="JUnit5" src="images/logo/junit5-logo.svg"></code>
<code><img width="5%" title="Selenide" src="images/logo/selenide-logo.svg"></code>
<code><img width="5%" title="Jenkins" src="images/logo/jenkins-logo.svg"></code>
<code><img width="5%" title="Allure Report" src="images/logo/allure-Report-logo.svg"></code>
<code><img width="5%" title="Allure TestOps" src="images/logo/allure-ee-logo.svg"></code>
<code><img width="5%" title="Jira" src="images/logo/jira-logo.svg"></code>
<code><img width="5%" title="Github" src="images/logo/git-logo.svg"></code>
<code><img width="5%" title="Telegram" src="images/logo/Telegram.svg"></code>
</p>

## API тесты

* ✅ Запрос информации о пользователе по id
* ✅ Запрос кол-ва страниц с пользователями
* ✅ Добавление нового пользователя по API
* ✅ Изменение имени и места работы пользователя
* ✅ Проверка выполнения регистрации пользователя по API
* ✅ Проверка невозможности регистрации без указания пароля
* ✅ Проверка наличия пользователя по email с опредененным доменным именем

Serve report:

```bash
allure serve build/allure-results
```

### Запуск в Jenkins

Статистика по запускам <br >
<p align="center">
  <img src="images/readme/jenkins1.png">
</p>

### Отчёт о прохождении автотестов в Allure Report

<p align="center">
  <img src="images/readme/Allure_Report.png">
</p>

### Хранение тестовой документации в Allure TestOps

<p align="center">
  <img src="images/readme/Allure_TestOps1.png">
</p>

<p align="center">
  <img src="images/readme/Allure_TestOps2.png">
</p>

### Интерграция с Jira

<p align="center">
  <img src="images/readme/Jira.png">
</p>

### Уведомления о прохождении автотестов в Telegram

<p align="center">
  <img src="images/readme/Telegram_1.png">
</p>

### Как запустить

### Локально

```
gradle clean test
```

### Удаленно

```
gradle clean test
```

:heart: <a target="_blank" href="https://qa.guru">qa.guru</a><br/>
:blue_heart: <a target="_blank" href="https://t.me/qa_automation">t.me/qa_automation</a>
