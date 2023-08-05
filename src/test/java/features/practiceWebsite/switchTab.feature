Feature: Handle multiple opened tabs

  Background: User is on Homepage
  @smoke
  Scenario: Navigate to opened tab and get the url
    When User click on open tab button
    Then User navigate to opened tab
    And Validate the URL and Title of the tab
    And Navigate Back to main tab




