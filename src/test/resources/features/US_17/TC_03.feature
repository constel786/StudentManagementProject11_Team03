@us17tc03
  Feature: Teacher not select "choose education term"
    Background: navigating_managementon_school_home_page
      Given user navigates to "https://managementonschools.com"
      When  teacher must be logged website

    Scenario: US_17_TC_03_add_student_info_not_select_choose_lesson
      When teacher click on menu
      And teacher click to Student Info Management
      And go to Choose Lesson
      And select Selenium
      And go to Choose Student
      And select Bruce Lee
      And go to Choose Education Term
      And not select choose education term
      And entered Absentee 8
      And entered Midterm Exam 30
      And entered Final Exam 45
      And entered Info Note "must be better"
      And click on Submit button
      Then Verify education term "Please select education term" message
      And close the page