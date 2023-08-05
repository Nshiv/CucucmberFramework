Feature: company logo on Homepage of application

  @smoke
  Scenario: Logo on homepage
    Given User is on HomePage with "Practice Page"
    When User browse header section of page
    Then Company logo should be present


