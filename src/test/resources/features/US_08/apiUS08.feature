Feature: Lesson Creation
  As a user of the managementonschools system,
  I want to create a lesson
  So that I can add new lessons to the system

  Background:
    Given i am authorized with token "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJiZWRvdGVzdGFkbWluIiwiaWF0IjoxNjk2MTYyODMwLCJleHAiOjE2OTYxNzE0NzB9.PEG7WNosWL6G0NCtjLeTp2b_rDjX0ZoJBZGhfil_TEl0Rw7pOJ25kzTWsZQ3CRhEx1VjzoWQnRL8zpizxCDdhA"
    And The base URL is "https://managementonschools.com"

  Scenario: Create a new lesson with valid details
    Given the request body is:
      """
      {
        "lessonId": 1736,
        "lessonName": "Advanced English",
        "creditScore": 5,
        "compulsory": true
      }
      """
    When I send a POST request to "/lessons/save"
    Then the response status should be 200
    And the response should contain the lesson details


