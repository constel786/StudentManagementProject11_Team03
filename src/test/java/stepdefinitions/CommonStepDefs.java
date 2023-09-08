package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.Driver;

public class CommonStepDefs {

    @Then("close the page")
    public void close_the_page (){
        Driver.closeDriver();}
    @Given("teacher navigates to {string}")
    //public void userNavigatesTo(String url) {
        Driver.getDriver().get(url);
    }



}
