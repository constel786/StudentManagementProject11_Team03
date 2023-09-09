package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.Add_Admin_Page;
import utilities.BrowserUtils;
import utilities.Driver;

public class Add_Admin_StepDef {
    Add_Admin_Page addAdminPage = new Add_Admin_Page();
    @Given("user login")
    public void user_login() throws InterruptedException {
        Driver.getDriver().get("https://managementonschools.com");
        Thread.sleep(2000);
        addAdminPage.LOGIN_BUTTON_1.click();
        addAdminPage.LOGIN_USERNAME.sendKeys("YaseminTest");
        addAdminPage.LOGIN_PASSWORD.sendKeys("YaseminTest1");
        addAdminPage.LOGIN_BUTTON_2.click();


    }
    @When("Enter {string} in the name field")
    public void enter_in_the_name_field(String name) {
        addAdminPage.ADMIN_NAME.sendKeys(name);

    }
    @When("Enter {string} in the surname field")
    public void enter_in_the_surname_field(String surname) {
        addAdminPage.ADMIN_SURNAME.sendKeys(surname);
    }
    @When("Enter {string} in the Birth Place field")
    public void enter_in_the_birth_place_field(String birthPlace) {
        addAdminPage.ADMIN_BIRTHPLACE.sendKeys(birthPlace);
    }
    @When("Select the {string}")
    public void select_the(String string) {
        addAdminPage.ADMIN_GENDER.click();

    }
    @When("Enter {string} in the Date of Bird field")
    public void enter_in_the_date_of_bird_field(String birthDay) {
        addAdminPage.ADMIN_BIRTHDAY.sendKeys(birthDay);
    }
    @When("Enter phone number {string}")
    public void enter(String phoneNumber) {
        addAdminPage.ADMIN_PHONENUMBER.sendKeys(phoneNumber);
    }
    @And("Enter ssn number {string} must contain a short line after the third and fifth digits and must consist of nine digits in total in the Ssn field")
    public void enterSsnNumberMustContainAShortLineAfterTheThirdAndFifthDigitsAndMustConsistOfNineDigitsInTotalInTheSsnField(String ssnNumber) {
        addAdminPage.ADMIN_SSNNUMBER.sendKeys(ssnNumber);
    }

    @When("Enter {string} in the username field")
    public void enter_in_the_username_field(String username) {
        addAdminPage.ADMIN_USERNAME.sendKeys(username);
    }
    @And("Enter {string} in the password field")
    public void enterInThePasswordField(String password) {
        addAdminPage.ADMIN_PASSWORD.sendKeys(password);
    }
    @When("Click the SUBMIT button")
    public void click_the_submıt_button() {
        addAdminPage.SUBMIT_BUTTON.click();
    }
    @Then("Verify that user received required notification under the name field")
    public void verify_that_user_received_required_notification_under_the_name_field() {
        Assert.assertEquals(addAdminPage.NAME_INVALID_FEEDBACK.getText(), "Required");
    }


    @Then("Verify that user received required notification under the surname field")
    public void verifyThatUserReceivedRequiredNotificationUnderTheSurnameField() {
        Assert.assertEquals(addAdminPage.SURNAME_INVALID_FEEDBACK.getText(), "Required");
    }

    @Then("Verify that user received required notification under the Birth Place field")
    public void verifyThatUserReceivedRequiredNotificationUnderTheBirthPlaceField() {
        Assert.assertEquals(addAdminPage.BIRTHPLACE_INVALID_FEEDBACK.getText(), "Required");
    }

    @Then("Verify that user received required notification under the Date of Birth field")
    public void verifyThatUserReceivedRequiredNotificationUnderTheDateOfBirthField() {
        Assert.assertEquals(addAdminPage.BIRTHDAY_INVALID_FEEDBACK.getText(), "Required");
    }

    @Then("Verify that user received required notification under the Phone Number field")
    public void verifyThatUserReceivedRequiredNotificationUnderThePhoneNumberField() {
        Assert.assertEquals(addAdminPage.PHONENUMBER_INVALID_FEEDBACK.getText(), "Required");
    }

    @Then("Verify that user received required notification under the Ssn field")
    public void verifyThatUserReceivedRequiredNotificationUnderTheSsnField() {
        Assert.assertEquals(addAdminPage.SSN_INVALID_FEEDBACK.getText(), "Required");
    }

    @Then("Verify that user received required notification under the username field")
    public void verifyThatUserReceivedRequiredNotificationUnderTheUsernameField() {
        Assert.assertEquals(addAdminPage.USERNAME_INVALID_FEEDBACK.getText(), "Required");
    }

    @Then("Verify that user received required notification under the password field")
    public void verifyThatUserReceivedRequiredNotificationUnderThePasswordField() {
        Assert.assertEquals(addAdminPage.PASSWORD_INVALID_FEEDBACK.getText(), "Enter your password");
    }

    @Then("Verify that user received LOWERCASE required notification under the Password field")
    public void verifyThatUserReceivedLOWERCASERequiredNotificationUnderThePasswordField() {
        Assert.assertEquals(addAdminPage.PASSWORD_INVALID_FEEDBACK.getText(), "One lowercase character");
    }

    @Then("Verify that user received UPPERCASE required notification under the Password field")
    public void verifyThatUserReceivedUPPERCASERequiredNotificationUnderThePasswordField() {
        Assert.assertEquals(addAdminPage.PASSWORD_INVALID_FEEDBACK.getText(), "One uppercase character");
    }

    @Then("Verify that user received NUMBER required notification under the Password field")
    public void verifyThatUserReceivedNUMBERRequiredNotificationUnderThePasswordField() {
        Assert.assertEquals(addAdminPage.PASSWORD_INVALID_FEEDBACK.getText(), "One number");
    }

    @Then("Verify that user received saved notification pop up")
    public void verifyThatUserReceivedSavedNotificationPopUp() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(addAdminPage.SAVED_FEEDBACK.isDisplayed());
    }

    @Then("Verify that user received invalid notification pop up")
    public void verifyThatUserReceivedInvalidNotificationPopUp() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(addAdminPage.SSN_INVALID_NOTIFICATION.isDisplayed());
    }
}
