Feature: Housing
  Scenario: Housing
    Given that the user is on the housing page
    When the user apply the following filters
    And the user reserves the number of rooms of the best option
    And the user fills the forms to reserve the housing with following data
    Then the user should see the booking confirm

  Scenario: search housing successful
    Given that the user is on the housing page
    When the user enter the filter data
    And the user clicks on search button
    Then the user should see the results of their search"