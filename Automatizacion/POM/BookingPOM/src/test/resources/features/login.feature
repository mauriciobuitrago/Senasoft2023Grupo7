Feature: Testing of the login module

  Scenario Outline: Successful login
    Given that the user is on the index page
    When the user click on the login button
    And the user enters the following credentials
      | email   | password   |
      | <email> | <password> |
    Then the user should see my account icon

    Examples:
      | email                  | password      |
      | dsbulla8@misena.edu.co | Senasoft2023* |
