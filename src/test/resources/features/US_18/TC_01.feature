@us18tc01
Feature: Teacher able to seeing student info list

  Background:navigating_managementon_school_home_page
    Given user navigates to "https://managementonschools.com"
    When  teacher must be logged website
@us18tc01.1
  Scenario:US_18_TC_01_teacher_seeing_student_info_list_james_bond
    When teacher click on menu
    And teacher click to Student Info Management
    And go to Student info List
    And seeing  James Bond all information
    Then verify the James Bond
    And close the page

  @us18tc01.2
  Scenario:US_18_TC_01_teacher_seeing_student_info_list_malika_morar
    When teacher click on menu
    And teacher click to Student Info Management
    And go to Student info List
    And seeing  Malika Morar all information
    Then verify the Malika Morar
    And close the page

  @us18tc01.3
  Scenario:US_18_TC_01_teacher_seeing_student_info_list_jessie_pinkman
    When teacher click on menu
    And teacher click to Student Info Management
    And go to Student info List
    And seeing  Jessie Pinkman all information
    Then verify the Jessie Pinkman
    And close the page

  @us18tc01.4
  Scenario:US_18_TC_01_teacher_seeing_student_info_list_ali_can
    When teacher click on menu
    And teacher click to Student Info Management
    And go to Student info List
    And seeing  Ali Can all information
    Then verify the Ali Can
    And close the page


















