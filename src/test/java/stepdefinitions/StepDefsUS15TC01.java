package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.ManagementonSchoolHomePage;
import pages.StudentManagement;


public class StepDefsUS15TC01 {
    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    StudentManagement studentManagement = new StudentManagement();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;

    @When("click on Menu")
    public void clickOnMenu() {
        studentManagement.menuButton.click();

    }
    @When("click student management")
    public void click_student_management() {
        studentManagement.studentManagementlink.click();


    }
    @When("Choose Advisor Teacher dropdown")
    public void choose_advisor_teacher_dropdown() {
        Select selectTeacher = new Select(studentManagement.advisorTeacher);
        selectTeacher.selectByVisibleText("David Update Lucky");
    }
    @When("enter student Name")
    public void enter_student_name() {
        studentManagement.studentName.sendKeys("Sylvia");

    }
    @When("enter student Surname")
    public void enter_student_surname() {
        studentManagement.studentSurname.sendKeys("Haynes");

    }
    @When("enter student Birth Place")
    public void enter_student_birth_place() {
        studentManagement.studentBirthPlace.sendKeys("London");

    }
    @When("enter student Email")
    public void enter_student_email() {
        studentManagement.studentEmail.sendKeys("coulsosn.taevdon@feerock.com");

    }
    @When("enter student Phone Number")
    public void enter_student_phone_number() {
        studentManagement.studentPhone.sendKeys("314-157-9873");

    }
    @When("select Gender")
    public void select_gender() {
        studentManagement.studentGenderFemale.click();

    }
    @When("select student Date Of Birth")
    public void select_student_date_of_birth() {
        studentManagement.studentDateOfBirth.sendKeys("22-08-2000");
    }
    @When("enter student SSN")
    public void enter_student_ssn() {
        studentManagement.studentSSN.sendKeys("545-60-9816");

    }
    @When("enter student User Name")
    public void enter_student_user_name() {
        studentManagement.studentUsername.sendKeys("SHayne3s0");

    }
    @When("enter student Father Name")
    public void enter_student_father_name() {
        studentManagement.studentFatherName.sendKeys("Phil");

    }
    @When("enter student Mother Name")
    public void enter_student_mother_name() {
        studentManagement.studentMotherName.sendKeys("Olivia");

    }
    @When("enter student Password")
    public void enter_student_password() {
        studentManagement.studentPassword.sendKeys("Tugce123");

    }
    @Then("click on Submit Button")
    public void click_on_submit_button() {
        studentManagement.submitNewStudent.click();

    }

}
