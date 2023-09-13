@us17tc01
Feature:The Teacher, must be entered without missing field
  Background: navigating_managementon_school_home_page
    Given teacher is on the url
    When  teacher must be logged website

  Scenario Outline: US_17_TC_01_add_student_info
    When teacher click on menu
    And teacher click to Student Info Management
    And go to Choose Lesson
    And select Lesson "<Lesson>"
    And go to Choose Student
    And select Student "<student_name>"
    And go to Choose Education Term
    And select Semester "<semester>"
    And entered Absentee "<absentee>"
    And entered Midterm Exam "<midterm_exam>"
    And entered Final Exam "<final_exam>"
    And entered Info Note "<info_note>"
    And click on Submit button
    Then verify "Student Info saved Successfully"
    And close the page
    Examples:
      | Lesson   | student_name   | semester        | absentee | midterm_exam | final_exam | info_note                      |
      | Selenium | Ali Can        | FALL_SEMESTER   | 3        | 85           | 80         | successfully                   |
      | Selenium | Jessie Pinkman | FALL_SEMESTER   | 1        | 90           | 95         | good grades                    |
      | Selenium | Malika Morar   | SPRING_SEMESTER | 6        | 95           | 92         | absentee will be attention     |
      | Selenium | James Bond     | SPRING_SEMESTER | 10       | 40           | 45         | be careful absentee and grades |



