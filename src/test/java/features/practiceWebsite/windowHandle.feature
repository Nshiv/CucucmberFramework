Feature: Handle multiple opened windows

  Background: User is on Homepage
  @wip
  Scenario: Navigate to opened window and get the logo validation
    When User click on open window button
    Then User switched to opened child window
    And Validate the URL and Title of the window
    And Navigate Back to Parent Window




