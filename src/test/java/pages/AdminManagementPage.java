package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminManagementPage {

    public AdminManagementPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(linkText = "Guest User")
    public WebElement menuGuestUser;

    @FindBy(xpath = "//thead/tr/th")
    public List<WebElement> guestsWebTableHeader;
}
