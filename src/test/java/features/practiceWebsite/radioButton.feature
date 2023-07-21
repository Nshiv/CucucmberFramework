Feature: Radio button events on Landing page

 Background:
 Given User is on Practice Landing Page

   @Regression
  Scenario: Check selected Radio button on screen
    When  User click on first radio button
    Then Radio button should be selected
  @Regression
  Scenario: Get all radiobutton count on screen
    When  User get all displayed list of radio buttons on page
    Then  All approved Radio buttons should be on screen

  @Regression
  Scenario Outline: Match Radio button heading texts
    When  User get radio button heading texts on screen
    Then  Text should be mached with <text>
    Examples:
      | text                 |
      | Radio Button Example |










