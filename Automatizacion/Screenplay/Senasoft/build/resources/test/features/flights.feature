Feature: Testing of the flights module

  Scenario: Search for flights for a specific destination
    Given that the user is on the "flights" page
    When the user enter the data for her search and clicks on search
    Then the user should see the results of their search

  Scenario: Viewing price breakdown for a flight
    Given the user search a "flights"
    When the user clicks on price breakdown icon
    Then user should see a modal view with the price breakdown

  Scenario: view flight details
    Given that the user search a "flights"
    When the user selects a flight and clicks on see flight
    Then the user should see a modal view with details of their flight

  Scenario: validate flight selection
    Given that the user see the details of any "flights"
    When the user clicks on select
    Then the user should see the tariff section

  Scenario: validate filters for one-way flights
    Given that apply the filter one way  for "flights"
    When the user enter the data for the search and clicks on search
    Then the user should see the flights with this filter
