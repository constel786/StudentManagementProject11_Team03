@us18tc01
  Feature: Delete Student

  @us18tc01_UI_Test
    Scenario: US_18_TC_01_delete_student_test
      Given go to "https://managementonschools.com"
      When  teacher must be logged website
      When teacher click on menu
      And teacher click to Student Info Management
      And go to Student info List
      And go to  "Ali Veli"
      And Click "Delete" Button
      Then Verify delete "Student Info deleted Successfully"
      And close the page

    @Database_Test_Deleted
    Scenario: Validate deleted user on database
      Given connect to database
      When get teacher via non-existing student id "student_id"
      Then validate if the student is deleted
      And close the connection