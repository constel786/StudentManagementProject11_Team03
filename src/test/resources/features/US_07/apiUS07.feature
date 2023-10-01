Feature: Contact Messages Retrieval and Validation
  As a user of the managementonschools system,
  I want to retrieve contact messages
  So that I can validate the contents of the messages

  Background:
    Given I am authorized with credentials "bedotestadmin" and "BedoTest1"
    And The base URL is "https://managementonschools.com"

  Scenario: Retrieve and Validate Specific Contact Message
    When I send a GET request to "/getAll?page=10&size=10&sort=date&type=desc"
    Then the response status should be 200
    And the response should have a message with:
      | name   | Irina        |
      | email  | mnop@ukr.net |
      | subject| DBtesting    |
      | message| That's it    |
      | date   | 2023-09-23   |

