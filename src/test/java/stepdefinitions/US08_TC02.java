package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class US08_TC02 {

    private WebDriver driver;

    @Given("user is logged in as a Vice Dean")
    public void user_is_logged_in_as_a_vice_dean() {

        driver = new ChromeDriver();
        driver.get("https://example.com/login");
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        usernameInput.sendKeys("your_username");
        passwordInput.sendKeys("your_password");
        loginButton.click();
    }

    @When("user clicks the {string} button")
    public void user_clicks_the_button(String buttonName) {

        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonName + "']"));
        button.click();
    }

    @When("user clicks {string}")
    public void user_clicks(String linkText) {

        WebElement link = driver.findElement(By.linkText(linkText));
        link.click();
    }

    @When("user enters {string} in the {string} field")
    public void user_enters_in_the_field(String text, String fieldName) {

        WebElement inputField = driver.findElement(By.name(fieldName));
        inputField.sendKeys(text);
    }

    @When("user clicks the {string} checkbox")
    public void user_clicks_the_checkbox(String checkboxLabel) {

        WebElement checkbox = driver.findElement(By.xpath("//label[text()='" + checkboxLabel + "']/preceding-sibling::input[@type='checkbox']"));
        checkbox.click();
    }

    @Then("the lesson {string} should be created")
    public void the_lesson_should_be_created(String lessonName) {

        WebElement createdLesson = driver.findElement(By.xpath("//div[contains(text(), '" + lessonName + "')]"));

        assert createdLesson.isDisplayed();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
