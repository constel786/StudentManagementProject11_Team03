 @tc05

Feature:Past date should not be entered
  Background: goes_to_managementon_school_url
    Given user navigates to "https://managementonschools.com"

  Scenario Outline: TC05_add_meet
    When user clicks on home page login button
    When user logged the username "MasterTeacher11"
    When user logged password "Nowayjose1234"
    When user clicks on the login
    When user clicks to Menu
    When user clicks to Meet Managment
    And select student "<student_name>",  "<day_of_meet>" ,"<start_time>",  "<stop_time>",   "<description>"
    And user clicks on the submit button
    Then verify the alert
    And close the page
    Examples:
      | student_name | day_of_meet | start_time | stop_time | description |
      | Adam Wiegand | 01-01-2023  | 12:00      | 13:00     | Review      |