package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ManagementSchoolHomePage;
import pages.StudentManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

public class StudentStepDefs_US25_TC01 {
    ManagementSchoolHomePage managementSchoolHomePage = new ManagementSchoolHomePage();

    StudentManagementPage studentManagementPage = new StudentManagementPage();

    @Given("admin navigates to {string}")
    public void admin_navigates_to(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("URL"));

    }

    @When("admin must be logged in to the website as a admin")
    public void admin_must_be_logged_in_to_the_website_as_a_admin() {
        WaitUtils.waitFor(2);
        managementSchoolHomePage.loginButton1.click();
        managementSchoolHomePage.usernamelogin.sendKeys(ConfigReader.getProperty("username"));
        managementSchoolHomePage.passwordlogin.sendKeys(ConfigReader.getProperty("password"));
        managementSchoolHomePage.loginclickbutton2.click();

    }

    @When("click on Menu for student")
    public void click_on_menu_for_student() {
        studentManagementPage.menuButtonclick.click();

    }

    @When("click student management")
    public void click_student_management() {
        studentManagementPage.studentManagement.click();

    }

    @And("click Advisor Teacher dropdown")
    public void clickAdvisorTeacherDropdown() {
        studentManagementPage.isAdvisorTeacher.click();

    }



    @When("enter student Name")
    public void enter_student_name() {
        studentManagementPage.studentname.sendKeys("Yuji");

    }

    @When("enter student Surname")
    public void enter_student_surname() {
        studentManagementPage.studentsurname.sendKeys("Itadori");

    }

    @When("enter student Birth Place")
    public void enter_student_birth_place() {
        studentManagementPage.studentbirthPlace.sendKeys("Japan");

    }

    @When("enter student Email")
    public void enter_student_email() {
        studentManagementPage.studentemail.sendKeys("itadori@gmail.com");

    }

    @When("enter student Phone Number")
    public void enter_student_phone_number() {
        studentManagementPage.studentphoneNumber.sendKeys("899-567-2893");

    }

    @When("select student Gender")
    public void select_student_gender() {
        studentManagementPage.studentMale.click();

    }


    @And("select student actual Date Of Birth")
    public void selectStudentActualDateOfBirth() {
        studentManagementPage.studentbirthDay.sendKeys("10/03/2001");

    }

    @And("enter student valid SSN")
    public void enterStudentValidSSN() {
        studentManagementPage.studentssnNumber.sendKeys("989-73-2617");

    }

    @When("enter student User Name")
    public void enter_student_user_name() {
        studentManagementPage.studentusername.sendKeys("spryuji");

    }

    @When("enter student Father Name")
    public void enter_student_father_name() {
        studentManagementPage.studentfatherName.sendKeys("dadyuji");

    }

    @When("enter student Mother Name")
    public void enter_student_mother_name() {
        studentManagementPage.studentmotherName.sendKeys("momyuji");

    }

    @And("enter student Password with required credentials")
    public void enterStudentPasswordWithRequiredCredentials() {
        studentManagementPage.studentPassword.sendKeys("Megumi.1");
    }

    @When("click on student Submit Button")
    public void click_on_student_submit_button() {
        studentManagementPage.studentSubmit.click();

    }





}
