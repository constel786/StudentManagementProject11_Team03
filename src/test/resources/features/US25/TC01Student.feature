@US25_01
Feature: Admin should be able to add a student.
  Background: admin_managementon_school_home_page
    Given admin navigates to "https://managementonschools.com"
    When admin must be logged in to the website as a admin


  @us25tc01
  Scenario: Admin should add student with correct credentials.
    When click on Menu for student
    When click student management
    And click Advisor Teacher dropdown
    And enter student Name
    And enter student Surname
    And enter student Birth Place
    And enter student Email
    And enter student Phone Number
    And select student Gender
    And select student actual Date Of Birth
    And enter student valid SSN
    And enter student User Name
    And enter student Father Name
    And enter student Mother Name
    And enter student Password with required credentials
    And click on student Submit Button

    @DataBase_Test
    Scenario Outline: Validate registered user on database
      Given connect to database
      When get student via name "<name>"
      Then validate username "<username>" birth_day "<birth_day>" birth_place "<birth_place>" gender "<gender>" name "<name>" phone_number "<phone_number>" ssn  "<ssn>" surname "<surname>" fathername "<fathername>" mothername "<motherame>"
      And close the connection
      Examples:
        | name | username | birth_day  | birth_place | gender | phone_number | ssn         | surname | fathername | motherame |
        | Yuji | spryuji  | 2001-10-03 | Japan       | 0      | 899-567-2893 | 876-71-2618 | Itadori | dadyuji    | momyuji   |



