@us17tc07
  Feature:Teacher not entered "Info note"
    Background: navigating_managementon_school_home_page
      Given user navigates to "https://managementonschools.com"
      When  teacher must be logged website

    Scenario: US_17_TC_07_add_student_info_not_entered_info_note
      When teacher click on menu
      And teacher click to Student Info Management
      And go to Choose Lesson
      And select Selenium
      And go to Choose Student
      And select Jessie Pinkman
      And go to Choose Education Term
      And select FALL_SEMESTER
      And entered Absentee 1
      And entered Midterm Exam 90
      And entered Final Exam 95
      And not entered info Note
      And click on Submit button
      Then Verify info note "Required" message
      And close the page