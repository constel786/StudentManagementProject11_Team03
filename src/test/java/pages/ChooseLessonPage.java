package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChooseLessonPage {

    public void chooseLessonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[.='Submit']/button")
    public WebElement submitButton;

    @FindBy (xpath = "//*[.='Menu']")
    public WebElement menuButton;

    @FindBy (xpath = "//*[.='Grades and Announcements']")
    public WebElement gradesAndAnnouncementsLink;

    @FindBy (xpath = "//*[.='Full authentication is required to access this resource']")
    public WebElement warningAlert;

    @FindBy(xpath = "//*[.='Lesson added to Student']")
    public WebElement confirmationAlert;

}
