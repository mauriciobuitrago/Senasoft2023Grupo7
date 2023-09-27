Feature: Housing
  Scenario: Housing Successful
    Given that the user is on the housing page
    When the user apply the following filters
    And the user reserves the number of rooms of the best option
    And the user fills the forms to reserve the housing with following data
    And the the user accept terms and clicks on complete the booking
    Then the user should see the booking confirm