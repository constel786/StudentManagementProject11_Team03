@US24_01
Feature: Admin should be able to add teacher.
  Background: admin_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When user must be logged in to the website as a admin


  @us24tc01
  Scenario: Admin should add teacher with correct credentials.
    When click on Menu
    When click Teacher management
    And click Lesson dropdown
    And choose lesson
    And enter teacher Name
    And enter teacher Surname
    And enter teacher Birth Place
    And enter teacher Email
    And enter teacher Phone Number
    And enter is Advisor Teacher
    And select Gender
    And select actual Date Of Birth
    And enter teacher valid SSN
    And enter teacher User Name
    And enter teacher with required credentials Password
    And click on Submit Button

  @DataBase_Test2
  Scenario Outline: Validate registered user on database
    Given connect to database for teacher
    When get teacher via name "<name>"
    Then validate for teacher username "<username>" birth_day "<birth_day>" birth_place "<birth_place>" gender "<gender>" name "<name>" phone_number "<phone_number>" ssn  "<ssn>" surname "<surname>"
    And close connection
    Examples:
      | name | username | birth_day  | birth_place | gender | phone_number | ssn         | surname |
      | Gojo | gojos    | 1999-09-09 | jpn         | 1      | 231-879-5678 | 789-34-8888 | hriw    |









