Feature: Etsy search functionality

  Background:
    Given the user navigates to "https://www.etsy.com/"
@regressionoutline
  Scenario Outline: Validation of etsy search Hat
    When the user searches with "<searchValue>"
    Then the user validates the title "<titleValidation>"
    Examples:
      | searchValue | titleValidation |
      | Hat         | Hat \| Etsy     |
      | Key         | Key \| Etsy     |
      | Pin         | Pin \| Etsy     |

    #command+option+L --> organize
