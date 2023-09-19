package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.ManagementonSchoolHomePage;
import pages.StudentManagement;

public class StepDefsUS15TC10 {
    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    StudentManagement studentManagement = new StudentManagement();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;

    @When("click on Menu2")
    public void click_on_menu2() {
        studentManagement.menuButton.click();
    }
    @When("click on student management2")
    public void click_on_student_management2() {
        studentManagement.studentManagementlink.click();
    }
    @When("Choose Advisor Teacher dropdown2")
    public void choose_advisor_teacher_dropdown2() {
        Select selectTeacher = new Select(studentManagement.advisorTeacher);
        selectTeacher.selectByVisibleText("Teacher Murat");
    }
    @When("enter student Name2")
    public void enter_student_name2() {
        studentManagement.studentName.sendKeys("Riley");
    }
    @When("enter student Surname2")
    public void enter_student_surname2() {
        studentManagement.studentSurname.sendKeys("White");
    }
    @When("enter student Birth Place2")
    public void enter_student_birth_place2() {
        studentManagement.studentBirthPlace.sendKeys("Manchester");
    }
    @When("enter student Email2")
    public void enter_student_email2() {
        studentManagement.studentEmail.sendKeys("neri.ozzy@feerock.com");
    }
    @When("enter student Phone Number2")
    public void enter_student_phone_number2() {
        studentManagement.studentPhone.sendKeys("976-432-1996");
    }
    @When("select Gender2")
    public void select_gender2() {
        studentManagement.studentGenderMale.click();
    }
    @When("select student Date Of Birth2")
    public void select_student_date_of_birth2() {
        studentManagement.studentDateOfBirth.sendKeys("1999-06-22");
    }
    @When("enter student SSN2")
    public void enter_student_ssn2() {
        studentManagement.studentSSN.sendKeys("505-61-9877");
    }
    @When("enter student User Name2")
    public void enter_student_user_name2() {
        studentManagement.studentUsername.sendKeys("RWhite");
    }
    @When("enter student Father Name2")
    public void enter_student_father_name2() {
        studentManagement.studentFatherName.sendKeys("Phil");
    }
    @When("enter student Mother Name2")
    public void enter_student_mother_name2() {
        studentManagement.studentMotherName.sendKeys("Olivia");
    }
    @When("enter student Password2")
    public void enter_student_password2() {
        studentManagement.studentPassword.sendKeys("Tugce123");
    }
    @When("click on Submit Button2")
    public void click_on_submit_button2() {
        studentManagement.submitNewStudent.click();
    }

}
