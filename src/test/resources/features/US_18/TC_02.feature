@us18tc02
Feature: If teacher want to student's grade update

  Background:navigating_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When  teacher must be logged website

Scenario:US_18_TC_02_teacher_update_exams_grade
  When teacher click on menu
  And teacher click to Student Info Management
  And go to Student info List
  And Select James Bond
  And Click "Edit Button"
  And Click Choose Lesson
  And Select "Selenium" lesson
  And Click Choose Education Term
  And Select edit page FALL_SEMESTER
  And Entered Absentee
  And Click Midterm Exam
  And Entered new grade midterm exam
  And Click Final Exam
  And Entered new grade final_exam
  And Entered info note
  And Click Submit button
  Then Verify Student Info updated Successfully message
  And close the page





















