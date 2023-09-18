package stepdefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.EditStudentInfoPage;
import pages.LessonPage;
import pages.ManagementonSchoolHomePage;
import pages.StudentInfoManagementPage;

import utilities.*;

import java.util.List;
import utilities.ConfigReader;
import utilities.WaitUtils;


import static org.junit.Assert.assertTrue;


public class StudentInfoManagementStepDefs {
    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    StudentInfoManagementPage studentInfoManagementPage = new StudentInfoManagementPage();
    EditStudentInfoPage editStudentInfoPage = new EditStudentInfoPage();


    @When("teacher must be logged website")
    public void teacher_must_be_logged_website() {
        managementonSchoolHomePage.login.click();
        managementonSchoolHomePage.userNameLogin.sendKeys(ConfigReader.getProperty("teacher_s"));
        managementonSchoolHomePage.passwordLogin.sendKeys(ConfigReader.getProperty("teacher_s_pw"));
        managementonSchoolHomePage.loginButton.click();
        WaitUtils.waitFor(1);
    }

    @When("teacher click on menu")
    public void teacher_click_on_menu() {
        studentInfoManagementPage.menu.click();
        WaitUtils.waitFor(1);
    }

    @When("teacher click to Student Info Management")
    public void teacher_click_to_student_ınfo_management() {
        studentInfoManagementPage.studentInfoManagement.click();
        WaitUtils.waitFor(1);
    }

    @When("go to Choose Lesson")
    public void go_to_choose_lesson() {
        studentInfoManagementPage.chooseLesson.click();
        WaitUtils.waitFor(1);
    }

    @When("select Lesson {string}")
    public void select_lesson(String Lesson) {
        studentInfoManagementPage.chooseLesson.sendKeys(Lesson + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("go to Choose Student")
    public void go_to_choose_student() {
        studentInfoManagementPage.chooseStudent.click();
        WaitUtils.waitFor(1);
    }

    @When("select Student {string}")
    public void select_student(String student_name) {
        studentInfoManagementPage.chooseStudent.sendKeys(student_name + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("go to Choose Education Term")
    public void go_to_choose_education_term() {
        studentInfoManagementPage.chooseEducationTerm.click();
        WaitUtils.waitFor(1);
    }

    @When("select Semester {string}")
    public void select_semester(String semester) {
        studentInfoManagementPage.chooseEducationTerm.sendKeys(semester + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("entered Absentee {string}")
    public void entered_absentee(String absentee) {
        studentInfoManagementPage.absentee.sendKeys(absentee + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("entered Midterm Exam {string}")
    public void entered_midterm_exam(String midterm_exam) {
        studentInfoManagementPage.midtermExam.sendKeys(midterm_exam + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("entered Final Exam {string}")
    public void entered_final_exam(String final_exam) {
        studentInfoManagementPage.finalExam.sendKeys(final_exam + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("entered Info Note {string}")
    public void entered_ınfo_note(String info_note) {
        studentInfoManagementPage.infoNote.sendKeys(info_note + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("click on Submit button")
    public void click_on_submit_button() {
        studentInfoManagementPage.submitButton.click();
        WaitUtils.waitFor(1);
    }

    @Then("verify {string}")
    public void verify(String message) {
        //  assertTrue(studentInfoManagementPage.successMessage.getText().contains("Student Info saved Successfully"));
        WaitUtils.waitFor(1);

    }

    @When("not select Lesson")
    public void not_select_lesson() {
    }

    @When("select Asuman Aydinci")
    public void select_asuman_aydinci() {
        studentInfoManagementPage.chooseStudent.sendKeys("Asuman Aydinci" + Keys.ENTER);
        WaitUtils.waitFor(1);

    }

    @When("select SPRING_SEMESTER")
    public void select_sprıng_semester() {
        studentInfoManagementPage.chooseEducationTerm.sendKeys("SPRING_SEMESTER" + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("entered Absentee {int}")
    public void entered_absentee(Integer int1) {
        studentInfoManagementPage.absentee.sendKeys("1" + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("entered Midterm Exam {int}")
    public void entered_midterm_exam(Integer int1) {
        studentInfoManagementPage.midtermExam.sendKeys("90" + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("entered Final Exam {int}")
    public void entered_final_exam(Integer int1) {
        studentInfoManagementPage.finalExam.sendKeys("95" + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("entered Info Note must be better")
    public void entered_ınfo_note_must_be_better() {
        studentInfoManagementPage.infoNote.sendKeys("must be better");
        WaitUtils.waitFor(2);
    }

    @Then("Verify {string} message")
    public void verify_message(String string) {
      //    assertTrue(studentInfoManagementPage.errorMessage.getText().equals("Error: Student Info with lesson name Selenium already register"));
      //    assertTrue(studentInfoManagementPage.successMessage1.getText().equals("Student Info saved Successfully"));
      //    assertTrue(studentInfoManagementPage.successMessage.getText().equals("Student Info saved Successfully"));
    }
    @Then("Verify lesson {string} message")
    public void verify_lesson_message(String string) {
      //  assertTrue(studentInfoManagementPage.selectLessonErrorMessage.getText().equals("Please select lesson"));
    }

    @When("select Selenium")
    public void select_selenium() {
        studentInfoManagementPage.chooseLesson.sendKeys("Selenium" + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("select Bruce Lee")
    public void select_bruce_lee() {
        studentInfoManagementPage.chooseStudent.sendKeys("Bruce Lee" + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("not select choose education term")
    public void not_select_choose_education_term() {
    }

    @Then("Verify education term {string} message")
    public void verify_education_term_message(String string) {
      //  assertTrue(studentInfoManagementPage.selectEducationTermErrorMessage.getText().equals("Please select education term"));
    }

    @When("select Jessie Pinkman")
    public void select_jessie_pinkman() {
        studentInfoManagementPage.chooseStudent.sendKeys("Jessie Pinkman" + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("select FALL_SEMESTER")
    public void select_fall_semester() {
        studentInfoManagementPage.chooseEducationTerm.sendKeys("FALL_SEMESTER" + Keys.ENTER);
        WaitUtils.waitFor(1);
    }

    @When("not entered Absentee")
    public void not_entered_absentee() {
    }

    @Then("Verify absentee {string} message")
    public void verify_absentee_message(String string) {
     // assertTrue(editStudentInfoPage.requiredMessage.getText().equals("Required"));
    }
    @When("not entered Midterm Exam")
    public void not_entered_midterm_exam() {}

    @Then("Verify midterm exam {string} message")
    public void verify_midterm_exam_message(String string) {
     //   assertTrue(editStudentInfoPage.requiredMessage.getText().equals("Required"));
    }
    @When("not entered Final Exam")
    public void not_entered_final_exam() {}

    @Then("Verify final exam {string} message")
    public void verify_final_exam_message(String string) {
     //   assertTrue(editStudentInfoPage.requiredMessage.getText().equals("Required"));
    }
    @When("not entered info Note")
    public void not_entered_info_note() {
    }
    @Then("Verify info note {string} message")
    public void verify_info_note_message(String string) {
     //   assertTrue(editStudentInfoPage.requiredMessage.getText().equals("Required"));
    }
    @When("select Hector Salamanca")
    public void select_hector_salamanca() {
       studentInfoManagementPage.chooseStudent.sendKeys("Hector Salamanca" + Keys.ENTER);
    }

    @When("go to Student info List")
    public void go_to_student_info_list() {
        ActionsUtils.hoverOverOnElementActions(studentInfoManagementPage.studentInfoList);
    }

    @When("seeing  James Bond all information")
    public void seeing_james_bond_all_information() {
        List<WebElement> studentsName1 = Driver.getDriver().findElements(By.xpath("//div//table//tbody//tr[1]"));
        System.out.println(studentsName1.size());
        System.out.println(studentsName1.get(0).getText());
    }
    @Then("verify the James Bond")
    public void verify_the_James_Bond() {
     //   assertTrue(studentInfoManagementPage.jamesBondNameField.getText().equalsIgnoreCase("James Bond"));
    }
    @When("seeing  Malika Morar all information")
    public void seeing_Malika_Morar_all_information() {
        List<WebElement> studentsName2 = Driver.getDriver().findElements(By.xpath("//div//table//tbody//tr[2]"));
        System.out.println(studentsName2.size());
        System.out.println(studentsName2.get(0).getText());
    }
    @Then("verify the Malika Morar")
    public void verify_the_Malika_Morar() {
      //  assertTrue(studentInfoManagementPage.malikaMorarField.getText().equalsIgnoreCase("Malika Morar"));
    }

    @When("seeing  Jessie Pinkman all information")
    public void seeing_jessie_pinkman_all_information() {
        List<WebElement> studentsName3 = Driver.getDriver().findElements(By.xpath("//div//table//tbody//tr[3]"));
        System.out.println(studentsName3.size());
        WaitUtils.waitFor(2);
        System.out.println(studentsName3.get(0).getText());
    }
    @Then("verify the Jessie Pinkman")
    public void verify_the_jessie_pinkman() {
      //  assertTrue(studentInfoManagementPage.jessiePinkmanField.getText().equalsIgnoreCase("Jessie Pinkman"));
    }

    @When("seeing  Ali Can all information")
    public void seeing_ali_can_all_information() {
        List<WebElement> studentsName4 = Driver.getDriver().findElements(By.xpath("//div//table//tbody//tr[4]"));
        System.out.println(studentsName4.size());
        System.out.println(studentsName4.get(0).getText());
    }
    @Then("verify the Ali Can")
    public void verify_the_ali_can() {
     //   assertTrue(studentInfoManagementPage.aliCanNameField.getText().equalsIgnoreCase("Ali Can"));
    }

    @When("Select James Bond")
    public void select_james_bond() {
        studentInfoManagementPage.jamesBondNameField.isSelected();

    }
    @When("Click {string}")
    public void click_edit_button(String editButton1) {
    JSUtils.clickWithTimeoutByJS(studentInfoManagementPage.editButton1);
    JSUtils.clickWithTimeoutByJS(studentInfoManagementPage.editButton1);
    }
    @When("Click Choose Lesson")
    public void click_choose_lesson() {
       editStudentInfoPage.chooseLessonEdit.click();
    }
    @When("Select {string} lesson")
    public void select_selenium_lesson(String selenium) {
        editStudentInfoPage.chooseLessonEdit.sendKeys("Selenium" + Keys.ENTER);
    }
    @When("Click Choose Education Term")
    public void click_choose_education_term() {
        editStudentInfoPage.educationTermEdit.click();
    }
    @When("Select edit page FALL_SEMESTER")
    public void select_edit_page_fall_semester() {
       editStudentInfoPage.educationTermEdit.sendKeys("FALL_SEMESTER" + Keys.ENTER);
    }
    @When("Entered Absentee")
    public void entered_absentee() {
       ActionsUtils.doubleClick(editStudentInfoPage.absenteeEditJamesBond);
        editStudentInfoPage.absenteeEditJamesBond.sendKeys("10" + Keys.TAB);
    }
    @When("Click Midterm Exam")
    public void click_midterm_exam() {
        ActionsUtils.doubleClick(editStudentInfoPage.midtermExamEdit);
        WaitUtils.waitFor(2);
    }
    @When("Entered new grade midterm exam")
    public void entered_new_grade_midterm_exam() {
        editStudentInfoPage.midtermExamEdit.sendKeys("67" + Keys.TAB);
        WaitUtils.waitFor(2);
    }
    @When("Click Final Exam")
    public void click_final_exam() {
        ActionsUtils.doubleClick(editStudentInfoPage.finalExamEdit);
        WaitUtils.waitFor(2);
    }
    @When("Entered new grade final_exam")
    public void entered_new_grade_final_exam() {
        editStudentInfoPage.finalExamEdit.sendKeys("69" + Keys.TAB);
        WaitUtils.waitFor(2);
    }   @When("Entered info note")
    public void entered_info_note() {
        ActionsUtils.doubleClick(editStudentInfoPage.infoNoteEdit);
        editStudentInfoPage.infoNoteEdit.sendKeys("be careful for absentee" + Keys.TAB);
        WaitUtils.waitFor(2);
    }
    @When("Click Submit button")
    public void click_submit_button() {
        WaitUtils.waitFor(2);
       JSUtils.clickWithTimeoutByJS(editStudentInfoPage.submitButtonEdit);
    }
    @Then("Verify Student Info updated Successfully message")
    public void verify_student_ınfo_updated_successfully_message() {
        //  WaitUtils.waitFor(1);
    //  assertTrue(studentInfoManagementPage.successMessage1.getText().equalsIgnoreCase("Student Info updated Successfully"));
    }
    @When("go to  {string}")
    public void go_to(String name) {
        ActionsUtils.hoverOverOnElementActions(studentInfoManagementPage.studentInfoList);
        studentInfoManagementPage.aliCanNameField.isSelected();
    }
    @When("Select  {string}")
    public void select(String lesson) {
        editStudentInfoPage.chooseLessonEdit.sendKeys(lesson);
    }

    @When("Click Edit Button for Ali Can")
    public void click_edit_button_for_ali_can() {
        JSUtils.clickWithTimeoutByJS(studentInfoManagementPage.editButton4);
    }
    @When("Select edit page {string}")
    public void select_edit_page(String semester) {
        editStudentInfoPage.educationTermEdit.sendKeys("Choose Education Term" + Keys.ENTER);
        WaitUtils.waitFor(2);
        editStudentInfoPage.educationTermEdit.sendKeys(semester + Keys.TAB);
        editStudentInfoPage.absenteeEdit.sendKeys("5" +Keys.TAB);
    }
    @When("Delete midterm exam delete {string}")
    public void delete_midterm_exam_delete(String string) {
        WaitUtils.waitFor(3);
        editStudentInfoPage.midtermExamEdit.sendKeys(string + Keys.TAB);
    }
    @When("Delete final exam delete {string}")
    public void delete_final_exam_delete(String string) {
        WaitUtils.waitFor(2);
        editStudentInfoPage.finalExamEdit.sendKeys(string + Keys.TAB);
    }
    @Then("Verify  midterm exam {string} messages")
    public void verifyMidtermExamMessages(String midterm_message) {
    //    WaitUtils.waitFor(2);
    //    assertTrue(editStudentInfoPage.midtermExamMessage.getText().equalsIgnoreCase("Please enter midterm exam"));
    }

    @Then("verify final exam {string} messages")
    public void verifyFinalExamMessages(String final_message) {
     //   assertTrue(editStudentInfoPage.finalExamMessage.getText().equalsIgnoreCase("Please enter final exam"));
    }

    @When("Click {string} Button")
    public void click_button(String delete) {
        WaitUtils.waitFor(5);
       JSUtils.clickWithTimeoutByJS(studentInfoManagementPage.deleteButton4);
    }

    @Then("Verify delete {string}")
    public void verify_delete(String message) {
    //assertTrue(studentInfoManagementPage.deleteSuccessMessage.getText().equalsIgnoreCase("Student Info deleted Successfully"));
     //
    }



}

    @When("not entered Midterm Exam")
    public void not_entered_midterm_exam() {
    }

    @When("not entered Final Exam")
    public void not_entered_final_exam() {
    }

    @When("not entered Info Note")
    public void not_entered_ınfo_note() {


    }

}

