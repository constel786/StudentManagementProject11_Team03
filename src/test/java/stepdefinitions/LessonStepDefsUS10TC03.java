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

public class LessonStepDefsUS10TC03 {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    LessonPage lessonPage = new LessonPage();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;

    @When("click on lesson program3")
    public void click_on_lesson_program3() {
        lessonPage.lessonProgram.click();
        WaitUtils.waitFor(1);
    }

    @When("select one lessons from the dropdown3")
    public void select_one_lessons_from_the_dropdown3() {
        lessonPage.selectLesson.click();
        lessonPage.lessonType.sendKeys("Java" + Keys.ENTER);
    }

    @When("do not select a semester")
    public void do_not_select_a_semester() {
    }

    @When("select a day Choose Day dropdown3")
    public void select_a_day_choose_day_dropdown3() {
        Select select3 = new Select(lessonPage.dayDropdown);
        select3.selectByVisibleText("TUESDAY");
    }

    @When("select hour from Start Time dropdown3")
    public void select_hour_from_start_time_dropdown3() {
        lessonPage.startTime.sendKeys("1630");
        WaitUtils.waitFor(1);
    }

    @When("select hour from Stop Time dropdown3")
    public void select_hour_from_stop_time_dropdown3() {
        lessonPage.stopTime.sendKeys("0830PM");
        WaitUtils.waitFor(1);
    }

    @When("click on {string} button3")
    public void click_on_button3(String string) {
        JSUtils.clickWithTimeoutByJS(lessonPage.submitButton);
    }

    @When("verify lesson is not created3")
    public void verify_lesson_is_not_created3() {
        String list = lessonPage.createdLessonList.getText();
        String[] stringArray = list.split("\n");
        List<String> lessonList = new ArrayList<>(Arrays.asList(stringArray));
        assertFalse(lessonList.contains("Java"));
    }

}
