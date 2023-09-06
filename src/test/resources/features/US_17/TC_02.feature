@us17tc02
Feature:Teacher not select "choose lesson"
  Background:  navigating_managementon_school_home_page
    Given teacher navigates to "https://managementonschools.com"
    When  teacher must be logged website

  Scenario:US_17_TC_02_add_student_info_not_select_choose_lesson
    When teacher click on menu
    And teacher click to Student Info Management
    And go to Choose Lesson
    And not select Lesson
    And go to Choose Student
    And select Asuman Aydinci
    And go to Choose Education Term
    And select SPRING_SEMESTER
    And entered Absentee 5
    And entered Midterm Exam 50
    And entered Final Exam 40
    And entered Info Note "must be better"
    And click on Submit button
    Then Verify "Please select session" message
    And close the page
