Feature: Testing of the registration module

  Scenario Outline: Successful registration
    Given that the user is on the index page
    When the user enter the following personal data
    Then the user should see my account icon

    Examples:
      | email                   | password | confirmPassword |
      | jose.costaros@gmail.com | 1234     | 1234            |