package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ManagementonSchoolHomePage;
import utilities.Driver;
import utilities.WaitUtils;

import java.util.List;

public class CommonStepDefs {

ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();

  
    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
        Driver.getDriver().get(string);
    }


    
    @Then("close the page")
    public void close_the_page (){

        Driver.closeDriver();
    }



    @Given("teacher navigates to {string}")
    public void userNavigatesTo(String url) {

        WaitUtils.waitFor(1);
        Driver.closeDriver();
    }
}

