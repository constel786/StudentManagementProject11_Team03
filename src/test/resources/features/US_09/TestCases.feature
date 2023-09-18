  @us09
  Feature: User must be logged in as Vice Dean
    Background: navigating_managementon_school_home_page
      Given user navigates to "https://managementonschools.com"
      When user must be logged in to the website as a vice dean

  @us09tc01
  Scenario: Vice Deans should be able to view the lesson list
    When click on lessons
    And verify lesson list is visible

  @us09tc02
  Scenario: Vice Deans should be able to delete the lessons
    When click on lessons
    And click on one of the trash icon
    And verify lesson deleted alert is visible





