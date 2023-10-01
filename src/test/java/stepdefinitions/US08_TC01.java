package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LessonPage;
import pages.ManagementonSchoolHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

public class US08_TC01 {

    private String creditScore;

    public US08_TC01() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    WebDriver driver = Driver.getDriver();

    LessonPage lessonPage = new LessonPage();

    @Given("user must be logged in to the website as a Vice Dean")
    public void user_must_be_logged_in_to_the_website_as_a_vice_dean() {
        ManagementonSchoolHomePage.login.click();
        managementonSchoolHomePage.userNameLogin.sendKeys(ConfigReader.getProperty("username"));
        WaitUtils.waitFor(2);
        managementonSchoolHomePage.passwordLogin.sendKeys(ConfigReader.getProperty("password"));
        managementonSchoolHomePage.loginButton.click();
        WaitUtils.waitFor(2);

    }

    @When("clicks on the {string} tab")
    public void clicks_on_the_tab(String string) {
        WaitUtils.waitFor(1);
        lessonPage.lesson.click();
    }

    @When("enters the {string}")
    public void enters_the(String lessonName) {
        WaitUtils.waitFor(1);
        lessonPage.lessonName.sendKeys(lessonName);


    }

    @When("clicks on the {string} checkbox")
    public void clicks_on_the_checkbox(String string) {
        WaitUtils.waitFor(1);
        lessonPage.compulsoryCheckbox.click();
    }

    @Then("enters on the {string} CreditScore")
    public void enters_credit_score(String CreditScore) {
        creditScore = CreditScore;
        WaitUtils.waitFor(1);
        lessonPage.creditScore.sendKeys(CreditScore);

    }

    @Then("clicks on the {string} button")
    public void clicks_on_the_button(String button) {
        WaitUtils.waitFor(1);
        lessonPage.submitButton.click();
    }
    @Then("verifies that the new lesson is added successfully")
    public void verifies_that_the_new_lesson_is_added_successfully() {
        Assert.assertTrue(lessonPage.successMessage.isDisplayed());




    }

}