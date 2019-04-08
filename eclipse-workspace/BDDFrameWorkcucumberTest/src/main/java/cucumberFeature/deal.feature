Feature: Deal data creation

Scenario: Free CRM creat a new deal Scenario
Given User is already on login page
When title of login page is Free CRM
Then user enters username and password
|naveek | test@123 |
Then user click on login button
Then user moves to new deal page
Then user enters deal details
| test deal | 1000 | 50 | 10 |
Then close browser