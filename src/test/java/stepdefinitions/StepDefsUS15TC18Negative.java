package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.ManagementonSchoolHomePage;
import pages.StudentManagement;

public class StepDefsUS15TC18Negative {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    StudentManagement studentManagement = new StudentManagement();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;

    @When("click on Menu3")
    public void click_on_menu3() {
        studentManagement.menuButton.click();
    }
    @When("click on Student management3")
    public void click_on_student_management3() {
        studentManagement.studentManagementlink.click();
    }
    @When("Choose Advisor Teacher dropdown3")
    public void choose_advisor_teacher_dropdown3() {
        Select selectTeacher = new Select(studentManagement.advisorTeacher);
        selectTeacher.selectByVisibleText("Hector Salamanca");
    }
    @When("enter student Name3")
    public void enter_student_name3() {
        studentManagement.studentName.sendKeys("Kylie");

    }
    @When("enter student Surname3")
    public void enter_student_surname3() {
        studentManagement.studentSurname.sendKeys("May");
    }

   @And("do not enter student birth place")
   public void doNotEnterStudentBirthPlace() {
        studentManagement.studentBirthPlace.sendKeys(" ");
    }

    @When("enter student Email3")
    public void enter_student_email3() {
        studentManagement.studentEmail.sendKeys("jexiels.alric@feerock.com");

    }
    @When("enter student Phone Number3")
    public void enter_student_phone_number3() {
        studentManagement.studentPhone.sendKeys("757-809-2018");
    }
    @When("select Gender3")
    public void select_gender3() {
        studentManagement.studentGenderFemale.click();
    }
    @When("select student Date Of Birth3")
    public void select_student_date_of_birth3() {
        studentManagement.studentDateOfBirth.sendKeys("22-08-2000");
    }
    @When("enter student SSN3")
    public void enter_student_ssn3() {
        studentManagement.studentSSN.sendKeys("104-93-7657");
    }
    @When("enter student User Name3")
    public void enter_student_user_name3() {
        studentManagement.studentUsername.sendKeys("KMay");

    }
    @When("enter student Father Name3")
    public void enter_student_father_name3() {
        studentManagement.studentFatherName.sendKeys("Jack");
    }
    @When("enter student Mother Name3")
    public void enter_student_mother_name3() {
        studentManagement.studentMotherName.sendKeys("Kate");
    }
    @When("enter student Password3")
    public void enter_student_password3() {
        studentManagement.studentPassword.sendKeys("Tugce123");
    }
    @When("click on Submit Button3")
    public void click_on_submit_button3() {
        studentManagement.submitNewStudent.click();
    }

}
