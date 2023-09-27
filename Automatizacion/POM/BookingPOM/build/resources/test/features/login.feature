Feature: Testing of the login module

  Scenario Outline: Successful login
    Given that the user is on the index page
    When the user click on the login button
    And the user enters the following credentials
    Then the user should see my account icon

    Examples:
      | email                   | password | confirmPassword |
      | jose.costaros@gmail.com | 1234     | 1234            |