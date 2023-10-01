@us08
Feature: Vice Dean should be able to add a new compulsory lesson

  Background: Navigating to management on school home page
    Given user navigates to "https://managementonschools.com"
    And user must be logged in to the website as a Vice Dean

  @newLesson
  Scenario Outline: Adding a new compulsory lesson
    When user clicks on the "Lessons" tab
    And user enters "<Lesson Name>"
    And user clicks on the "Compulsory" checkbox
    And user enters "<Credit Score>"
    Then user clicks on the "Submit" button
    And user verifies that the new lesson is added successfully

    Examples:
      | Lesson Name     | Credit Score |
      | Pavement Design |       6      |
      | MathIII         |       6      |
      | Highway Design  |       3      |
      | Statistic       |       5      |
