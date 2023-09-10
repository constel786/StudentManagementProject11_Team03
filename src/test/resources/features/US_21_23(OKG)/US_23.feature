@us_23
  Feature: US_23
    Background:Login with admin account and go to teacher registration
      Given navigate to "https://managementonschools.com/"
      And enter admin "username"
      And enter admin "password"
      And student clicks login button
      And click menu button
      And select teacher management link

    @us_23_tc_01
    Scenario: to add teacher via admin account
      And Select a course
      And enter a name
      And enter surname
      And enter Birthplace
      And enter an email
      And select gender
      And enter birthdate
      And add a phone number
      And enter SSN number
      And enter username
      And enter password with true credentials
      And click on Submit button
      Then verify teacher is created

    @us_23_tc_02
      Scenario: adding teacher without a name
      And Select a course
      And enter surname
      And enter Birthplace
      And enter an email
      And select gender
      And enter birthdate
      And add a phone number
      And enter SSN number
      And enter username
      And enter password with true credentials
      And click on Submit button
      Then verify teacher is not created

    @us_23_tc_03
    Scenario: adding teacher without surname
      And Select a course
      And enter a name
      And enter Birthplace
      And enter an email
      And select gender
      And enter birthdate
      And add a phone number
      And enter SSN number
      And enter username
      And enter password with true credentials
      And click on Submit button
      Then verify teacher is not created

    @us_23_tc_04
    Scenario: adding teacher without Birthplace
      And Select a course
      And enter a name
      And enter surname
      And enter an email
      And select gender
      And enter birthdate
      And add a phone number
      And enter SSN number
      And enter username
      And enter password with true credentials
      And click on Submit button
      Then verify teacher is not created

    @us_23_tc_05
    Scenario: adding teacher without gender
      And Select a course
      And enter a name
      And enter surname
      And enter Birthplace
      And enter an email
      And enter birthdate
      And add a phone number
      And enter SSN number
      And enter username
      And enter password with true credentials
      And click on Submit button
      Then verify teacher is not created

    @us_23_tc_06
    Scenario: adding teacher without birthdate
      And Select a course
      And enter a name
      And enter surname
      And enter Birthplace
      And enter an email
      And select gender
      And add a phone number
      And enter SSN number
      And enter username
      And enter password with true credentials
      And click on Submit button
      Then verify teacher is not created

    @us_23_tc_07
    Scenario: adding teacher without phone number
      And Select a course
      And enter a name
      And enter surname
      And enter Birthplace
      And enter an email
      And select gender
      And enter birthdate
      And enter SSN number
      And enter username
      And enter password with true credentials
      And click on Submit button
      Then verify teacher is not created

    @us_23_tc_08
    Scenario: adding teacher without SSN number
      And Select a course
      And enter a name
      And enter surname
      And enter Birthplace
      And enter an email
      And select gender
      And enter birthdate
      And add a phone number
      And enter SSN number
      And enter username
      And enter password with true credentials
      And click on Submit button
      Then verify teacher is not created

    @us_23_tc_09
    Scenario: adding teacher without username
      And Select a course
      And enter a name
      And enter surname
      And enter Birthplace
      And enter an email
      And select gender
      And enter birthdate
      And add a phone number
      And enter SSN number
      And enter password with true credentials
      And click on Submit button
      Then verify teacher is not created

    @us_23_tc_10
    Scenario: adding teacher without password
      And Select a course
      And enter a name
      And enter surname
      And enter Birthplace
      And enter an email
      And select gender
      And enter birthdate
      And add a phone number
      And enter SSN number
      And enter username
      And click on Submit button
      Then verify teacher is not created





