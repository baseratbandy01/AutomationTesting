Feature: Free CRM Create Contacts

Scenario: Free CRM Create a new contact Test
Given User is already on login page
When title of login page is Free CRM
Then user enters username and password
	| username | password |
	| naveenk  | test@123 |
Then user click on login button
Then user move on contact tab
Then user enters contact deatils firstname and lastname and position
	| firstname | lastname |  positon       |
	| irfan 	| sheikh   | IT consultant  |
	| basirat	| sheikh   | IT learner     |
	| tom	    | simth    |  pulmber       |

Then close browser