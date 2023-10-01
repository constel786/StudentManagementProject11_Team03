@us07
Feature: Dean should be able to see the delete button

  Background: navigating_management_on_school_home_page1
    Given dean navigates to the "https://managementonschools.com"
    When clicks the Login Link
    When dean must be logged in to the website as a dean

  @us07tc01
  Scenario: Dean should be able to see the delete button
    Then dean verifies delete button is visible

