Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Create a new contact Test
Given User is already on login page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user click on login button
Then user move on contact tab
Then user enters contact deatils "<firstname>" and "<lastname>" and "<position>"

Examples:
| username | password | firstname | lastname |position |
| naveenk  | test@123 | Tom       | Peter	 | Manger  |	
| naveenk  | test@123 | David     | Dsouza   | Director|

