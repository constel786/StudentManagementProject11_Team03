@us08

Feature: Vice Dean should not add a Lesson

  @us08tc03_Negative1
  Scenario Outline: Add lesson without lesson name
    Given user is logged in as a Vice Dean
    When user clicks the Lessons button
    And user clicks the Compulsory checkbox
    And user enters "<Credit Score>"
    And user clicks the Submit button
    Then an error message should be displayed

    Examples:
      | Credit Score |
      | 5            |
      | 6            |
      | 3            |


