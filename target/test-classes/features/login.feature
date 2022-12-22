Feature: This feature allows user to login

 @smoke
  Scenario: user can login with valid credentials
    Given user navigate to the login page
    When user verify login page it's displayed
    And user enters the valid username and password
    Then user verify home page it's displayed

