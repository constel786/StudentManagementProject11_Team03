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
    @FindBy(linkText = "/login")
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;

// ----------------REGISTER-------------------
    @FindBy(linkText = "/register")
    public WebElement register;

    @FindBy(linkText = "//input[@id='name']")
    public WebElement name;

    @FindBy(linkText = "//input[@id='name']")
    public WebElement surname;
}
