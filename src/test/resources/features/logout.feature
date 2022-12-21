Feature: This feature allows user to logout


  Scenario: User can logout
      Given user navigate to the login page
    And user verify login page it's displayed
    When user enters the valid username and password
    And user verify home page it's displayed
    And user clicks on profile menu link
    Then user click on logout link
    And check if user is on login page