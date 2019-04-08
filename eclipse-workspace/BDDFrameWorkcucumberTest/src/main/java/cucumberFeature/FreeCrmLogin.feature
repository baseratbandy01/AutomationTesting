Feature: Login Action For Free CRM
#without Example Keyword

#Scenario: Free CRM Login Test
#Given User is already on login page
#When title of login page is Free CRM
#Then user enters "basirat" and "Aafiya07"
#Then user click on login button
#And check weather username and password is valid

Scenario: On Home Page Navigate on Features Tab
Given user will click on feature tab
When user will land on feature tab user will click on home button
Then user will land on home page again and driver web page should get close


#with examples kayword

Scenario Outline: Free CRM Login Test
Given User is already on login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user click on login button
And check weather username and password is valid

Examples:
	| username| password|
	|basirat  | Aafiya07|
	| irfan   |Aamina10 |
 	|bas      | Aliya	|