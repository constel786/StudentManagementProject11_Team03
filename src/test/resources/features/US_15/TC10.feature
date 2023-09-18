@US15
Feature: Vice Deans should be able to create a student.
  Background: navigating_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When user must be logged in to the website as a vice dean

@us15tc10
Scenario: The student's username should be entered.
When click on Menu2
When click on student management2
And Choose Advisor Teacher dropdown2
And enter student Name2
And enter student Surname2
And enter student Birth Place2
And enter student Email2
And enter student Phone Number2
And select Gender2
And select student Date Of Birth2
And enter student SSN2
And enter student User Name2
And enter student Father Name2
And enter student Mother Name2
And enter student Password2
And click on Submit Button2