package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertTrue;

    public class US07_TC01 {

        WebDriver driver = new ChromeDriver();

        @Given("dean navigates to the {string}")
        public void dean_navigates_to_the(String url) {
            driver.get(url);
        }

        @When("clicks the Login Link")
        public void clicks_the_login_button() {
            WebElement loginLink = driver.findElement(By.xpath("//a[contains(.,'Login')]"));
            loginLink.click();
        }

        @When("dean must be logged in to the website as a dean")
        public void dean_must_be_logged_in_to_the_website_as_a_dean() {

            WebElement userName = driver.findElement(By.xpath("(//*[@class='form-control is-invalid'])[1]"));
            userName.sendKeys("DeanSinan01");

            WebElement password = driver.findElement(By.xpath("(//*[@class='form-control is-invalid'])[2]"));
            password.sendKeys("Sinan123.");

            WebElement loginButton = driver.findElement(By.xpath("//button[@class='fw-semibold btn btn-primary']"));
            loginButton.click();
        }

        @Then("dean verifies delete button is visible")
        public void dean_verifies_delete_button_is_visible() {
            WebElement deleteButton = driver.findElement(By.id("deleteButton"));
            assertTrue(deleteButton.isDisplayed());
            driver.quit();
        }
    }

