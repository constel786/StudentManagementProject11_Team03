package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagementPage {

    public TeacherManagementPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[id='react-select-2-input']")
    public WebElement chooseLessonSection;

    @FindBy(id = "name")
    public WebElement nameField;

    @FindBy(id = "controlled-tab-example-tab-advisorTeachersList")
    public WebElement advisorList;

    @FindBy(id = "controlled-tab-example-tab-teachersList")
    public WebElement teacherList;

    @FindBy(id = "surname")
    public WebElement surnameField;

    @FindBy(id = "birthPlace")
    public WebElement birthPlace;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;

    @FindBy(xpath = "(//input[@name='gender'])[1]")
    public WebElement genderFemale;

    @FindBy(xpath = "(//input[@name='gender'])[2]")
    public WebElement genderMale;
    @FindBy(id = "birthDay")
    public WebElement birthDay;

    @FindBy(id = "ssn")
    public WebElement ssn;

    @FindBy(id = "username")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//*[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "(//*[.='Teacher saved successfully']/div/div/div/div)[2]")
    public WebElement successNotification;

    @FindBy(xpath = "//*[.='Required']")
    public WebElement requiredAlert;

    @FindBy(xpath = "//*[.='Enter your password']")
    public WebElement enterPasswordAlert;

    @FindBy(xpath = "//*[.='Logout']")
    public WebElement logoutLink;

    @FindBy(xpath = "(//*[.='You have entered an invalid value. Valid values are: MALE, FEMALE']/div/div/div/div)[2]")
    public WebElement invalidValueNotification;




}
