Feature: WebOrder Page Food Order

  Background:
    Given the user is on the webOrder homepage
    When the user selects "Office" options
    And the user is on the groupOrderPage
    And the user sends invitation note "Test"
    And the user sends invite list "aizhana@gmail.com" and "kerima@gmail.com"

  Scenario: Validation Food Order for Office
  #  Given the user is on the webOrder homepage
#    When the user selects "Office" options
#    And the user is on the groupOrderPage
#    And the user sends invitation note "Test"
#    And the user sends invite list "aizhana@gmail.com" and "kerima@gmail.com"
    Then the user validates the "2012 EMPIRE BLVD" address
    And the user validates "View Group Order" text
    * the user validates total participants is 1
@smoke
  Scenario: Validation Food Order for Office
  #  Given the user is on the webOrder homepage
#    When the user selects "Office" options
#    And the user is on the groupOrderPage
#    And the user sends invitation note "Test"
#    And the user sends invite list "aizhana@gmail.com" and "kerima@gmail.com"
    And the user selects "My House" options
    Then the user validates the "2112 EMPIRE BLVD" address
    And the user validates "View Group Order" text
    * the user validates total participants is 1