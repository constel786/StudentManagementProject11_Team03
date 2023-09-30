package features.US_13.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class EditStudentInfoPage {

    public EditStudentInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//select[@id='lessonId'])[2]")
    public WebElement chooseLessonEdit;

    @FindBy(xpath = "(//select[@id='educationTermId'])[2]")
    public WebElement educationTermEdit;

    @FindBy(xpath = "//input[@value='3']")
    public WebElement absenteeEdit;

    @FindBy(xpath = "(//input[@id='absentee'])[2]")
    public WebElement absenteeEditJamesBond;

    @FindBy(xpath = "//div[.='Required']")
    public WebElement requiredMessage;

    @FindBy(xpath = "(//input[@id='midtermExam'])[2]")
    public WebElement midtermExamEdit;

    @FindBy(xpath = "(//input[@id='finalExam'])[2]")
    public WebElement finalExamEdit;

    @FindBy(xpath = "(//input[@id='infoNote'])[2]")
    public WebElement infoNoteEdit;

    @FindBy(xpath = "(//button[.='Submit'])[2]")
    public WebElement submitButtonEdit;

    @FindBy(xpath= "(//*[.='Please enter final exam  '])[5]")
    public WebElement finalExamMessage;

    @FindBy(xpath= "(//*[.='Please enter midterm exam'])[3]")
    public WebElement midtermExamMessage;




}
