package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.ManagementSchoolHomePage;
import pages.TeacherManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class TeacherStepDefs_US24_TC01 {


    ManagementSchoolHomePage managementSchoolHomePage = new ManagementSchoolHomePage();
    TeacherManagementPage teacherManagementPage = new TeacherManagementPage();
    Connection connection;
    ResultSet resultSet;

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;


    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {

        Driver.getDriver().get(ConfigReader.getProperty("URL"));
    }

    @When("user must be logged in to the website as a admin")
    public void user_must_be_logged_in_to_the_website_as_a_admin() {
        WaitUtils.waitFor(2);
        managementSchoolHomePage.loginButton1.click();
        managementSchoolHomePage.usernamelogin.sendKeys(ConfigReader.getProperty("username"));
        managementSchoolHomePage.passwordlogin.sendKeys(ConfigReader.getProperty("password"));
        managementSchoolHomePage.loginclickbutton2.click();

    }
    @When("click on Menu")
    public void click_on_menu() {
        WaitUtils.waitFor(2);
        teacherManagementPage.menuButtonclick.click();

    }
    @When("click Teacher management")
    public void click_teacher_management() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacherManagement.click();

    }
    @And("click Lesson dropdown")
    public void clickLessonDropdown() {
        teacherManagementPage.chooselessonbutton.click();

    }


    @And("enter teacher Name")
    public void enterTeacherName() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teachername.sendKeys("Gojoo");

    }

    @And("enter teacher Surname")
    public void enterTeacherSurname() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teachersurname.sendKeys("Satura");

    }

    @And("enter teacher Birth Place")
    public void enterTeacherBirthPlace() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacherbirthPlace.sendKeys("Japan");

    }

    @And("enter teacher Email")
    public void enterTeacherEmail() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacheremail.sendKeys("gojosko@gmail.com");

    }

    @And("enter teacher Phone Number")
    public void enterTeacherPhoneNumber() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacherphoneNumber.sendKeys("897-546-2424");

    }
    @And("enter is Advisor Teacher")
    public void enterIsAdvisorTeacher() {
        WaitUtils.waitFor(2);
        teacherManagementPage.isAdvisorTeacher.click();
    }


    @And("select Gender")
    public void selectGender() {
        WaitUtils.waitFor(2);
        teacherManagementPage.genderMale.click();


    }
    @And("select actual Date Of Birth")
    public void selectActualDateOfBirth() {
        teacherManagementPage.teacherbirthDay.sendKeys("17/10/1995");

    }

    @And("enter teacher valid SSN")
    public void enterTeacherValidSSN() {
        teacherManagementPage.teacherssnNumber.sendKeys("647-38-8392");
    }


    @And("enter teacher User Name")
    public void enterTeacherUserName() {
        WaitUtils.waitFor(2);
        teacherManagementPage.teacherusername.sendKeys("amazinggojo");

    }
    @And("enter teacher with required credentials Password")
    public void enterTeacherWithRequiredCredentialsPassword() {
        teacherManagementPage.passwordTeacher.sendKeys("Satoru.25");
    }




    @And("click on Submit Button")
    public void clickOnSubmitButton() {
        WaitUtils.waitFor(2);
        teacherManagementPage.submitTeacher.click();
    }


    @Given("connect to database for teacher")
    public void connect_to_database_for_teacher() throws SQLException {
     connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

    }
    @When("get teacher via name {string}")
    public void get_teacher_via_name(String name) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "select * from teacher where name = 'Gojo'";
        resultSet = statement.executeQuery(query);
        resultSet.next();

    }
    @Then("validate for teacher username {string} birth_day {string} birth_place {string} gender {string} name {string} phone_number {string} ssn  {string} surname {string}")
    public void validate_for_teacher_username_birth_day_birth_place_gender_name_phone_number_ssn_surname(String username, String birth_day, String birth_place, String gender, String name, String phone_number, String ssn, String surname) throws SQLException {
        String actualUsername = resultSet.getString("username");
        String actualBirth_day = resultSet.getString("birth_day");
        String actualBirth_place = resultSet.getString("birth_place");
        String actualgender = resultSet.getString("gender");
        String actualname = resultSet.getString("name");
        String actualPhone_number= resultSet.getString("phone_number");
        String actualSsn = resultSet.getString("ssn");
        String actualsurname = resultSet.getString("surname");

        assertEquals(username,actualUsername);
        assertEquals(birth_day,actualBirth_day);
        assertEquals(birth_place, actualBirth_place);
        assertEquals(gender, actualgender);
        assertEquals(name,actualname);
        assertEquals(phone_number,actualPhone_number);
        assertEquals(ssn,actualSsn);
        assertEquals(surname,actualsurname);
    }
    @Then("close connection")
    public void close_connection() throws SQLException {
        resultSet.close();
        connection.close();

    }







}
