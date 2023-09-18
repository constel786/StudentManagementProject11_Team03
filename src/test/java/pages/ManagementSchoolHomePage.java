package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ManagementSchoolHomePage {

    public ManagementSchoolHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath= "//*[@class='header_link ms-2']")
    public WebElement loginButton1;

    @FindBy(id="username")
    public WebElement usernamelogin;

    @FindBy(id="password")
    public WebElement passwordlogin;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
    public WebElement loginclickbutton2;



}
