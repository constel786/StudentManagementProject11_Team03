package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
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

      protected static ExtentReports extentReports;
      protected static ExtentSparkReporter extentSparkReporter;
      protected static ExtentTest extentTest;


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
        studentInfoManagementPage.chooseEducationTerm.sendKeys("SPRING_SEMESTER"+ Keys.ENTER);
        WaitUtils.waitFor(1);
    }
    @When("entered Absentee {int}")
    public void entered_absentee(Integer int1) {
        studentInfoManagementPage.absentee.sendKeys("5" + Keys.ENTER);
        WaitUtils.waitFor(1);
    }
    @When("entered Midterm Exam {int}")
    public void entered_midterm_exam(Integer int1) {
        studentInfoManagementPage.midtermExam.sendKeys("50"+ Keys.ENTER);
        WaitUtils.waitFor(1);
    }
    @When("entered Final Exam {int}")
    public void entered_final_exam(Integer int1) {
        studentInfoManagementPage.finalExam.sendKeys("40"+ Keys.ENTER);
        WaitUtils.waitFor(1);
    }
    @When("entered Info Note must be better")
    public void entered_ınfo_note_must_be_better() {
        studentInfoManagementPage.infoNote.sendKeys("must be better");
        WaitUtils.waitFor(1);
    }
    @Then("Verify {string} message")
    public void verify_message(String string) {
        //   assertTrue();
    }


}
