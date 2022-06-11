Feature: Home Page of the Application 

Background: 
Given user has already logged  into Application
|username|password|
|NimpyNinja|QAAUTOMATION|


Scenario: Home page title
Given user is on home page
When user gets the title of the page
Then  page title should be "NumpyNinja"


Scenario: Data Structure Module link
Given user is on home page
When user clicks on first link 
Then  user should land on Data Structure page

Scenario: Verify Data Structure Introduction page
Given user is on data strucure page
When user clicks on first link of data strucure
Then user should navigated to "Time Complexity" page
And page title should be "Time Complexity"
When user clicks on tryhere button 
Then user should navigated to "Try edit page"
And enters text in text box
And Clicks on Run button
Then user should see output text