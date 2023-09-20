@us17tc01
Feature:Student Info Feature

  @us17_UI_Test
  Scenario Outline: US_17_TC_01_add_student_info
    Given go to "https://managementonschools.com"
    When  teacher must be logged website
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

  @Database_Test
  Scenario Outline: Validate register teacher on database
    Given connect to database
    When get teacher via teacher_id "<teacher_id>"
    Then validate lesson "<lesson_lesson_id>" student id "<student_id>" education term "<education_term_id>" absentee "<absentee>" midterm exam "<midterm_exam>" final exam "<final_exam>" info note "<info_note>" letter grade "<letter_grade>" exam average "<exam_average>"
    And close the connection
    Examples:
      | teacher_id | lesson_lesson_id | student_id | education_term_id | absentee | midterm_exam | final_exam | info_note    | letter_grade | exam_average |
      | 127        | 7                | 479        | 1                 | 3        | 85           | 80         | successfully | BA           | 82           |


