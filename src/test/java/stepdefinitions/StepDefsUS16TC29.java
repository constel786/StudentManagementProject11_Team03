package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.ContactGetAllPage;
import pages.ManagementonSchoolHomePage;
import pages.StudentManagement;

public class StepDefsUS16TC29 {
    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    ContactGetAllPage contactGetAllPage = new ContactGetAllPage();
    StudentManagement studentManagement = new StudentManagement();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;

    @When("click on Menu5")
    public void click_on_menu5() {
        studentManagement.menuButton.click();
    }
    @When("click on Contact Get All2")
    public void click_on_contact_get_all2() {
        studentManagement.contactGetAll.click();
    }
    @When("verify that page contains name section")
    public void verify_that_page_contains_name_section() {
        Assert.assertTrue(contactGetAllPage.nameSection.isDisplayed());
    }
    @When("verify that page contains email section")
    public void verify_that_page_contains_email_section() {
        Assert.assertTrue(contactGetAllPage.emailSection.isDisplayed());
    }
    @When("verify that page contains date section")
    public void verify_that_page_contains_date_section() {
        Assert.assertTrue(contactGetAllPage.dateSection.isDisplayed());
    }
    @When("verify that page contains subject section")
    public void verify_that_page_contains_subject_section() {
        Assert.assertTrue(contactGetAllPage.subjectSection.isDisplayed());
    }

}
