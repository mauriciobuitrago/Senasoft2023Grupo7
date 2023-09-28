Feature: Testing of the tourist activities module
  Scenario: search for tourist attractions
    Given the user is on the "tourist attractions" page
    When the user enter the data and clicks on search
    Then the user should see the results for their search

  Scenario: see availability of a tourist attraction
    Given the user is looking for a city to do "tourist attractions"
    When the user clicks on see disponibility
    Then the user should see tickets and prices