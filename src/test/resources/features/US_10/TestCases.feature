 @us10
 Feature: User must be logged in as Vice Dean
  Background: navigating_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When user must be logged in to the website as a vice dean

  @us10tc01
  Scenario: Vice Dean should be able to select a course
    When click on lesson program
    And select one lessons from the dropdown
    And select a semester from Choose Education Term dropdown
    And select a day Choose Day dropdown
    And select hour from Start Time dropdown
    And select hour from Stop Time dropdown
    And click on 'Submit' button
    And verify 'Created Lesson Program' alert is displayed


   @us10tc02
   Scenario: Vice Dean should not be able to select a course
     When click on lesson program2
     And do not select lesson
     And select a semester from Choose Education Term dropdown2
     And select a day Choose Day dropdown2
     And select hour from Start Time dropdown2
     And select hour from Stop Time dropdown2
     And click on 'Submit' button2
     And verify lesson is not created


   @us10tc03
   Scenario: Vice Dean should not be able to select a course
     When click on lesson program3
     And select one lessons from the dropdown3
     And do not select a semester
     And select a day Choose Day dropdown3
     And select hour from Start Time dropdown3
     And select hour from Stop Time dropdown3
     And click on 'Submit' button3
     And verify lesson is not created3


   @us10tc04
   Scenario: Vice Dean should not be able to select a course
     When click on lesson program4
     And select one lessons from the dropdown4
     And select a semester from Choose Education Term dropdown4
     And do not select a day
     And select hour from Start Time dropdown4
     And select hour from Stop Time dropdown4
     And click on 'Submit' button4
     And verify lesson is not created4


   @us10tc05
   Scenario: Vice Dean should not be able to select a course
     When click on lesson program5
     And select one lessons from the dropdown5
     And select a semester from Choose Education Term dropdown5
     And select a day Choose Day dropdown5
     And do not select start hour
     And select hour from Stop Time dropdown5
     And click on 'Submit' button5
     And verify lesson is not created5


   @us10tc06
   Scenario: Vice Dean should not be able to select a course
     When click on lesson program6
     And select one lessons from the dropdown6
     And select a semester from Choose Education Term dropdown6
     And select a day Choose Day dropdown6
     And select hour from Start Time dropdown6
     And do not select stop hour6
     And click on 'Submit' button6
     And verify lesson is not created6


