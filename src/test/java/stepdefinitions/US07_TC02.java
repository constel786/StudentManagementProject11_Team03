package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class US07_TC02 {

    WebDriver driver = new ChromeDriver();


    @When("user clicks on menu")
    public void user_clicks_on_menu() {
        WebElement menuLink = driver.findElement(By.xpath("//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']"));
        menuLink.click();


    }

    @Then("user clicks on Contact Get All")
    public void user_clicks_on_contact_get_all() {
        WebElement contactGetAllLink = driver.findElement(By.xpath("//a[.='Contact Get All']"));
        contactGetAllLink.click();
    }

    @Then("user checks that the name is displayed.")
    public void user_checks_that_the_name_is_displayed() {
        WebElement name = driver.findElement(By.xpath("//th[.='Name']"));
        assertTrue(name.isDisplayed());
    }

    @Then("user checks that the emails is displayed.")
    public void user_checks_that_the_emails_is_displayed() {
        WebElement emails = driver.findElement(By.xpath("//th[.='Email']"));
        assertTrue(emails.isDisplayed());

    }

    @Then("user checks that the sending dates is displayed.")
    public void user_checks_that_the_sending_dates_is_displayed() {
        WebElement date = driver.findElement(By.xpath("//th[.='Date']"));
        assertTrue(date.isDisplayed());

    }

    @Then("user checks that the subject information is visible")
    public void user_checks_that_the_subject_information_is_visible() {
        WebElement subject = driver.findElement(By.xpath("//th[.='Subject']"));
        assertTrue(subject.isDisplayed());

    }

    @Then("user checks that message is visible")
    public void user_checks_that_message_is_visible() {
        WebElement message = driver.findElement(By.xpath("//th[.='Message']"));
        assertTrue(message.isDisplayed());
    }

    @Then("close driver")
    public void close_driver() {

    }
}
