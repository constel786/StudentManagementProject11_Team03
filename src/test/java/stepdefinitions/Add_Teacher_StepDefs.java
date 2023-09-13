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


}
