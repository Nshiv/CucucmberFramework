Feature: Select country from the list of countries on typing
  @Search
  Scenario: Select a search input from a dropdown list
    Given User is on Homepage with title "Practice Page"
    When User type first three letter of country name as "Ind"
    Then Select country "India" from dropdown list
    And Selected country should be display in search bar