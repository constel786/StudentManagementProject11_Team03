package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManagementonSchoolLoginPage {

    public ManagementonSchoolLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

// ----------------LOGIN-------------------
    @FindBy(linkText = "/login")
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameLogin;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordLogin;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;

// ----------------REGISTER-------------------
    @FindBy(linkText = "/register")
    public WebElement register;

    @FindBy(linkText = "//input[@id='name']")
    public WebElement name;

    @FindBy(linkText = "//input[@id='name']")
    public WebElement surname;

    @FindBy(linkText = "//input[@id='birthPlace']")
    public WebElement birthPlace;

    @FindBy(linkText = "//input[@id='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(linkText = "//input[@value='FEMALE']")
    public WebElement femaleRadioButton;

    @FindBy(linkText = "//input[@value='MALE']")
    public WebElement maleRadioButton;

    @FindBy(linkText = "//input[@id='birthDay']")
    public WebElement dateOfBirth;

    @FindBy(linkText = "//input[@id='ssn']")
    public WebElement ssn;

    @FindBy(linkText = "//input[@id='username']")
    public WebElement userNameRegister;

    @FindBy(linkText = "//input[@id='password']")
    public WebElement passwordRegister;
    @FindBy(linkText = "//button[.='Register']")
    public WebElement registerButton;

}
