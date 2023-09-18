@tc04

Feature:The teacher can not arrange meeting without selecting student`s name
  Background: goes_to_managementon_school_url
    Given user navigates to "https://managementonschools.com"

  Scenario Outline: TC04_add_meet
    When user clicks on home page login button
    When user logged the username "MasterTeacher11"
    When user logged password "Nowayjose1234"
    When user clicks on the login
    When user clicks to Menu
    When user clicks to Meet Managment
    And selectdate  "<day_of_meet>"
    And selecttime ,"<start_time>",
    And selectstime "<stop_time>",
    And selectdes "<description>"
    And user clicks on the submit button
    Then verify the message
    And close the page

    Examples:


      | day_of_meet | start_time | stop_time | description |
      | 12-09-2024  | 05:00      | 06:00     | Grades      |