package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.*;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.JSUtils;
import utilities.WaitUtils;

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
        WaitUtils.waitFor(3);

    }
    @Given("select teacher management link")
    public void select_teacher_management_link() {

        JSUtils.clickWithTimeoutByJS(adminManagementPage.teacherManagementLink);

    }
    @Given("Select a course")
    public void select_a_course() {



    }


    @And("Select a course {string}")
    public void selectACourse(String arg0) {

        JSUtils.setValueByJS(teacherManagementPage.chooseLessonSection, arg0);

    }

    @And("enter a name {string}")
    public void enterAName(String arg0) {

        JSUtils.setValueByJS(teacherManagementPage.nameField, arg0);
    }


    @And("enter surname {string}")
    public void enterSurname(String arg0) {

        JSUtils.setValueByJS(teacherManagementPage.surnameField, arg0);

    }

    @And("enter Birthplace {string}")
    public void enterBirthplace(String arg0) {
        JSUtils.setValueByJS(teacherManagementPage.birthPlace, arg0);
    }


    @And("enter an email {string}")
    public void enterAnEmail(String arg0) {
        JSUtils.setValueByJS(teacherManagementPage.email, arg0);
    }


    @And("select gender {string}")
    public void selectGender(String arg0) {
        if (arg0.equalsIgnoreCase("male")){
            BrowserUtils.clickWithTimeOut(teacherManagementPage.genderFemale,2);
        } else if (arg0.equalsIgnoreCase("female")) {
            BrowserUtils.clickWithTimeOut(teacherManagementPage.genderMale,2);
        }

    }

    @And("enter birthdate {string}")
    public void enterBirthdate(String arg0) {

        JSUtils.setValueByJS(teacherManagementPage.birthDay,arg0);

    }

    @And("add a phone number {string}")
    public void addAPhoneNumber(String arg0) {

        JSUtils.setValueByJS(teacherManagementPage.phoneNumber, arg0);

    }

    @And("enter SSN number {string}")
    public void enterSSNNumber(String arg0) {
        JSUtils.setValueByJS(teacherManagementPage.ssn, arg0);
    }

    @And("enter username {string} for teacher")
    public void enterUsernameForTeacher(String arg0) {
        JSUtils.setValueByJS(teacherManagementPage.username, arg0);
    }

    @And("enter {string} with true credentials")
    public void enterWithTrueCredentials(String arg0) {

        JSUtils.setValueByJS(teacherManagementPage.password, arg0);


    }

    @And("click on teacher Submit button")
    public void clickOnTeacherSubmitButton() {
        JSUtils.clickWithTimeoutByJS(teacherManagementPage.submitButton);
    }

    @Then("verify teacher is created")
    public void verifyTeacherIsCreated() {
        BrowserUtils.verifyElementDisplayed(teacherManagementPage.successNotification);
    }
}
