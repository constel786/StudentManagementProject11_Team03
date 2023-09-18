package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.LessonPage;
import pages.ManagementonSchoolHomePage;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;

public class LessonStepDefsUS10TC04 {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    LessonPage lessonPage = new LessonPage();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;

    @When("click on lesson program4")
    public void click_on_lesson_program4() {
        lessonPage.lessonProgram.click();
        WaitUtils.waitFor(1);
    }
    @When("select one lessons from the dropdown4")
    public void select_one_lessons_from_the_dropdown4() {
        lessonPage.selectLesson.click();
        lessonPage.lessonType.sendKeys("Java" + Keys.ENTER);
    }
    @When("select a semester from Choose Education Term dropdown4")
    public void select_a_semester_from_choose_education_term_dropdown4() {
        Select select2 = new Select(lessonPage.educationTermDropdown);
        select2.selectByVisibleText("SPRING_SEMESTER");
    }
    @When("do not select a day")
    public void do_not_select_a_day() {
    }
    @When("select hour from Start Time dropdown4")
    public void select_hour_from_start_time_dropdown4() {
        lessonPage.startTime.sendKeys("1630");
        WaitUtils.waitFor(1);
    }
    @When("select hour from Stop Time dropdown4")
    public void select_hour_from_stop_time_dropdown4() {
        lessonPage.stopTime.sendKeys("0830PM");
        WaitUtils.waitFor(1);
    }
    @When("click on {string} button4")
    public void click_on_button4(String string) {
        JSUtils.clickWithTimeoutByJS(lessonPage.submitButton);
    }
    @When("verify lesson is not created4")
    public void verify_lesson_is_not_created4() {
        String list = lessonPage.createdLessonList.getText();
        String[] stringArray = list.split("\n");
        List<String> lessonList = new ArrayList<>(Arrays.asList(stringArray));
        assertFalse(lessonList.contains("Java"));
    }
}
