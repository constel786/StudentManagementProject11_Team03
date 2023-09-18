@US15
Feature: Vice Deans should be able to create a student.
  Background: navigating_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When user must be logged in to the website as a vice dean

    @us15tc18
    Scenario: The student's birth place should left blank. (Negative Test)
      When click on Menu3
      When click on Student management3
      And Choose Advisor Teacher dropdown3
      And enter student Name3
      And enter student Surname3
      And do not enter student birth place
      And enter student Email3
      And enter student Phone Number3
      And select Gender3
      And select student Date Of Birth3
      And enter student SSN3
      And enter student User Name3
      And enter student Father Name3
      And enter student Mother Name3
      And enter student Password3
      And click on Submit Button3

