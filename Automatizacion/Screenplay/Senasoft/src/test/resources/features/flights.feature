Feature: Testing of the flights module

  Scenario: Search for flights for a specific destination
    Given that the user is on the flights page
    When the user enter the data for her search and clicks on search
    Then the user should see the results of their search
