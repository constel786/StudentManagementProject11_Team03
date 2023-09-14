package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.Add_Admin_Page;
import pages.Add_Teacher_Page;
import pages.ManagementonSchoolHomePage;
import utilities.BrowserUtils;
import utilities.Driver;
public class Add_Teacher_StepDefs {
    Add_Teacher_Page addTeacherPage = new Add_Teacher_Page();

    @Given("vice dean login")
    public void vice_dean_login() throws InterruptedException {
        Driver.getDriver().get("https://managementonschools.com");
        Thread.sleep(2000);
        Add_Admin_Page.LOGIN_BUTTON_1.click();
        Add_Admin_Page.LOGIN_USERNAME.sendKeys("VDProject11");
        Add_Admin_Page.LOGIN_PASSWORD.sendKeys("Nowayjose1234");
        Add_Admin_Page.LOGIN_BUTTON_2.click();
        Add_Teacher_Page.menuButton.click();
    }
    @When("Click the dropdown button")
        public void click_the_dropdown_button(){
        addTeacherPage.chooseLessons.click();
    }
    @And("Select the lesson {String}")
    public void select_the_lesson(String english){
        addTeacherPage.english.click();
    }
    @When("Enter {string} in the name field")
    public void enter_in_the_name(String name) {
        addTeacherPage.name.sendKeys(name);
    }
    @And("Enter {string} in the surname field")
    public void enter_in_the_surname(String surname) {
        addTeacherPage.name.sendKeys(surname);
    }
    @When("Enter {string} in the Birth Place field")
    public void enter_in_the_birth_place(String birthPlace) {
        addTeacherPage.birthPlace.sendKeys(birthPlace);
    }
    @When("Enter {string} in the Email field")
    public void enter_in_the_email(String email){
        addTeacherPage.email.sendKeys(email);
    }
    @When("Enter {string} in the Phone field")
    public void enter_in_the_phone(String phoneNumber){
        addTeacherPage.phoneNumber.sendKeys(phoneNumber);
    }
    @When("Select the gender")
    public void select_the_gender(){
        addTeacherPage.genderMale.click();
    }
    @When("Enter {string} in the Date of Birth field")
    public void enter_in_the_date_of_birth(String birthDay){
        addTeacherPage.birthDay.sendKeys(birthDay);
    }
    @When("Enter {string} in the SSN field")
    public void enter_in_the_SSN(String ssn){
        addTeacherPage.ssn.sendKeys();
    }
    @When("Enter {string} in the username field")
    public void enter_in_the_username(String username){
        addTeacherPage.username.sendKeys(username);
    }
    @When("Enter {string} in the password field")
    public void enter_in_the_password(String password){
        addTeacherPage.password.sendKeys(password);
    }
    @When("Click the Submit button")
    public void click_the_submit_button(){
        addTeacherPage.submitButton.click();
    }

    @Then("Verify that user received required notification under the name field")
    public void verify_that_user_received_required_notification_under_the_name_field() {
        Assert.assertEquals(addTeacherPage.NAME_INVALID_FEEDBACK.getText(), "Required");
    }
    @Then("Verify that user received required notification under the surname field")
    public void verifyThatUserReceivedRequiredNotificationUnderTheSurnameField() {
        Assert.assertEquals(addTeacherPage.SURNAME_INVALID_FEEDBACK.getText(), "Required");
    }
    @Then("Verify that user received required notification under the Birth Place field")
    public void verifyThatUserReceivedRequiredNotificationUnderTheBirthPlaceField() {
        Assert.assertEquals(addTeacherPage.BIRTHPLACE_INVALID_FEEDBACK.getText(), "Required");
    }
    @Then("Verify that user received required notification under the Date of Birth field")
    public void verifyThatUserReceivedRequiredNotificationUnderTheDateOfBirthField() {
        Assert.assertEquals(addTeacherPage.BIRTHDAY_INVALID_FEEDBACK.getText(), "Required");
    }
    @Then("Verify that user received required notification under the Phone Number field")
    public void verifyThatUserReceivedRequiredNotificationUnderThePhoneNumberField() {
        Assert.assertEquals(addTeacherPage.PHONENUMBER_INVALID_FEEDBACK.getText(), "Required");
    }
    @Then("Verify that user received required notification under the Ssn field")
    public void verifyThatUserReceivedRequiredNotificationUnderTheSsnField() {
        Assert.assertEquals(addTeacherPage.SSN_INVALID_FEEDBACK.getText(), "Required");
    }
    @Then("Verify that user received required notification under the username field")
    public void verifyThatUserReceivedRequiredNotificationUnderTheUsernameField() {
        Assert.assertEquals(addTeacherPage.USERNAME_INVALID_FEEDBACK.getText(), "Required");
    }
    @Then("Verify that user received required notification under the password field")
    public void verifyThatUserReceivedRequiredNotificationUnderThePasswordField() {
        Assert.assertEquals(addTeacherPage.PASSWORD_INVALID_FEEDBACK.getText(), "Enter your password");
    }
    @Then("Verify that user received LOWERCASE required notification under the Password field")
    public void verifyThatUserReceivedLOWERCASERequiredNotificationUnderThePasswordField() {
        Assert.assertEquals(addTeacherPage.PASSWORD_INVALID_FEEDBACK.getText(), "One lowercase character");
    }
    @Then("Verify that user received UPPERCASE required notification under the Password field")
    public void verifyThatUserReceivedUPPERCASERequiredNotificationUnderThePasswordField() {
        Assert.assertEquals(addTeacherPage.PASSWORD_INVALID_FEEDBACK.getText(), "One uppercase character");
    }
    @Then("Verify that user received NUMBER required notification under the Password field")
    public void verifyThatUserReceivedNUMBERRequiredNotificationUnderThePasswordField() {
        Assert.assertEquals(addTeacherPage.PASSWORD_INVALID_FEEDBACK.getText(), "One number");
    }
    @Then("Verify that user received saved notification pop up")
    public void verifyThatUserReceivedSavedNotificationPopUp() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(addTeacherPage.SAVED_FEEDBACK.isDisplayed());
    }
    @Then("Verify that user received invalid notification pop up")
    public void verifyThatUserReceivedInvalidNotificationPopUp() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(addTeacherPage.SSN_INVALID_NOTIFICATION.isDisplayed());
    }
}
