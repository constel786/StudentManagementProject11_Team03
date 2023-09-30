
@us18tc04
Feature:If teacher want to delete one student

  Background: navigating_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When  teacher must be logged website

  Scenario:US_18_TC_03_teacher_delete_one_student
    When teacher click on menu
    And teacher click to Student Info Management
    And go to Student info List
    And go to  "Ali Can"
    And  Click "Delete" Button
    Then  Verify delete "Student Info deleted Successfully"
    And close the page