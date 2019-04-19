$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:login.feature");
formatter.feature({
  "name": "Login Facebook Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Facebook Home page is displayed",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDefinition.userOnLoginPAge()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Title of login page is Facebook",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepDefinition.titlepgeISDisplayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters \"romy8813\" and \"Diners123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepDefinition.enterUserNameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepDefinition.clickLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "home page is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepDefinition.homePageDisplayed()"
});
formatter.result({
  "status": "passed"
});
});