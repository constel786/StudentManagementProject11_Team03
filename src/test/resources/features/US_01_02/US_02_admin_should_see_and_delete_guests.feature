@US02 @bedo
Feature: US02 Seeing guests list
  Background: Log in as Admin
    Given user goes to homepage
    And user clicks on login
    And user fills login username input "bedotestadmin"
    And user fills login password input "BedoTest1"
    And user clicks login button

  Scenario: US02_TC02_admin_should_be_able_to_see_guests
    And user clicks menu button
    And user clicks guest user from the menu
    And Verify that admin should be able to see Name, Phone Number, SSN and User Name information in the guest user list.
    And close the page


#    Click "menu" button on the header
#  Click on "guest user"
#  "Verify that admin should be able to see Name,
#  Phone Number, SSN and User Name
#  information in the guest user list."