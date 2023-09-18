@us_23
  Feature: US_23
    Background:Login with admin account and go to teacher registration
      Given navigate to "https://managementonschools.com/"
      And click login link
      And enter admin username "Admin98"
      And enter admin password "Admin9898"
      And student clicks login button
      And click menu button
      And select teacher management link

    @us_23_tc_01
    Scenario: to add teacher via admin account
      And Select a course "Cypress"
      And enter a name "Denimkr"
      And enter surname "Deniker"
      And enter Birthplace "Karlruher"
      And enter an email "palrxt@asfv.com"
      And select gender "female"
      And enter birthdate "11101994"
      And add a phone number "151-663-2158"
      And enter SSN number "243-81-6940"
      And enter username "WWai619" for teacher
      And enter "WWait549" with true credentials
      And click on teacher Submit button
      Then verify teacher is created
      Then click menu button
      Then click logout button
      Then close the application

    @us_23_tc_02
      Scenario: adding teacher without a name
      And Select a course "Cypress"
      And enter surname "Cartoon"
      And enter Birthplace "Ctown"
      And enter an email "nak@kgmwl"
      And select gender "female"
      And enter birthdate "12122012"
      And add a phone number "150-666-2257"
      And enter SSN number "243-84-7643"
      And enter username "WWiS" for teacher
      And enter "Wasskk21" with true credentials
      And click on teacher Submit button
      Then verify teacher is not created
      Then click menu button
      Then click logout button
      Then close the application

    @us_23_tc_03
    Scenario: adding teacher without surname
      And Select a course "Cypress"
      And enter a name "Mikah"
      And enter Birthplace "Ctown"
      And enter an email "nak@kgmwl"
      And select gender "female"
      And enter birthdate "12122012"
      And add a phone number "150-666-2257"
      And enter SSN number "243-80-7643"
      And enter username "WWSS" for teacher
      And enter "Wwsskk21" with true credentials
      And click on teacher Submit button
      Then verify teacher is not created
      Then click menu button
      Then click logout button
      Then close the application

    @us_23_tc_04
    Scenario: adding teacher without Birthplace
      And Select a course "Cypress"
      And enter a name "Deniaae"
      And enter surname "Deniee"
      And enter an email "kaasdt@asfv.com"
      And select gender "female"
      And enter birthdate "11101999"
      And add a phone number "150-663-2257"
      And enter SSN number "243-80-6643"
      And enter username "WWaim12" for teacher
      And enter "WWaim543" with true credentials
      And click on teacher Submit button
      Then verify teacher is not created
      Then click menu button
      Then click logout button
      Then close the application

    @us_23_tc_05
    Scenario: adding teacher without gender
      And Select a course "Cypress"
      And enter a name "Deniaae"
      And enter surname "Deniee"
      And enter Birthplace "Karlruher"
      And enter an email "kaasdt@asfv.com"
      And enter birthdate "11101999"
      And add a phone number "150-663-2257"
      And enter SSN number "243-80-6643"
      And enter username "WWaim12" for teacher
      And enter "WWaim543" with true credentials
      And click on teacher Submit button
      Then verify invalid value notification
      Then click menu button
      Then click logout button
      Then close the application

    @us_23_tc_06
    Scenario: adding teacher without birthdate
      And Select a course "Cypress"
      And enter a name "Deniaae"
      And enter surname "Deniee"
      And enter Birthplace "Karlruher"
      And enter an email "kaasdt@asfv.com"
      And select gender "female"
      And add a phone number "150-663-2257"
      And enter SSN number "243-80-6643"
      And enter username "WWaim12" for teacher
      And enter "WWaim543" with true credentials
      And click on teacher Submit button
      Then verify teacher is not created
      Then click menu button
      Then click logout button
      Then close the application

    @us_23_tc_07
    Scenario: adding teacher without phone number
      And Select a course "Cypress"
      And enter a name "Deniaae"
      And enter surname "Deniee"
      And enter Birthplace "Karlruher"
      And enter an email "kaasdt@asfv.com"
      And select gender "female"
      And enter birthdate "11101999"
      And enter SSN number "243-80-6643"
      And enter username "WWaim12" for teacher
      And enter "WWaim543" with true credentials
      And click on teacher Submit button
      Then verify teacher is not created
      Then click menu button
      Then click logout button
      Then close the application

    @us_23_tc_08
    Scenario: adding teacher without SSN number
      And Select a course "Cypress"
      And enter a name "Deniate"
      And enter surname "Deniee"
      And enter Birthplace "Karlruher"
      And enter an email "kaasdt@asfv.com"
      And select gender "female"
      And enter birthdate "11101999"
      And add a phone number "150-663-2257"
      And enter username "WWaim12" for teacher
      And enter "WWaim543" with true credentials
      And click on teacher Submit button
      Then verify teacher is not created
      Then click menu button
      Then click logout button
      Then close the application

    @us_23_tc_09
    Scenario: adding teacher without username
      And Select a course "Cypress"
      And enter a name "Deniaae"
      And enter surname "Deniee"
      And enter Birthplace "Karlruher"
      And enter an email "kaasdt@asfv.com"
      And select gender "female"
      And enter birthdate "11101999"
      And add a phone number "150-663-2257"
      And enter SSN number "243-80-6643"
      And enter "WWaim543" with true credentials
      And click on teacher Submit button
      Then verify teacher is not created
      Then click menu button
      Then click logout button
      Then close the application

    @us_23_tc_10
    Scenario: adding teacher without password
      And Select a course "Cypress"
      And enter a name "Deniaae"
      And enter surname "Deniee"
      And enter Birthplace "Karlruher"
      And enter an email "kaasdt@asfv.com"
      And select gender "female"
      And enter birthdate "11101999"
      And add a phone number "150-663-2257"
      And enter SSN number "243-80-6643"
      And enter username "WWaim12" for teacher
      And click on teacher Submit button
      Then verify enter password alert
      Then click menu button
      Then click logout button
      Then close the application





