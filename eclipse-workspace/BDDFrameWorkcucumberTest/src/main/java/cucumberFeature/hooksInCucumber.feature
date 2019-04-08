Feature: Free CRM App Test
@First
Scenario: free crm create contact test
Given user is on contact page
When user fills the contact form
Then new contact is created
@Second
Scenario: free crm create deal test
Given user is on deal page
When user fills the deal form
Then new deal is created
@Third
Scenario: free crm create contact test
Given user is on mail page
When user fills the mail form
Then new mail is created4 