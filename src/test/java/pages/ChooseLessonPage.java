package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChooseLessonPage {

    public ChooseLessonPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[.='Submit']/button")
    public WebElement submitButton;



    @FindBy (xpath = "//*[.='Grades and Announcements']")
    public WebElement gradesAndAnnouncementsLink;

    @FindBy (xpath = "//*[.='Full authentication is required to access this resource']")
    public WebElement warningAlert;

    @FindBy(xpath = "//*[.='Lesson added to Student']")
    public WebElement confirmationAlert;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div/div/div/div[1]/table/thead/tr/th[3]")
    public WebElement teacherConf;


    @FindBy(xpath = "//*[.='Choose Lesson Management']")
    public WebElement chooseLessonTitle;

    @FindBy(xpath = "//*[.='Error: Course schedule cannot be selected for the same hour and day']")
    public WebElement simulatenousLessonsError;



}
