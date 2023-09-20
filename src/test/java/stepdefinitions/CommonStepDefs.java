package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.util.List;

public class CommonStepDefs {

    @Then("close the page")
    public void close_the_page (){
        Driver.closeDriver();
    }

    @Given("user navigates to {string}")
    public void userNavigatesTo(String url) {
        Driver.getDriver().get(url);
    }
}



