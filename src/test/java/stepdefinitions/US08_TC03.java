package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.DeanManagementPage;
import pages.ManagementonSchoolHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.WaitUtils;

public class US08_TC03 {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    DeanManagementPage deanManagement = new DeanManagementPage();
    WebDriver driver = Driver.getDriver();

    @Given("user must be logged in to the website as a dean in US08TC03")
    public void user_must_be_logged_in_to_the_website_as_a_dean_in_US08TC03() {

        ManagementonSchoolHomePage.login.click();
        managementonSchoolHomePage.userNameLogin.sendKeys(ConfigReader.getProperty("username"));
        WaitUtils.waitFor(2);
        managementonSchoolHomePage.passwordLogin.sendKeys(ConfigReader.getProperty("password"));
        managementonSchoolHomePage.loginButton.click();
        WaitUtils.waitFor(2);

    }
    @When("user clicks the Lessons button")
    public void user_clicks_the_lessons_button() {

        WebElement lessonsButton1 = driver.findElement(By.id("controlled-tab-example-tab-lessonsList"));
        lessonsButton1.click();
    }

    @When("user clicks the Compulsory checkbox")
    public void user_clicks_the_compulsory_checkbox() {

        WebElement compulsoryCheckbox = driver.findElement(By.id("compulsoryCheckbox"));
        compulsoryCheckbox.click();
    }

    @When("user enters {string}")
    public void user_enters_in_the_credit_score_field(String creditScore) {

        WebElement creditScoreField = driver.findElement(By.id("creditScore"));
        creditScoreField.sendKeys(creditScore);
    }

    @When("user clicks the Submit button")
    public void user_clicks_the_submit_button() {

        WebElement submitButton = driver.findElement(By.id("submitButton"));
        submitButton.click();
    }

    @Then("an error message should be displayed")
    public void an_error_message_should_be_displayed() {

        WebElement errorMessage = driver.findElement(By.cssSelector(".error-message"));

        assert errorMessage.isDisplayed();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
