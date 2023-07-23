Feature: Select and Deselect values from drodown values on homepage

  Background:User is on Homepage

  Scenario: Select first dropdown value from dropdown list
    When User select first dropdown value by Index 1
    Then Corresponding value should be selected


  Scenario: Select last dropdown value from dropdown list
    When User select dropdown value of last index
    Then Validate the last value selected


  Scenario: Select a dropdown value and deselct
    When User select a dropdown value by value
    And  User deselect selected value
    Then Validate droplist values should not be selected



