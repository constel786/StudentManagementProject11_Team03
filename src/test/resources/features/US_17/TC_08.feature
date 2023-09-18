@us17tc08
Feature:The Teacher, must be entered without missing field
  Background: navigating_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When  teacher must be logged website

  Scenario:US_17_TC_02_add_student_hector_salamanca
    When teacher click on menu
    And teacher click to Student Info Management
    And go to Choose Lesson
    And select Selenium
    And go to Choose Student
    And select Hector Salamanca
    And go to Choose Education Term
    And select SPRING_SEMESTER
    And entered Absentee 5
    And entered Midterm Exam 50
    And entered Final Exam 40
    And entered Info Note "must be better"
    And click on Submit button
    Then Verify "Error: Student Info with lesson name Selenium already register" message
    And close the page
