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

public class LessonStepDefsUS10TC05 {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    LessonPage lessonPage = new LessonPage();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;
    @When("click on lesson program5")
    public void click_on_lesson_program5() {
        lessonPage.lessonProgram.click();
        WaitUtils.waitFor(1);
    }
    @When("select one lessons from the dropdown5")
    public void select_one_lessons_from_the_dropdown5() {
        lessonPage.selectLesson.click();
        lessonPage.lessonType.sendKeys("Java" + Keys.ENTER);
    }
    @When("select a semester from Choose Education Term dropdown5")
    public void select_a_semester_from_choose_education_term_dropdown5() {
        Select select2 = new Select(lessonPage.educationTermDropdown);
        select2.selectByVisibleText("SPRING_SEMESTER");
    }
    @When("select a day Choose Day dropdown5")
    public void select_a_day_choose_day_dropdown5() {
        Select select3 = new Select(lessonPage.dayDropdown);
        select3.selectByVisibleText("TUESDAY");
    }
    @When("do not select start hour")
    public void do_not_select_start_hour() {

    }
    @When("select hour from Stop Time dropdown5")
    public void select_hour_from_stop_time_dropdown5() {
        lessonPage.stopTime.sendKeys("0830PM");
        WaitUtils.waitFor(1);
    }
    @When("click on {string} button5")
    public void click_on_button5(String string) {
        JSUtils.clickWithTimeoutByJS(lessonPage.submitButton);
    }
    @When("verify lesson is not created5")
    public void verify_lesson_is_not_created5() {
        String list = lessonPage.createdLessonList.getText();
        String[] stringArray = list.split("\n");
        List<String> lessonList = new ArrayList<>(Arrays.asList(stringArray));
        assertFalse(lessonList.contains("Java"));
    }
}
