package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Add_Admin_Page;
import pages.Add_Teacher_Page;
import pages.ManagementonSchoolHomePage;
import pages.StudentInfoManagementPage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.WaitUtils;

public class Add_Teacher_StepDefs {
    Add_Teacher_Page addTeacherPage = new Add_Teacher_Page();
    Add_Admin_Page addAdminPage = new Add_Admin_Page();

//    protected static ExtentReports extentReports;
//    protected static ExtentSparkReporter extentSparkReporter;
//    protected static ExtentTest extentTest;

    @Given("vice dean login")
    public void vice_dean_login() throws InterruptedException {
        Driver.getDriver().get("https://managementonschools.com");
        Thread.sleep(2000);
        Add_Admin_Page.LOGIN_BUTTON_1.click();
        Add_Admin_Page.LOGIN_USERNAME.sendKeys("VDProject11");
        Add_Admin_Page.LOGIN_PASSWORD.sendKeys("Nowayjose1234");
        Add_Admin_Page.LOGIN_BUTTON_2.click();

    }
    @When("Click the Menu button")
    public void clickTheMenuButton() {
        addTeacherPage.menuButton.click();
        WaitUtils.waitFor(1);
    }
    @When("Click the Teacher Management button")
    public void clickTheTeacherManagementButton() {
        addTeacherPage.teacherManagement.click();
        WaitUtils.waitFor(1);
    }
    @When("Select Choose Lessons dropdown")
    public void selectChooseLessonsDropdown() {
        addTeacherPage.chooseLessons.click();
        WaitUtils.waitFor(1);
    }
    @And("Click lesson {string}")
    public void clickLesson(String arg0) {
        addTeacherPage.english.click();
        WaitUtils.waitFor(1);
    }
    @When("Enter {string} in the name field")
    public void enter_in_the_name(String name) {
        addTeacherPage.name.sendKeys(name);
        WaitUtils.waitFor(1);
    }
    @And("Enter {string} in the surname field")
    public void enter_in_the_surname(String surname) {
        addTeacherPage.name.sendKeys(surname);
        WaitUtils.waitFor(1);
    }
    @When("Enter {string} in the Birth Place field")
    public void enter_in_the_birth_place(String birthPlace) {
        addTeacherPage.birthPlace.sendKeys(birthPlace);
        WaitUtils.waitFor(1);
    }
    @When("Enter {string} in the Email field")
    public void enter_in_the_email(String email){
        addTeacherPage.email.sendKeys(email);
        WaitUtils.waitFor(1);
    }
    @When("Enter {string} in the Phone field")
    public void enter_in_the_phone(String phoneNumber){
        addTeacherPage.phoneNumber.sendKeys(phoneNumber);
        WaitUtils.waitFor(1);
    }
    @And("Select {string} in the Gender field")
    public void selectInTheGenderField(String arg0) {
        addTeacherPage.genderMale.click();
        WaitUtils.waitFor(1);
    }
    @When("Enter {string} in the Date of Birth field")
    public void enter_in_the_date_of_birth(String birthDay){
        addTeacherPage.birthDay.sendKeys(birthDay);
        WaitUtils.waitFor(1);
    }
    @And("Enter ssn number {string}")
    public void enterSsnNumber(String arg0) {
        addTeacherPage.ssn.sendKeys();
        WaitUtils.waitFor(1);
    }
    @When("Enter {string} in the username field")
    public void enter_in_the_username(String username){
        addTeacherPage.username.sendKeys(username);
        WaitUtils.waitFor(1);
    }
    @When("Enter {string} in the password field")
    public void enter_in_the_password(String password){
        addTeacherPage.password.sendKeys(password);
        WaitUtils.waitFor(1);
    }
    @When("Click the Submit button")
    public void click_the_submit_button(){
        addTeacherPage.submitButton.click();
        WaitUtils.waitFor(1);
    }
    @Then("Verify Teacher is created")
    public void verifyTeacherIsCreated() {

    }

}
