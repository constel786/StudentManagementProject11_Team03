package features.US_13.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ContactGetAllPage {
    public ContactGetAllPage(){
            PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "//th[contains(text(),'Name')]")
    public WebElement nameSection;

    @FindBy(xpath = "//th[contains(text(),'Email')]")
    public WebElement emailSection;

    @FindBy(xpath = "//th[contains(text(),'Date')]")
    public WebElement dateSection;

    @FindBy(xpath = "//th[contains(text(),'Subject')]")
    public WebElement subjectSection;
}
