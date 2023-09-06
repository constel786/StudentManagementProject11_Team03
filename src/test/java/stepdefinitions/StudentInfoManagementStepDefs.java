package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.EditStudentInfoPage;
import pages.ManagementonSchoolHomePage;
import pages.StudentInfoManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class StudentInfoManagementStepDefs {
     ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
     StudentInfoManagementPage studentInfoManagementPage = new StudentInfoManagementPage();
     EditStudentInfoPage editStudentInfoPage = new EditStudentInfoPage();


    @Given("teacher is on the managementon school home page")
    public void teacher_is_on_the_managementon_school_home_page() {
     Driver.getDriver().get(ConfigReader.getProperty("managementon_school_url"));
    }
    @When("teacher must be logged website")
    public void teacher_must_be_logged_website() {
        managementonSchoolHomePage.login.click();
        managementonSchoolHomePage.userNameLogin.sendKeys(ConfigReader.getProperty("teacher_s"));
        managementonSchoolHomePage.passwordLogin.sendKeys(ConfigReader.getProperty("teacher_s_pw"));
        managementonSchoolHomePage.loginButton.click();
        WaitUtils.waitFor(3);
    }
    @When("teacher click on menu")
    public void teacher_click_on_menu() {
        studentInfoManagementPage.menu.click();
        WaitUtils.waitFor(3);
    }
    @When("teacher click to Student Info Management")
    public void teacher_click_to_student_ınfo_management() {
        studentInfoManagementPage.studentInfoManagement.click();
        WaitUtils.waitFor(3);

    }
    @When("go to Choose Lesson")
    public void go_to_choose_lesson() {
        studentInfoManagementPage.chooseLesson.click();
        WaitUtils.waitFor(3);
    }
    @When("select Lesson {string}")
    public void select_lesson(String Lesson) {
        studentInfoManagementPage.chooseLesson.sendKeys(Lesson + Keys.ENTER);
        WaitUtils.waitFor(3);
    }
    @When("go to Choose Student")
    public void go_to_choose_student() {
        studentInfoManagementPage.chooseStudent.click();
        WaitUtils.waitFor(3);
    }
    @When("select Student {string}")
    public void select_student(String student_name) {
        studentInfoManagementPage.chooseStudent.sendKeys(student_name + Keys.ENTER);
        WaitUtils.waitFor(3);
    }
    @When("go to Choose Education Term")
    public void go_to_choose_education_term() {
        studentInfoManagementPage.chooseEducationTerm.click();
        WaitUtils.waitFor(3);
    }
    @When("select Semester {string}")
    public void select_semester(String semester) {
        studentInfoManagementPage.chooseEducationTerm.sendKeys(semester + Keys.ENTER);
        WaitUtils.waitFor(3);
    }
    @When("entered Absentee {string}")
    public void entered_absentee(String absentee) {
        studentInfoManagementPage.absentee.sendKeys(absentee + Keys.ENTER);
        WaitUtils.waitFor(3);
    }
    @When("entered Midterm Exam {string}")
    public void entered_midterm_exam(String midterm_exam) {
        studentInfoManagementPage.midtermExam.sendKeys(midterm_exam + Keys.ENTER);
        WaitUtils.waitFor(3);
    }
    @When("entered Final Exam {string}")
    public void entered_final_exam(String final_exam) {
        studentInfoManagementPage.finalExam.sendKeys(final_exam + Keys.ENTER);
        WaitUtils.waitFor(3);
    }
    @When("entered Info Note {string}")
    public void entered_ınfo_note(String info_note) {
        studentInfoManagementPage.infoNote.sendKeys(info_note + Keys.ENTER);
        WaitUtils.waitFor(3);
    }
    @When("click on Submit button")
    public void click_on_submit_button() {
        studentInfoManagementPage.submitButton.click();
        WaitUtils.waitFor(3);
    }
    @Then("verify {string}")
    public void verify(String message) {
     //  assertTrue(studentInfoManagementPage.successMessage.getText().contains("Student Info saved Successfully"));
        WaitUtils.waitFor(3);

    }
    @Then("close the page")
    public void close_the_page() {
        Driver.closeDriver();
    }
}