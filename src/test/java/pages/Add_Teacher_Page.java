package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class Add_Teacher_Page {
    public Add_Teacher_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='header_link ms-2']")
    public static WebElement LOGIN_BUTTON_1;
    @FindBy(id = "username" )
    public static WebElement LOGIN_USERNAME;
    @FindBy(id = "password" )
    public static WebElement LOGIN_PASSWORD;
    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public static WebElement LOGIN_BUTTON_2;
    @FindBy(xpath="//button[.='Menu']")
    public static WebElement menuButton;

    @FindBy(id = "react-select-22-live-region")
    public WebElement chooseLessons;
    @FindBy(id = "react-select-22-option-0")
    public static WebElement english;
    @FindBy(id = "name")
    public WebElement name;
    @FindBy(id = "surname")
    public WebElement surname;
    @FindBy(id = "birthPlace")
    public WebElement birthPlace;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "phoneNumber")
    public WebElement phoneNumber;
    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMale;
    @FindBy(id = "birthDay")
    public WebElement birthDay;
    @FindBy(id = "ssn")
    public WebElement ssn;
    @FindBy(id = "username")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//input[@placeholder='Name']/following-sibling::div")
    public WebElement NAME_INVALID_FEEDBACK;
    @FindBy(xpath = "//input[@placeholder='Surname']/following-sibling::div")
    public WebElement SURNAME_INVALID_FEEDBACK;
    @FindBy(xpath = "//input[@placeholder='Birth Place']/following-sibling::div")
    public WebElement BIRTHPLACE_INVALID_FEEDBACK;
    @FindBy(xpath = "//input[@type='date']/following-sibling::div")
    public WebElement BIRTHDAY_INVALID_FEEDBACK;
    @FindBy(xpath = "//input[@placeholder='Phone Number']/following-sibling::div")
    public WebElement PHONENUMBER_INVALID_FEEDBACK;
    @FindBy(xpath = "//input[@placeholder='ssn']/following-sibling::div")
    public WebElement SSN_INVALID_FEEDBACK;
    @FindBy(xpath = "//input[@placeholder='username']/following-sibling::div")
    public WebElement USERNAME_INVALID_FEEDBACK;
    @FindBy(xpath = "//input[@placeholder='Password']/following-sibling::div")
    public WebElement PASSWORD_INVALID_FEEDBACK;
    @FindBy(xpath = "//*[text()='Admin Saved']")
    public WebElement SAVED_FEEDBACK;
    @FindBy(xpath = "//*[text()='Please enter valid SSN number']")
    public WebElement SSN_INVALID_NOTIFICATION;
}