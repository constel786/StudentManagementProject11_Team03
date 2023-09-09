@us_21
  Feature: US_21
    Background:navigating to the homepage and logging in as a student
      Given student goes to "https://managementonschools.com/"
      And student enters "username"
      And student enters "password"
      And student clicks login button

    @us21_tc_01
    Scenario: student sees the Teacher, Day, Start Time and Stop Time information in the Choose Lesson list
      And verify the visibility of the teacher day start and atop time information in the choose lesson list
      Then close the application

    @us21_tc_02
    Scenario:selecting the desired lesson or lessons
      And student selects a "lesson"
      And student clicks the submit button
      And student unselects a lesson
      And student selects a "lesson"
      And student clicks the submit button
      Then verify the courses are added to the list
      Then close the application

    @us21_tc_03
    Scenario: selecting multiple desired lessons
      And student selects multiple courses
      And student clicks the submit button
      Then verify the courses are added to the list
      Then close the application

    @us21_tc_04
    Scenario Outline: forbidding the selection of simultaneous courses
      And student selects a "<lesson>"
      And student clicks the submit button
      And student unselects a lesson
      And student selects a simultaneous "<lesson2>"
      And student clicks the submit button
      Then verify the notification of denial
      Then close the application
      Examples:
        | lesson | lesson2 |

    @us21_tc_05
    Scenario: denial of the selection of multiple courses
      And student selects a "<lesson>"
      And student selects a simultaneous "<lesson2>"
      And student clicks the submit button
      Then verify the notification of denial
      Then close the application

    @us21_tc_06
    Scenario: deleting a course
      And select the courses to be deleted
      And click delete button

    @us21_tc_07
    Scenario: verifying the visibility of the selected courses
      And student selects a "lesson"
      And student clicks the submit button
      And student unselects a lesson
      And student selects a "lesson"
      And student clicks the submit button
      Then verify the courses are added to the list
      Then close the application

    @us21_tc_08
    Scenario: seeing the grades
      And click Menu button
      And click Grades and announcements link
      Then verify the visibility of grades
      Then close the application


    @us21_tc_09
    Scenario: seeing the meetings
      And click Menu button
      And click Grades and announcements link
      Then verify the visibility of meetings
      Then close the application









