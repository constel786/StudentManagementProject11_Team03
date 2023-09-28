package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ManagementSchoolHomePage;
import pages.StudentManagementPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class StudentStepDefs_US25_TC01 {
    ManagementSchoolHomePage managementSchoolHomePage = new ManagementSchoolHomePage();

    StudentManagementPage studentManagementPage = new StudentManagementPage();

    Connection connection;
    ResultSet resultSet;

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
        studentManagementPage.studentsurname.sendKeys("Yuji");

    }

    @When("enter student Birth Place")
    public void enter_student_birth_place() {
        studentManagementPage.studentbirthPlace.sendKeys("Japan");

    }

    @When("enter student Email")
    public void enter_student_email() {
        studentManagementPage.studentemail.sendKeys("Itadori@gmail.com");



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
        studentManagementPage.studentssnNumber.sendKeys("876-71-2618");

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


    @Given("connect to database")
    public void connect_to_database() throws SQLException {
      connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");

    }
    @When("get student via name {string}")
    public void get_student_via_name(String name) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "select * from student where name = 'Yuji'";
        resultSet = statement.executeQuery(query);
        resultSet.next();
        System.out.println(resultSet.getString(6));

    }
    @Then("validate username {string} birth_day {string} birth_place {string} gender {string} name {string} phone_number {string} ssn  {string} surname {string} fathername {string} mothername {string}")
    public void validate_username_birth_day_birth_place_gender_name_phone_number_ssn_surname_fathername_mothername(String username, String birth_day , String birth_place, String gender, String name, String phone_number, String ssn, String surname, String fathername, String mothername) throws SQLException {
        String actualUsername = resultSet.getString("username");
        String actualBirth_day = resultSet.getString("birth_day");
        String actualBirth_place = resultSet.getString("birth_place");
        String actualgender = resultSet.getString("gender");
        String actualname = resultSet.getString("name");
        String actualPhone_number= resultSet.getString("phone_number");
        String actualSsn = resultSet.getString("ssn");
        String actualsurname = resultSet.getString("surname");
        String actualfathername = resultSet.getString("father_name");
        String actualmothername = resultSet.getString("mother_name");


        assertEquals(username,actualUsername);
        assertEquals(birth_day,actualBirth_day);
        assertEquals(birth_place, actualBirth_place);
        assertEquals(gender, actualgender);
        assertEquals(name,actualname);
        assertEquals(phone_number,actualPhone_number);
        assertEquals(ssn,actualSsn);
        assertEquals(surname,actualsurname);
        assertEquals(fathername,actualfathername);
        assertEquals(mothername,actualmothername);

    }
    @Then("close the connection")
    public void close_the_connection() throws SQLException {
        resultSet.close();
        connection.close();

    }








}
