package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManagementonSchoolHomePage {

    public ManagementonSchoolHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

// ----------------LOGIN-------------------
    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/div/div/div[2]/a[2]")
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameLogin;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordLogin;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;

// ----------------REGISTER-------------------
    @FindBy(xpath = "//a[@class='header_link me-2']")
    public WebElement register;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//input[@id='surname']")
    public WebElement surname;

    @FindBy(xpath = "//input[@id='birthPlace']")
    public WebElement birthPlace;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@value='FEMALE']")
    public WebElement femaleRadioButton;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement maleRadioButton;

    @FindBy(xpath = "//input[@id='birthDay']")
    public WebElement dateOfBirth;

    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameRegister;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordRegister;
    @FindBy(xpath = "//button[.='Register']")
    public WebElement registerButton;


    //------Menu Button------

    @FindBy (xpath = "(//button)[1]")
    public WebElement menuButton;

    @FindBy(xpath = "//*[.='Choose Lesson']")
    public WebElement chooseLessonLink;

    @FindBy(xpath = "//div[contains(text(),'Guest User registered')]")
    public WebElement guestUserRegistrationVerificationMessage;

    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menu;

}
