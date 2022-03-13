Feature: Login functionality for WebOrder page

  Background:
    Given user navigates to the weborder page
@smoke
  Scenario: validation of WebOrder Login positive Scenario
#    Given user navigates to the weborder page
    When user provides credentials
    Then the user is on the home page

    Scenario: Validation of WebOrder Login Negative Scenario 1
#      Given user navigates to the weborder page
      When user provides correct username and wrong password
      Then user validates the "Sign in Failed" error message

  Scenario: Validation of WebOrder Login Negative Scenario 2
#    Given user navigates to the weborder page
    When user provides wrong "aizhana" and "abdull"
    Then user validates the "Sign in Failed" error message
@smoke @regression
  Scenario: Validation of WebOrder Login Negative Scenario 3
#    Given user navigates to the weborder page
    When user provides empty username and password
    Then user validates the "Sign in Failed" error message