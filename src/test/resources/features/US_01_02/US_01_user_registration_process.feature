@US01 @bedo
Feature: US01 Register Process by Guest User

  Scenario Outline: US01_TC01_entering_all_credentials_correctly

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "<name>"
    And user fills the surname input "<surname>"
    And user fills the birth place input "<birth_place>"
    And user fills the phone number input "<phone_number>"
    And user selects gender
    And user fills the birthday input "<birthday>"
    And user fills the SSN input "<SSN>"
    And user fills the username input "<username>"
    And user fills the password input "<password>"
    And user clicks register button
    And verify that registration has been successfully done
    And close the page
    Examples:
      | name          | surname       | birth_place | phone_number | birthday | SSN         | username       | password  |
      | bedotestguest | bedotestguest | earth       | 090-098-0908 | 18051993 | 111-11-5390 | bedotestguest  | BedoTest1 |


  @delete_guest @US02_TC01
  Scenario: delete_the_guest_user

    Given delete this name "bedotestguest" from guest users
    And close the page

    @US01_TC02
  Scenario: US01_TC02_leaving_name_input_empty
    Given user goes to homepage
    And user clicks on register

    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0909"
    And user selects gender
    And user fills the birthday input "18051993"
    And user fills the SSN input "111-11-5391"
    And user fills the username input "bedotestguest1"
    And user fills the password input "BedoTest1"
    And user clicks register button
    And verify that registration is not allowed
    And close the page

  @US01_TC03
  Scenario: US01_TC03_leaving_surname_input_empty

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"

    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0910"
    And user selects gender
    And user fills the birthday input "18051993"
    And user fills the SSN input "111-11-5392"
    And user fills the username input "bedotestguest2"
    And user fills the password input "BedoTest1"
    And user clicks register button
    And verify that registration is not allowed
    And close the page

    @US01_TC04
  Scenario: US01_TC04_leaving_birthplace_input_empty

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"

    And user fills the phone number input "090-098-0911"
    And user selects gender
    And user fills the birthday input "18051993"
    And user fills the SSN input "111-11-5393"
    And user fills the username input "bedotestguest3"
    And user fills the password input "BedoTest1"
    And user clicks register button
    And verify that registration is not allowed
    And close the page

  @US01_TC05
  Scenario: US01_TC05_leaving_phone_number_input_empty

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"

    And user selects gender
    And user fills the birthday input "18051993"
    And user fills the SSN input "111-11-5394"
    And user fills the username input "bedotestguest4"
    And user fills the password input "BedoTest1"
    And user clicks register button
    And verify that registration is not allowed
    And close the page

  @US01_TC06
  Scenario: US01_TC06_leaving_gender_empty

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0912"

    And user fills the birthday input "18051993"
    And user fills the SSN input "111-11-5395"
    And user fills the username input "bedotestguest5"
    And user fills the password input "BedoTest1"
    And user clicks register button
    And verify that registration button is still displayed
    And close the page

  @US01_TC07
  Scenario: US01_TC07_leaving_birthday_input_empty

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0913"
    And user selects gender

    And user fills the SSN input "111-11-5396"
    And user fills the username input "bedotestguest6"
    And user fills the password input "BedoTest1"
    And user clicks register button
    And verify that registration is not allowed
    And close the page

  @US01_TC08
  Scenario: US01_TC08_leaving_SSN_input_empty

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0914"
    And user selects gender
    And user fills the birthday input "18051993"

    And user fills the username input "bedotestguest7"
    And user fills the password input "BedoTest1"
    And user clicks register button
    And verify that registration is not allowed
    And close the page

  @US01_TC09
  Scenario: US01_TC09_leaving_username_input_empty

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0915"
    And user selects gender
    And user fills the birthday input "18051993"
    And user fills the SSN input "111-11-5397"

    And user fills the password input "BedoTest1"
    And user clicks register button
    And verify that registration is not allowed
    And close the page

  @US01_TC10
  Scenario: US01_TC10_leaving_password_input_empty

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0916"
    And user selects gender
    And user fills the birthday input "18051998"
    And user fills the SSN input "111-11-5393"
    And user fills the username input "bedotestguest8"

    And user clicks register button
    And verify that password is empty
    And close the page

  @US01_TC11
  Scenario: US01_TC11_password_requirements_didnt_met

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0916"
    And user selects gender
    And user fills the birthday input "18051998"
    And user fills the SSN input "111-11-5393"
    And user fills the username input "bedotestguest9"
    And user fills the password input "BEDOTEST1"
    And user clicks register button
    And verify password need lowercase
    And close the page

  @US01_TC12
  Scenario: US01_TC12_password_requirements_didnt_met

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0916"
    And user selects gender
    And user fills the birthday input "18051998"
    And user fills the SSN input "111-11-5393"
    And user fills the username input "bedotestguest10"
    And user fills the password input "bedotest1"
    And user clicks register button
    And verify password need uppercase
    And close the page

  @US01_TC13
  Scenario: US01_TC13_password_requirements_didnt_met

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0916"
    And user selects gender
    And user fills the birthday input "18051998"
    And user fills the SSN input "111-11-5393"
    And user fills the username input "bedotestguest11"
    And user fills the password input "BedoTest"
    And user clicks register button
    And verify password need digit
    And close the page

  @US01_TC14
  Scenario: US01_TC14_password_requirements_didnt_met

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0916"
    And user selects gender
    And user fills the birthday input "18051998"
    And user fills the SSN input "111-11-5393"
    And user fills the username input "bedotestguest12"
    And user fills the password input "BEDOTEST"
    And user clicks register button
    And verify password need lowercase
    And close the page

  @US01_TC15
  Scenario: US01_TC15_password_requirements_didnt_met

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0916"
    And user selects gender
    And user fills the birthday input "18051998"
    And user fills the SSN input "111-11-5393"
    And user fills the username input "bedotestguest13"
    And user fills the password input "bedotest"
    And user clicks register button
    And verify password need uppercase
    And close the page


  @US01_TC16
  Scenario: US01_TC16_password_requirements_didnt_met

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0916"
    And user selects gender
    And user fills the birthday input "18051998"
    And user fills the SSN input "111-11-5393"
    And user fills the username input "bedotestguest14"
    And user fills the password input "12345678"
    And user clicks register button
    And verify password need lowercase
    And close the page


  @US01_TC17
  Scenario: US01_TC17_password_requirements_didnt_met

    Given user goes to homepage
    And user clicks on register
    And user fills the name input "bedotestguest"
    And user fills the surname input "bedotestguest"
    And user fills the birth place input "earth"
    And user fills the phone number input "090-098-0916"
    And user selects gender
    And user fills the birthday input "18051998"
    And user fills the SSN input "111-11-5393"
    And user fills the username input "bedotestguest15"
    And user fills the password input "Bedo1"
    And user clicks register button
    And verify password is shorter than 8 characters
    And close the page




#  Go to product homepage
#  Click on register
#  Fill the "name" input
#  Fill the "surname" input
#  Fill the "birth place" input
#  "Fill the ""phone number"" input
#  in the correct format
#  (xxx-xxx-xxxx)"
#  "Select either ""male""
#  or ""female"" from radioboxes"
#  Fill the "birthday" input
#  "Fill the ""SSN"" input in correct form
#  (xxx-xx-xxxx)"
#  Fill the "username" input
#  "fill in the ""password"" input
#  according to the required conditions
#  (password must be at least
#  8 character long, your password must contain
#  at least one lowercase character,
#  one uppercase character and a number)"
#  Click on "register" button
#  Verify registration has been successfully done
