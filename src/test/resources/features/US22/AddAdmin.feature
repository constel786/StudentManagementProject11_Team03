@US22
Feature: Add Admin Functions

  @TC01
  Scenario: User must be able to enter "Name" and user can not be left blank
    Given user login
    When Enter "" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "SIVAS" in the Birth Place field
    And Select the "female"
    And Enter "20.02.1997" in the Date of Bird field
    And Enter phone number "345-678-1345"
    And Enter ssn number "567-98-1456" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "Jasmine" in the username field
    And Enter "Jasmine34!" in the password field
    And Click the SUBMIT button
    Then Verify that user received required notification under the name field

    @TC02
    Scenario: User must be able to enter "Surname" and user can not be left blank
      Given user login
      When Enter "Jasmine" in the name field
      And Enter "" in the surname field
      And Enter "SIVAS" in the Birth Place field
      And Select the "female"
      And Enter "20.02.1997" in the Date of Bird field
      And Enter phone number "345-678-1345"
      And Enter ssn number "567-98-1456" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
      And Enter "Jasmine" in the username field
      And Enter "Jasmine34!" in the password field
      And Click the SUBMIT button
      Then Verify that user received required notification under the surname field

  @TC03
  Scenario: User must be able to enter "Birth Place" and user can not be left blank
    Given user login
    When Enter "Jasmine" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "" in the Birth Place field
    And Select the "female"
    And Enter "20.02.1997" in the Date of Bird field
    And Enter phone number "345-678-1345"
    And Enter ssn number "567-98-1456" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "Jasmine" in the username field
    And Enter "Jasmine34!" in the password field
    And Click the SUBMIT button
    Then Verify that user received required notification under the Birth Place field

  @TC04 #verify kısmını ve female button değişiklik sor
  Scenario: User must be able to select "Gender" and user can not be left blank
    Given user login
    When Enter "Jasmine" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "SIVAS" in the Birth Place field
    And Select the "female"
    And Enter "20.02.1997" in the Date of Bird field
    And Enter phone number "345-678-1345"
    And Enter ssn number "567-98-1456" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "Jasmine" in the username field
    And Enter "Jasmine34!" in the password field
    And Click the SUBMIT button

    @TC05
    Scenario: User must be able to select "Date of Birth" and user can not be left blank
      Given user login
      When Enter "Jasmine" in the name field
      And Enter "OZTURK" in the surname field
      And Enter "SIVAS" in the Birth Place field
      And Select the "female"
      And Enter "" in the Date of Bird field
      And Enter phone number "345-678-1345"
      And Enter ssn number "567-98-1456" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
      And Enter "Jasmine" in the username field
      And Enter "Jasmine34!" in the password field
      And Click the SUBMIT button
      Then Verify that user received required notification under the Date of Birth field

  @TC06
  Scenario: User must be able to enter "Phone number"  and user can not be left blank
    Given user login
    When Enter "Jasmine" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "SIVAS" in the Birth Place field
    And Select the "female"
    And Enter "20.02.1997" in the Date of Bird field
    And Enter phone number ""
    And Enter ssn number "567-98-1456" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "Jasmine" in the username field
    And Enter "Jasmine34!" in the password field
    And Click the SUBMIT button
    Then Verify that user received required notification under the Phone Number field

  @TC07
  Scenario: User must be able to enter "Ssn" must contain a "-" after the 3rd and 5th digits and must consist of 9 digits in total and user can not be left blank
    Given user login
    When Enter "Jasmine" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "SIVAS" in the Birth Place field
    And Select the "female"
    And Enter "20.01.1997" in the Date of Bird field
    And Enter phone number "345-678-1345"
    And Enter ssn number "" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "Jasmine" in the username field
    And Enter "Jasmine34!" in the password field
    And Click the SUBMIT button
    Then Verify that user received required notification under the Ssn field

  @TC08
  Scenario: User must be able to enter "Username" and user can not be left blank
    Given user login
    When Enter "Jasmine" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "SIVAS" in the Birth Place field
    And Select the "female"
    And Enter "20.01.1997" in the Date of Bird field
    And Enter phone number "345-678-1345"
    And Enter ssn number "567-98-1456" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "" in the username field
    And Enter "Jasmine34!" in the password field
    And Click the SUBMIT button
    Then Verify that user received required notification under the username field

  @TC09
  Scenario: User must be able to enter "Password" must consist of 8 characters including uppercases, lowercases and a number and user can not be left blank
    Given user login
    When Enter "Jasmine" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "SIVAS" in the Birth Place field
    And Select the "female"
    And Enter "20.01.1997" in the Date of Bird field
    And Enter phone number "345-678-1345"
    And Enter ssn number "567-98-1456" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "Jasmine" in the username field
    And Enter "" in the password field
    And Click the SUBMIT button
    Then Verify that user received required notification under the password field

  @TC10
  Scenario: User must be able to enter valid data in all field
    Given user login
    When Enter "Jasmine" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "SIVAS" in the Birth Place field
    And Select the "female"
    And Enter "20.01.1997" in the Date of Bird field
    And Enter phone number "345-678-1345"
    And Enter ssn number "567-98-1456" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "Jasmine" in the username field
    And Enter "Jasmine34!" in the password field
    And Click the SUBMIT button
    Then Verify that user received saved notification pop up

  @TC11
  Scenario: User must be able to enter "Ssn" must contain a "-" after the 3rd and 5th digits and must consist of 9 digits in total and user can not be left blank
    Given user login
    When Enter "Jasmine" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "SIVAS" in the Birth Place field
    And Select the "female"
    And Enter "20.01.1997" in the Date of Bird field
    And Enter phone number "345-678-1345"
    And Enter ssn number "12323534565745" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "Jasmine" in the username field
    And Enter "Jasmine34!" in the password field
    And Click the SUBMIT button
    Then Verify that user received invalid notification pop up

  @TC12
  Scenario: User must be able to enter "Password" must consist of 8 characters including uppercases, lowercases and a number and user can not be left blank
    Given user login
    When Enter "Jasmine" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "SIVAS" in the Birth Place field
    And Select the "female"
    And Enter "20.01.1997" in the Date of Bird field
    And Enter phone number "345-678-1345"
    And Enter ssn number "12323534565745" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "Jasmine" in the username field
    And Enter "ASDFGH123" in the password field
    And Click the SUBMIT button
    Then Verify that user received LOWERCASE required notification under the Password field

  @TC13
  Scenario: User must be able to enter "Password" must consist of 8 characters including uppercases, lowercases and a number and user can not be left blank
    Given user login
    When Enter "Jasmine" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "SIVAS" in the Birth Place field
    And Select the "female"
    And Enter "20.01.1997" in the Date of Bird field
    And Enter phone number "345-678-1345"
    And Enter ssn number "12323534565745" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "Jasmine" in the username field
    And Enter "abcdef123" in the password field
    And Click the SUBMIT button
    Then Verify that user received UPPERCASE required notification under the Password field

  @TC14
  Scenario: User must be able to enter "Password" must consist of 8 characters including uppercases, lowercases and a number and user can not be left blank
    Given user login
    When Enter "Jasmine" in the name field
    And Enter "OZTURK" in the surname field
    And Enter "SIVAS" in the Birth Place field
    And Select the "female"
    And Enter "20.01.1997" in the Date of Bird field
    And Enter phone number "345-678-1345"
    And Enter ssn number "12323534565745" must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field
    And Enter "Jasmine" in the username field
    And Enter "ABCDEFabcdef" in the password field
    And Click the SUBMIT button
    Then Verify that user received NUMBER required notification under the Password field