@US16
Feature: The Vice Dean should be able to view the messages sent by users.
  Background: navigating_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When user must be logged in to the website as a vice dean

    @us16tc28
    Scenario: Displaying "Delete" button
      When click on Menu4
      And click on Contact Get All
      Then verify that delete button is visible