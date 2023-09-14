@US13
Feature: User must be logged in as Vice Dean
  Background: navigating_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When user must be logged in to the website as a vice dean

@TC01
Scenario: Vice Deans should be able to create a teacher
  Given user login
  When Click the Menu button
  When Enter "Georgy" in the name field
  And Enter "Hoca" in the surname field
  And Enter "London" in the Birth Place field
  And Select "Male" in the Gender field
  And Enter "12.10.1992" in the Date of Birth field
  And Enter phone number "345-678-1345"
  And Enter ssn number "567-98-1456" must contain a hyphen after the third and fifth digits and must consist of nine digits in total in the Ssn field
  And Enter "Jasmine" in the username field
  And Enter "Jasmine34!" in the password field
  And Click the Submit button
  Then Verify that user received required notification under the name field

