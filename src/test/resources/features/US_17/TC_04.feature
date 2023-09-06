@us17tc04
  Feature: Teacher not entered "absentee"
    Background: navigating_managementon_school_home_page
      Given teacher navigates to "https://managementonschools.com"
      When  teacher must be logged website

    Scenario: US_17_TC_04_add_student_info_not_entered_absentee
      When teacher click on menu
      And teacher click to Student Info Management
      And go to Choose Lesson
      And select Selenium
      And go to Choose Student
      And select Jessie Pinkman
      And go to Choose Education Term
      And select FALL_SEMESTER
      And not entered Absentee
      And entered Midterm Exam 90
      And entered Final Exam 95
      And entered Info Note "so successfully, keep going"
      And click on Submit button
      Then Verify "Required" message
      And close the page