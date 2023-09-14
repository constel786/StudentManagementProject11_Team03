package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ManagementonSchoolHomePage;
import utilities.Driver;
import utilities.WaitUtils;

public class CommonStepDefs {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();

    @Then("close the page")
    public void close_the_page (){
        WaitUtils.waitFor(1);
        Driver.closeDriver();}
    @Given("teacher navigates to {string}")
    public void userNavigatesTo(String url) {
        Driver.getDriver().get(url);
    }

    @Given("user goes to homepage")
    public void user_goes_to_homepage() {

        Driver.getDriver().get("https://managementonschools.com/");

    }

    @And("user clicks on login")
    public void userClicksOnLogin() {
        WaitUtils.waitFor(1);
        managementonSchoolHomePage.login.click();
    }

    @And("user fills login username input {string}")
    public void userFillLoginUsernameInput(String loginUsername) {
        managementonSchoolHomePage.userNameLogin.sendKeys(loginUsername);
    }

    @And("user fills login password input {string}")
    public void userFillsLoginPasswordInput(String loginPassword) {
        managementonSchoolHomePage.passwordLogin.sendKeys(loginPassword);
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        managementonSchoolHomePage.loginButton.click();
    }



}
