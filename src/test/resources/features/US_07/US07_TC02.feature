@us07
Feature: Dean should be able to see the messages sent by users
  Background: navigating_management_on_school_home_page
    Given user navigates to "https://managementonschools.com"
    When dean must be logged in to the website as a dean

  @us07tc02
  Scenario: Validate that Deans can access and read messages with details
    When user clicks on menu
    Then user clicks on Contact Get All
    Then user checks that the name is displayed.
    Then user checks that the emails is displayed.
    Then user checks that the sending dates is displayed.
    Then user checks that the subject information is visible
    Then user checks that message is visible
    Then close driver


