package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdminManagementPage;
import pages.GuestUserPage;
import pages.ManagementonSchoolHomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

import java.util.ArrayList;
import java.util.List;

public class GuestRegistrationStepDefs {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();
    GuestUserPage guestUserPage = new GuestUserPage();

    @And("user clicks on register")
    public void userClicksOnRegister() {
        managementonSchoolHomePage.register.click();
    }

    @Given("user fills the name input {string}")
    public void user_fills_the_name_input(String name) {
        managementonSchoolHomePage.name.sendKeys(name);
    }

    @Given("user fills the surname input {string}")
    public void user_fills_the_surname_input(String surname) {
        managementonSchoolHomePage.surname.sendKeys(surname);
    }

    @Given("user fills the birth place input {string}")
    public void user_fills_the_birth_place_input(String birthPlace) {
        managementonSchoolHomePage.birthPlace.sendKeys(birthPlace);
    }

    @Given("user fills the phone number input {string}")
    public void user_fills_the_phone_number_input(String phoneNumber) {
        managementonSchoolHomePage.phoneNumber.sendKeys(phoneNumber);
    }

    @Given("user selects gender")
    public void user_selects_gender() {
        managementonSchoolHomePage.maleRadioButton.click();
    }

    @Given("user fills the birthday input {string}")
    public void user_fills_the_birthday_input(String birthday) {
        managementonSchoolHomePage.dateOfBirth.sendKeys(birthday);
    }

    @Given("user fills the SSN input {string}")
    public void user_fills_the_ssn_input(String ssn) {
        managementonSchoolHomePage.ssn.sendKeys(ssn);
    }

    @Given("user fills the username input {string}")
    public void user_fills_the_username_input(String username) {
        managementonSchoolHomePage.userNameRegister.sendKeys(username);
    }

    @Given("user fills the password input {string}")
    public void user_fills_the_password_input(String password) {
        managementonSchoolHomePage.passwordRegister.sendKeys(password);
    }

    @Given("user clicks register button")
    public void user_clicks_register_button() {
        JSUtils.clickWithTimeoutByJS(managementonSchoolHomePage.registerButton);
    }

    @Given("verify that registration has been successfully done")
    public void verify_that_registration_has_been_successfully_done() {
        WaitUtils.waitForVisibility(managementonSchoolHomePage.guestUserRegistrationVerificationMessage, 2);
        Assert.assertTrue(managementonSchoolHomePage.guestUserRegistrationVerificationMessage.isDisplayed());
        WaitUtils.waitFor(3);
    }


    @Given("delete this name {string} from guest users")
    public void deleteTheThisGuestUser(String name) {

        guestUserPage = new GuestUserPage();
        Driver.getDriver().get(ConfigReader.getProperty("managementon_school_url"));
        managementonSchoolHomePage.login.click();
        managementonSchoolHomePage.userNameLogin.sendKeys("bedotestadmin");
        managementonSchoolHomePage.passwordLogin.sendKeys("BedoTest1");
        managementonSchoolHomePage.loginButton.click();
        managementonSchoolHomePage.menu.click();
        adminManagementPage.menuGuestUser.click();
        WaitUtils.waitFor(1);


        guestUserPage.goLastPageButton.click();

        List<WebElement> names = new ArrayList<>();
        boolean x = true;
        while (x) {


            names.add(Driver.getDriver().findElement(By.xpath("//tr[1]/td")));
            names.add(Driver.getDriver().findElement(By.xpath("//tr[2]/td")));
            names.add(Driver.getDriver().findElement(By.xpath("//tr[3]/td")));
            names.add(Driver.getDriver().findElement(By.xpath("//tr[4]/td")));
            names.add(Driver.getDriver().findElement(By.xpath("//tr[5]/td")));

            for (int i = 0; i<5;i++) {
                if (names.get(i).getText().contains(name)) {
                    x = false;
                    break;
                }
            }

            names.clear();
            guestUserPage.goBackPageButton.click();
            WaitUtils.waitFor(1);
        }
        guestUserPage.goNextPageButton.click();

        WaitUtils.waitFor(2);
        for (int i = 1; i<=5;i++){

            WebElement xx = Driver.getDriver().findElement(By.xpath("//tr["+i+"]/td"));

            if (xx.getText().contains(name)){
                Driver.getDriver().findElement(By.xpath("//tr["+i+"]/td[5]/span/button")).click();
            }

        }

    }

    @And("verify that registration is not allowed")
    public void verifyThatRegistrationIsNotAllowed() {

        Assert.assertTrue(guestUserPage.requiredMessage.isDisplayed());

    }

    @And("verify that registration button is still displayed")
    public void verifyThatRegistrationButtonIsStillDisplayed() {
        Assert.assertTrue(managementonSchoolHomePage.registerButton.isDisplayed());
    }


    @And("verify that password is empty")
    public void verifyThatPasswordIsEmpty() {
        Assert.assertTrue(guestUserPage.passwordRequiredWarning.isDisplayed());
    }

    @And("verify password need lowercase")
    public void verifyPasswordNeedLowercase() {
        Assert.assertTrue(guestUserPage.passwordLowerCaseWarning.isDisplayed());
    }

    @And("verify password need uppercase")
    public void verifyPasswordNeedUppercase() {
        Assert.assertTrue(guestUserPage.passwordUpperCaseWarning.isDisplayed());
    }

    @And("verify password need digit")
    public void verifyPasswordNeedDigit() {
        Assert.assertTrue(guestUserPage.passwordOneNumberWarning.isDisplayed());
    }


    @And("verify password is shorter than {int} characters")
    public void verifyPasswordIsShorterThanCharacters(int passwordLong) {
        Assert.assertTrue(guestUserPage.passwordLongWarning.isDisplayed());

    }
}