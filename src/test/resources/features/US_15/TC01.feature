@US15
  Feature: Vice Deans should be able to create a student.
    Background: navigating_managementon_school_home_page
      Given user navigates to "https://managementonschools.com"
      When user must be logged in to the website as a vice dean


    @us15tc01
    Scenario: The student’s advisory teacher should be able to be selected.
      When click on Menu
      When click student management
      And Choose Advisor Teacher dropdown
      And enter student Name
      And enter student Surname
      And enter student Birth Place
      And enter student Email
      And enter student Phone Number
      And select Gender
      And select student Date Of Birth
      And enter student SSN
      And enter student User Name
      And enter student Father Name
      And enter student Mother Name
      And enter student Password
      And click on Submit Button









