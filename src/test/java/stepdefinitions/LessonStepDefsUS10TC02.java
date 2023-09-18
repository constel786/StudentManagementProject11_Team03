package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.LessonPage;
import pages.ManagementonSchoolHomePage;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LessonStepDefsUS10TC02{

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    LessonPage lessonPage = new LessonPage();

    protected static ExtentReports extentReports;
    protected static ExtentSparkReporter extentSparkReporter;
    protected static ExtentTest extentTest;



    @When("click on lesson program2")
    public void click_on_lesson_program2() {
        lessonPage.lessonProgram.click();
        WaitUtils.waitFor(1);
    }

    @When("do not select lesson")
    public void do_not_select_lesson() {

    }

    @When("select a semester from Choose Education Term dropdown2")
    public void select_a_semester_from_choose_education_term_dropdown2() {
        Select select2 = new Select(lessonPage.educationTermDropdown);
        select2.selectByVisibleText("SPRING_SEMESTER");
    }

    @When("select a day Choose Day dropdown2")
    public void select_a_day_choose_day_dropdown2() {
        Select select3 = new Select(lessonPage.dayDropdown);
        select3.selectByVisibleText("TUESDAY");
    }

    @When("select hour from Start Time dropdown2")
    public void select_hour_from_start_time_dropdown2() {
        lessonPage.startTime.sendKeys("1630");
        WaitUtils.waitFor(1);
    }

    @When("select hour from Stop Time dropdown2")
    public void select_hour_from_stop_time_dropdown2() {
        lessonPage.stopTime.sendKeys("0830PM");
        WaitUtils.waitFor(1);
    }

    @When("click on {string} button2")
    public void click_on_button2(String string) {
        JSUtils.clickWithTimeoutByJS(lessonPage.submitButton);
    }

    @When("verify lesson is not created")
    public void verify_lesson_is_not_created() {
        String list = lessonPage.createdLessonList.getText();
        String[] stringArray = list.split("\n");
        List<String> lessonList = new ArrayList<>(Arrays.asList(stringArray));
        assertFalse(lessonList.contains("Java"));
    }

}






