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
    @FindBy(xpath="//a[.='Teacher Management']")
    public static WebElement teacherManagement;
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

}