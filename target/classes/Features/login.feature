Feature: Login Facebook Page


Scenario: Facebook Home page is displayed 

Given User is already on login page	
When Title of login page is Facebook
Then User enters "romy8813" and "Diners123"
And user clicks on login button
And home page is displayed