package stepdefinitions;

import com.mongodb.client.model.geojson.LineString;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ChooseLessonPage;
import pages.GradesAnnouncementsPage;
import pages.ManagementonSchoolHomePage;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertTrue;

public class US_21_StepDefs {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    ChooseLessonPage chooseLessonPage = new ChooseLessonPage();

    GradesAnnouncementsPage gradesAnnouncementsPage = new GradesAnnouncementsPage();

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

        managementonSchoolHomePage.userNameLogin.sendKeys("Ash98");

    }
    @Given("enter password {string}")
    public void enter_password(String string) {

        managementonSchoolHomePage.passwordLogin.sendKeys("Manisa98");

    }
    @Given("student clicks login button")
    public void student_clicks_login_button() {
        managementonSchoolHomePage.loginButton.click();
        WaitUtils.waitFor(10);

    }
    @Given("verify the visibility of the teacher day start and stop time information in the choose lesson list")
    public void verify_the_visibility_of_the_teacher_day_start_and_stop_time_information_in_the_choose_lesson_list() {

       // List<WebElement> teacherDayStartStopInfo=Driver.getDriver().findElements(By.xpath("(//thead)[1]/tr/th"));
       // List<String> teacherDayStartStopInfoString=new ArrayList<>();
       // for (WebElement w: teacherDayStartStopInfo) {
       //     teacherDayStartStopInfoString.add(w.toString());
       //  }

        BrowserUtils.verifyElementDisplayed(chooseLessonPage.chooseLessonTitle);

        // System.out.println(chooseLessonPage.teacherConf.getText());


        //assertTrue(chooseLessonPage.submitButton.isDisplayed());

    }
    @Then("close the application")
    public void close_the_application() {

        Driver.closeDriver();
        WaitUtils.waitFor(2);

    }

    Random random= new Random();
    WebElement randomLesson=null;
    WebElement randomlesson2=null;
    @Given("student selects a {string}")
    public void student_selects_a(String string) {

        List<WebElement> listOfLessons=Driver.getDriver().findElements(By.xpath("//*[@id='lessonProgramId']"));


        randomLesson= listOfLessons.get(random.nextInt(listOfLessons.size()));
        BrowserUtils.clickWithTimeOut(randomLesson,5);


    }
    @Given("student clicks the submit button")
    public void student_clicks_the_submit_button() {
        JSUtils.clickWithTimeoutByJS(chooseLessonPage.submitButton);


    }
    @Given("student unselects a lesson")
    public void student_unselects_a_lesson() {

        BrowserUtils.clickWithTimeOut(randomLesson,3);

    }
    @Then("verify the courses are added to the list")
    public void verify_the_courses_are_added_to_the_list() {

        BrowserUtils.verifyElementDisplayed(chooseLessonPage.confirmationAlert);

    }

    @Given("student selects multiple courses")
    public void student_selects_multiple_courses() {
        List<WebElement> listOfLessons=Driver.getDriver().findElements(By.xpath("//*[@id='lessonProgramId']"));


        randomLesson= listOfLessons.get(random.nextInt(listOfLessons.size()));
        BrowserUtils.clickWithTimeOut(randomLesson,3);
        randomlesson2=listOfLessons.get(random.nextInt(listOfLessons.size()));
        BrowserUtils.clickWithTimeOut(randomlesson2, 3);


    }

    @Given("student selects multiple simultaneous {string}")
    public void student_selects_multiple_simultaneous(String string) {
        WebElement lesson1= Driver.getDriver().findElement(By.xpath("//*[@value='5']"));
        BrowserUtils.clickWithTimeOut(lesson1,3);
        WebElement lesson2= Driver.getDriver().findElement(By.xpath("//*[@value='150']"));
        BrowserUtils.clickWithTimeOut(lesson2,3);
    }

    @Then("verify the notification of denial")
    public void verify_the_notification_of_denial() {

        BrowserUtils.verifyElementDisplayed(chooseLessonPage.warningAlert);

    }

    @Given("click Menu button")
    public void click_menu_button() {

       JSUtils.clickWithTimeoutByJS(managementonSchoolHomePage.menuButton);
       WaitUtils.waitFor(3);

    }
    @Given("click Grades and announcements link")
    public void click_grades_and_announcements_link() {

        chooseLessonPage.gradesAndAnnouncementsLink.click();

    }
    @Then("verify the visibility of grades")
    public void verify_the_visibility_of_grades() {
        BrowserUtils.verifyElementDisplayed(gradesAnnouncementsPage.studentInfoList);
    }

    @Then("verify the visibility of meetings")
    public void verify_the_visibility_of_meetings() {
        BrowserUtils.verifyElementDisplayed(gradesAnnouncementsPage.meetList);

    }

    @And("student selects a simultaneous lesson2 {string}")
    public void studentSelectsASimultaneousLesson2(String arg0) {

        WebElement lesson2=Driver.getDriver().findElement(By.xpath("//*[@value='"+arg0+"']"));
        //Driver.getDriver().findElement(By.xpath("//*[@value='"+arg1+"']")).click();

        BrowserUtils.clickWithTimeOut(lesson2,3);

    }

    @And("select choose lesson link")
    public void selectChooseLessonLink() {
        //JSUtils.clickWithTimeoutByJS(managementonSchoolHomePage.chooseLessonLink);

        BrowserUtils.clickWithTimeOut(managementonSchoolHomePage.chooseLessonLink,7);
    }

    WebElement lesson1=null;
    @And("student selects lesson1 {string}")
    public void studentSelectsLesson1(String arg1) {

        lesson1=Driver.getDriver().findElement(By.xpath("//*[@value='"+arg1+"']"));
        BrowserUtils.clickWithTimeOut(lesson1,3);


    }

    @And("student unselects lesson1")
    public void studentUnselectsLesson1() {
        BrowserUtils.clickWithTimeOut(lesson1,3);
    }

    @Then("simultaneous courses alert")
    public void simultaneousCoursesAlert() {

        BrowserUtils.verifyElementDisplayed(chooseLessonPage.simulatenousLessonsError);

    }
}
