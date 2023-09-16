package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.en.When;
import pages.LessonPage;
import pages.ManagementonSchoolHomePage;
import utilities.ConfigReader;
import utilities.JSUtils;
import utilities.WaitUtils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LessonStepDefsUS09 {
    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    LessonPage lessonPage = new LessonPage();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;




    //US09 TC01
    @When("user must be logged in to the website as a vice dean")
    public void user_must_be_logged_in_to_the_website_as_a_vice_dean() {
        managementonSchoolHomePage.login.click();
        managementonSchoolHomePage.userNameLogin.sendKeys(ConfigReader.getProperty("username"));
        WaitUtils.waitFor(1);
        managementonSchoolHomePage.passwordLogin.sendKeys(ConfigReader.getProperty("password"));
        managementonSchoolHomePage.loginButton.click();
        WaitUtils.waitFor(1);
    }

    @When("click on lessons")
    public void click_on_lessons() {
        WaitUtils.waitFor(1);
        lessonPage.lesson.click();
    }

    @When("verify lesson list is visible")
    public void verify_lesson_list_is_visible() {
        assertTrue(lessonPage.lessonListTable.isDisplayed());
    }






    //US09 TC02
    @When("click on one of the trash icon")
    public void click_on_one_of_the_trash_icon() {
        JSUtils.clickWithTimeoutByJS(lessonPage.trashIcon);
        WaitUtils.waitFor(1);
    }

    @When("verify lesson deleted alert is visible")
    public void verify_lesson_deleted_alert_is_visible() {
        assertTrue(lessonPage.firstLesson.isDisplayed());
    }

}
