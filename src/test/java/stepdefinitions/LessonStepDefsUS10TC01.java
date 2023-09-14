package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.LessonPage;
import pages.ManagementonSchoolHomePage;
import utilities.WaitUtils;

import static org.junit.Assert.assertTrue;

public class LessonStepDefsUS10TC01 {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    LessonPage lessonPage = new LessonPage();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;





    //US10 TC01
    @When("click on lesson program")
    public void click_on_lesson_program() {
        lessonPage.lessonProgram.click();
        WaitUtils.waitFor(1);
    }

    @When("select one lessons from the dropdown")
    public void select_one_lessons_from_the_dropdown() {
        lessonPage.selectLesson.click();
        lessonPage.lessonType.sendKeys("Java" + Keys.ENTER);
    }

    @When("select a semester from Choose Education Term dropdown")
    public void select_a_semester_from_choose_education_term_dropdown() {
        Select select2 = new Select(lessonPage.educationTermDropdown);
        select2.selectByVisibleText("SPRING_SEMESTER");
    }

    @When("select a day Choose Day dropdown")
    public void select_a_day_choose_day_dropdown() {
        Select select3 = new Select(lessonPage.dayDropdown);
        select3.selectByVisibleText("TUESDAY");
    }

    @When("select hour from Start Time dropdown")
    public void select_hour_from_start_time_dropdown() {
        lessonPage.startTime.sendKeys("1630");
        WaitUtils.waitFor(1);
    }

    @When("select hour from Stop Time dropdown")
    public void select_hour_from_stop_time_dropdown() {
        lessonPage.stopTime.sendKeys("0830PM");
    }

    @When("click on {string} button")
    public void click_on_button(String string) {
        lessonPage.submitButton.click();
    }

    @When("verify {string} alert is displayed")
    public void verify_alert_is_displayed(String string) {
        assertTrue(lessonPage.alert.isDisplayed());
    }
}
