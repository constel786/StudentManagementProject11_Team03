package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ManagementonSchoolHomePage;
import pages.StudentManagement;

public class StepDefsUS16TC28 {
    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    StudentManagement studentManagement = new StudentManagement();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;

    @When("click on Menu4")
    public void click_on_menu4() {
        studentManagement.menuButton.click();
    }
    @When("click on Contact Get All")
    public void click_on_contact_get_all() {
        studentManagement.contactGetAll.click();
    }
    @Then("verify that delete button is visible")
    public void verify_that_delete_button_is_visible() {
        studentManagement.deleteButton.click();
        //no delete button
    }
}
