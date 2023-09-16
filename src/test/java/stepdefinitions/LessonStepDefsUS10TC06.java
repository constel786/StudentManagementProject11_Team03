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

public class LessonStepDefsUS10TC06 {
    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    LessonPage lessonPage = new LessonPage();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;

    @When("click on lesson program6")
    public void click_on_lesson_program6() {
        lessonPage.lessonProgram.click();
        WaitUtils.waitFor(1);
    }
    @When("select one lessons from the dropdown6")
    public void select_one_lessons_from_the_dropdown6() {
        lessonPage.selectLesson.click();
        lessonPage.lessonType.sendKeys("Java" + Keys.ENTER);
    }
    @When("select a semester from Choose Education Term dropdown6")
    public void select_a_semester_from_choose_education_term_dropdown6() {
        Select select2 = new Select(lessonPage.educationTermDropdown);
        select2.selectByVisibleText("SPRING_SEMESTER");
    }
    @When("select a day Choose Day dropdown6")
    public void select_a_day_choose_day_dropdown6() {
        Select select3 = new Select(lessonPage.dayDropdown);
        select3.selectByVisibleText("TUESDAY");
    }
    @When("select hour from Start Time dropdown6")
    public void select_hour_from_start_time_dropdown6() {
        lessonPage.startTime.sendKeys("1630");
        WaitUtils.waitFor(1);
    }
    @When("do not select stop hour6")
    public void do_not_select_stop_hour6() {

    }
    @When("click on {string} button6")
    public void click_on_button6(String string) {
        JSUtils.clickWithTimeoutByJS(lessonPage.submitButton);
    }
    @When("verify lesson is not created6")
    public void verify_lesson_is_not_created6() {
        String list = lessonPage.createdLessonList.getText();
        String[] stringArray = list.split("\n");
        List<String> lessonList = new ArrayList<>(Arrays.asList(stringArray));
        assertFalse(lessonList.contains("Java"));
    }
}
