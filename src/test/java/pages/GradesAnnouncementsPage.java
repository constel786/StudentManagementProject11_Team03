package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GradesAnnouncementsPage {

    public void gradesAnnouncements(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[.='Student Info List']")
    public WebElement studentInfoList;

    @FindBy (xpath = "//*[.='Meet List']")
    public WebElement meetList;

}
