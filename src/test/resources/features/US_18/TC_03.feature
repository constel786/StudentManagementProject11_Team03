@us18tc03
Feature:If teacher want to one student's grade delete

  Background: navigating_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When  teacher must be logged website

  Scenario Outline:US_18_TC_03_teacher_delete_exams_grade
    When teacher click on menu
    And teacher click to Student Info Management
    And go to Student info List
    And  go to  "<name>"
    And Click Edit Button for Ali Can
    And Click Choose Lesson
    And Select  "<lesson>"
    And Click Choose Education Term
    And Select edit page "<semester>"
    And Delete midterm exam delete " "
    And Delete final exam delete " "
    And Click Submit button
    Then Verify  midterm exam "Please enter midterm exam " messages
    Then verify final exam "Please enter final exam " messages
    And close the page
    Examples:
      | name    | lesson   | semester      |
      | Ali Can | Selenium | FALL_SEMESTER |