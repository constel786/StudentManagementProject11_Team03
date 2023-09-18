package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.EditStudentInfoPage;
import pages.ManagementonSchoolHomePage;
import pages.MeetManagementPage;
import pages.StudentInfoManagementPage;
import utilities.*;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class StudentMeetStepDefs {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    MeetManagementPage meetManagementPage = new MeetManagementPage();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;


    @Given("user clicks on home page login button")
    public void user_clicks_on_home_page_login_button() {
        meetManagementPage.login.click();
        WaitUtils.waitFor(1);
    }

    @Given("user logged the username {string}")
    public void user_logged_the_username(String string) {
        managementonSchoolHomePage.userNameLogin.sendKeys(string);
        WaitUtils.waitFor(1);
    }

    @Given("user logged password {string}")
    public void user_logged_password(String string) {
        managementonSchoolHomePage.passwordLogin.sendKeys(string);
        WaitUtils.waitFor(1);
    }

    @Given("user clicks on the login")
    public void user_clicks_on_the_login() {
        managementonSchoolHomePage.loginButton.click();
    }

    @Given("user clicks to Menu")
    public void user_clicks_to_menu() {
        meetManagementPage.Menu.click();
        WaitUtils.waitFor(1);
    }

    @Given("user clicks to Meet Managment")
    public void user_clicks_to_meet_managment() {
        meetManagementPage.MeetManagement.click();
        WaitUtils.waitFor(1);
    }


    @And("select student {string},  {string} ,{string},  {string},   {string}")
    public void selectStudent(String student_name, String day_of_meet, String start_time, String stop_time, String description) {

        meetManagementPage.studentClick.click();

        meetManagementPage.student.sendKeys(student_name + Keys.ENTER);

        WaitUtils.waitFor(4);

        meetManagementPage.date.sendKeys(day_of_meet);
        WaitUtils.waitFor(4);

        meetManagementPage.selectStartTime.click();
        meetManagementPage.selectStartTime.sendKeys(start_time);
        WaitUtils.waitFor(4);
        meetManagementPage.selectStopTime.click();
        meetManagementPage.selectStopTime.sendKeys(stop_time);
        WaitUtils.waitFor(4);


        meetManagementPage.Description.click();
        meetManagementPage.Description.sendKeys(description);

    }


    @And("user clicks on the submit button")
    public void userClicksOnTheSubmitButton() {
        JSUtils.clickWithTimeoutByJS(meetManagementPage.Submit);

        WaitUtils.waitFor(2);

    }


    @And("close the page")
    public void closeThePage() {
        Driver.closeDriver();
    }




    @Then("Verify {string}  is visible for  student")
    public void verifyIsVisibleForStudent(String arg0) {

        BrowserUtils.verifyElementDisplayed(meetManagementPage.verify);
        WaitUtils.waitFor(3);

    }




    @Then("Verify {string}")
    public void verify(String arg0) {
        BrowserUtils.verifyElementDisplayed(meetManagementPage.meetSchedule);
        WaitUtils.waitFor(3);
    }

    @Then("Verify {string}  is visible")
    public void verifyIsVisible(String arg0) {
        meetManagementPage.required.isDisplayed();
    }

    @Then("verify the alert")
    public void verifyTheAlert() {
        System.out.println(meetManagementPage.alert.getText());
        BrowserUtils.verifyElementDisplayed(meetManagementPage.alert);
        WaitUtils.waitFor(3);

    }












    @Then("verify the message")
    public void verifyTheMessage() {


    }


    @And("selectdate  {string}")
    public void selectdate(String arg0, String arg1) {
        meetManagementPage.date.sendKeys();
        WaitUtils.waitFor(4);
    }

    @And("selecttime ,{string},")
    public void selecttime(String arg0, String arg1) {
        meetManagementPage.selectStartTime.sendKeys(arg0);
        WaitUtils.waitFor(4);
    }

    @And("selectstime {string},")
    public void selectstime() {
        meetManagementPage.selectStopTime.sendKeys();



    }

    @And("selectdes {string}")
    public void selectdes(String arg0, String arg1) {

        meetManagementPage.Description.click();
        meetManagementPage.Description.sendKeys();


    }
}