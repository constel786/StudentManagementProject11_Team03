@us08

Feature: Add Lesson

  As a Vice Dean
  I want to be able to add a lesson
  So that I can create new courses

  @us08tc02
  Scenario Outline: Add lesson without compulsory checkbox
    Given user is logged in as a Vice Dean
    And user clicks the "Lessons" button
    And user enters "<Lesson Name>" in the "Lesson Name" field
    And user clicks the Compulsory checkbox
    And user enters "<Credit Score>" in the Credit Score field
    And user clicks the "Submit" button
    Then the lesson "<Lesson Name>" should be created

    Examples:
      | Lesson Name       | Credit Score|
      | Pavement Design   |      6      |
      | Mathematical      |      5      |
      | Highway Design    |      3      |
      | Statistic         |      5      |


