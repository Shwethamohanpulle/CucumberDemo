Feature: Login feature




Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login"




Scenario: Login with correct credentials
Given user is on login page
When user enters username "NimpyNinja"
And user enters password "QAAUTOMATION"
And user clicks on login button
Then user gets the title of the page
And page title should be "NumpyNinja"


