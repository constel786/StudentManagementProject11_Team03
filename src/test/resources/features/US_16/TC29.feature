@US16
Feature: The Vice Dean should be able to view the messages sent by users.
  Background: navigating_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When user must be logged in to the website as a vice dean

    @us16tc29
    Scenario: Viewing message details
    When click on Menu5
    When click on Contact Get All2
    And verify that page contains name section
    And verify that page contains email section
    And verify that page contains date section
    And verify that page contains subject section