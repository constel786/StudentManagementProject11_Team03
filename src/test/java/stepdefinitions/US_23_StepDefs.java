package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.*;

public class US_23_StepDefs {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    ChooseLessonPage chooseLessonPage = new ChooseLessonPage();
    GradesAnnouncementsPage gradesAnnouncementsPage = new GradesAnnouncementsPage();

    AdminManagementPage adminManagementPage = new AdminManagementPage();
    TeacherManagementPage teacherManagementPage=new TeacherManagementPage();

    @Given("navigate to {string}")
    public void navigate_to(String string) {

        Driver.getDriver().get(string);

    }

    @And("enter admin username {string}")
    public void enterAdminUsername(String arg0) {

        managementonSchoolHomePage.userNameLogin.sendKeys("Admin98");

    }

    @And("enter admin password {string}")
    public void enterAdminPassword(String arg0) {
        managementonSchoolHomePage.passwordLogin.sendKeys("Admin9898");
    }

    @Given("click menu button")
    public void click_menu_button() {
        JSUtils.clickWithTimeoutByJS(managementonSchoolHomePage.menuButton);


    }
    @Given("select teacher management link")
    public void select_teacher_management_link() {

        JSUtils.clickWithTimeoutByJS(adminManagementPage.teacherManagementLink);

    }


    @And("Select a course {string}")
    public void selectACourse(String arg0) {
        //JSUtils.clickWithTimeoutByJS(teacherManagementPage.chooseLessonSection);
        WaitUtils.waitFor(2);
        BrowserUtils.sendKeysWithTimeout(teacherManagementPage.chooseLessonSection,"Cypress"+Keys.ENTER,3);
    }

    @And("enter a name {string}")
    public void enterAName(String arg0) {

       BrowserUtils.sendKeysWithTimeout(teacherManagementPage.nameField,arg0,2);
    }


    @And("enter surname {string}")
    public void enterSurname(String arg0) {
        BrowserUtils.sendKeysWithTimeout(teacherManagementPage.surnameField, arg0,2);

    }

    @And("enter Birthplace {string}")
    public void enterBirthplace(String arg0) {
        BrowserUtils.sendKeysWithTimeout(teacherManagementPage.birthPlace, arg0,2);
    }


    @And("enter an email {string}")
    public void enterAnEmail(String arg0) {
        BrowserUtils.sendKeysWithTimeout(teacherManagementPage.email,arg0,2);
    }


    @And("select gender {string}")
    public void selectGender(String arg0) {

        BrowserUtils.clickWithTimeOut(teacherManagementPage.genderFemale,2);
       // if (arg0.equalsIgnoreCase("male")){

       // } else if (arg0.equalsIgnoreCase("female")) {
        //    BrowserUtils.clickWithTimeOut(teacherManagementPage.genderMale,2);
        //}

    }

    @And("enter birthdate {string}")
    public void enterBirthdate(String arg0) {

        BrowserUtils.sendKeysWithTimeout(teacherManagementPage.birthDay,arg0,2);

    }

    @And("add a phone number {string}")
    public void addAPhoneNumber(String arg0) {

        BrowserUtils.sendKeysWithTimeout(teacherManagementPage.phoneNumber,arg0,2);

    }

    @And("enter SSN number {string}")
    public void enterSSNNumber(String arg0) {
        BrowserUtils.sendKeysWithTimeout(teacherManagementPage.ssn,arg0,2);
    }

    @And("enter username {string} for teacher")
    public void enterUsernameForTeacher(String arg0) {
        BrowserUtils.sendKeysWithTimeout(teacherManagementPage.username,arg0,2);
    }

    @And("enter {string} with true credentials")
    public void enterWithTrueCredentials(String arg0) {
        BrowserUtils.sendKeysWithTimeout(teacherManagementPage.password,arg0,2);


    }

    @And("click on teacher Submit button")
    public void clickOnTeacherSubmitButton() {

        BrowserUtils.clickWithTimeOut(teacherManagementPage.submitButton,2);
        WaitUtils.waitFor(1);
    }

    @Then("verify teacher is created")
    public void verifyTeacherIsCreated() {

        BrowserUtils.verifyElementClickable(teacherManagementPage.successNotification);
    }

    @Then("verify teacher is not created")
    public void verifyTeacherIsNotCreated() {

        BrowserUtils.verifyElementDisplayed(teacherManagementPage.requiredAlert);

    }

    @Then("click logout button")
    public void clickLogoutButton() {

        BrowserUtils.clickWithTimeOut(teacherManagementPage.logoutLink,2);

    }

    @Then("verify invalid value notification")
    public void verifyInvalidValueNotification() {
        BrowserUtils.verifyElementDisplayed(teacherManagementPage.invalidValueNotification);
    }

    @Then("verify enter password alert")
    public void verifyEnterPasswordAlert() {

        BrowserUtils.verifyElementDisplayed(teacherManagementPage.enterPasswordAlert);

    }
}
