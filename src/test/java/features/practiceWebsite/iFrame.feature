 Feature: Handling iframes

   Background: User is on HomePage

      @smoke
     Scenario: Navigate to iframe and perform an action
       When User navigate to iframe
       Then Get validate the logo present on frame
       And Navigate back to main Homepage
