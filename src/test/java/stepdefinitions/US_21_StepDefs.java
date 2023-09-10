package stepdefinitions;

import com.mongodb.client.model.geojson.LineString;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ChooseLessonPage;
import pages.GradesAnnouncementsPage;
import pages.ManagementonSchoolHomePage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class US_21_StepDefs {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    ChooseLessonPage chooseLessonPage = new ChooseLessonPage();

    GradesAnnouncementsPage gradesAnnouncementsPage = new GradesAnnouncementsPage();

    List<WebElement> listOfLessons=Driver.getDriver().findElements(By.xpath("//*[@id='lessonProgramId']"));

    @Given("student goes to {string}")
    public void student_goes_to(String string) {

        Driver.getDriver().get(string);

    }

    @Given("click login link")
    public void click_login_link() {
        managementonSchoolHomePage.login.click();
    }
    @Given("enter username {string}")
    public void enter_username(String string) {

        managementonSchoolHomePage.userNameLogin.sendKeys("JessiePinkman");

    }
    @Given("enter password {string}")
    public void enter_password(String string) {

        managementonSchoolHomePage.userNameLogin.sendKeys("Pinkman98");

    }
    @Given("student clicks login button")
    public void student_clicks_login_button() {
        managementonSchoolHomePage.loginButton.click();

    }
    @Given("verify the visibility of the teacher day start and stop time information in the choose lesson list")
    public void verify_the_visibility_of_the_teacher_day_start_and_stop_time_information_in_the_choose_lesson_list() {

        List<WebElement> teacherDayStartStopInfo=Driver.getDriver().findElements(By.xpath("(//thead)[1]/tr"));
        List<String> teacherDayStartStopInfoString=new ArrayList<>();
        for (WebElement w: teacherDayStartStopInfo) {
            teacherDayStartStopInfoString.add(w.toString());
        }

        assertTrue(teacherDayStartStopInfoString.contains("Teacher"));
    }
    @Then("close the application")
    public void close_the_application() {

        Driver.closeDriver();

    }

    @Given("student selects a {string}")
    public void student_selects_a(String string) {

        Random random= new Random();
        WebElement randomLesson= listOfLessons.get(random.nextInt(listOfLessons.size()));
        randomLesson.click();

    }
    @Given("student clicks the submit button")
    public void student_clicks_the_submit_button() {
        chooseLessonPage.submitButton.click();

    }
    @Given("student unselects a lesson")
    public void student_unselects_a_lesson() {



    }
    @Then("verify the courses are added to the list")
    public void verify_the_courses_are_added_to_the_list() {

        assertTrue(chooseLessonPage.confirmationAlert.isDisplayed());

    }

    @Given("student selects multiple courses")
    public void student_selects_multiple_courses() {

        Random random= new Random();
        WebElement randomLesson= listOfLessons.get(random.nextInt(listOfLessons.size()));
        randomLesson.click();
        WebElement randomLesson2= listOfLessons.get(random.nextInt(listOfLessons.size()));
        randomLesson2.click();

    }

    @Given("student selects multiple simultaneous {string}")
    public void student_selects_multiple_simultaneous(String string) {
        WebElement lesson1= Driver.getDriver().findElement(By.xpath("//*[@value='89']"));
        lesson1.click();
        WebElement lesson2= Driver.getDriver().findElement(By.xpath("//*[@value='90']"));
        lesson2.click();
    }

    @Then("verify the notification of denial")
    public void verify_the_notification_of_denial() {

        assertTrue(chooseLessonPage.warningAlert.isDisplayed());

    }

    @Given("click Menu button")
    public void click_menu_button() {

        chooseLessonPage.menuButton.click();

    }
    @Given("click Grades and announcements link")
    public void click_grades_and_announcements_link() {

        chooseLessonPage.gradesAndAnnouncementsLink.click();

    }
    @Then("verify the visibility of grades")
    public void verify_the_visibility_of_grades() {

        assertTrue(gradesAnnouncementsPage.studentInfoList.isDisplayed());



    }

    @Then("verify the visibility of meetings")
    public void verify_the_visibility_of_meetings() {
        assertTrue(gradesAnnouncementsPage.meetList.isDisplayed());

    }
}
