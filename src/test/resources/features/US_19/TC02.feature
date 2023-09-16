@TC02
Feature:The teacher must select different date for the same student
  Background: goes_to_managementon_school_url
    Given user navigates to "https://managementonschools.com"

  Scenario Outline: TC02_add_meet
    When user clicks on home page login button
    When user logged the username "MasterTeacher11"
    When user logged password "Nowayjose1234"
    When user clicks on the login
    When user clicks to Menu
    When user clicks to Meet Managment
    And select student "<student_name>",  "<day_of_meet>" ,"<start_time>",  "<stop_time>",   "<description>"
    And user clicks on the submit button
    Then Verify "Error: Meet schedule cannot be selected for the same hour and day"
    And close the page

    Examples:
      | student_name  | day_of_meet | start_time | stop_time | description |
      | Barbera Smith | 10-05-2025  | 09:00      | 10:00     | Review      |