package features.US_13.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GuestUserPage {
    public GuestUserPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//a[@class='page-link']/span[.='»']")
    public WebElement goLastPageButton;

    @FindBy(xpath = "//ul/li/span/text()")
    public WebElement totalPageNumber;

    @FindBy(xpath = "//a[@class='page-link']/span[.='‹']")
    public WebElement goBackPageButton;

    @FindBy(xpath = "//a[@class='page-link']/span[.='›']")
    public WebElement goNextPageButton;

    @FindBy(xpath = "//div[.='Required']")
    public WebElement requiredMessage;

    @FindBy(xpath = "//div[.='One lowercase character']")
    public WebElement passwordLowerCaseWarning;

    @FindBy(xpath = "//div[.='One uppercase character']")
    public WebElement passwordUpperCaseWarning;

    @FindBy(xpath = "//div[.='One number']")
    public WebElement passwordOneNumberWarning;

    @FindBy(xpath = "//div[.='At least 8 characters']")
    public WebElement passwordLongWarning;

    @FindBy(xpath = "//div[.='Enter your password']")
    public WebElement passwordRequiredWarning;

}
