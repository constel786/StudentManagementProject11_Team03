package pages;

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

    @FindBy(xpath = "(//input[@id='midtermExam'])[2]")
    public WebElement midtermExamEdit;

    @FindBy(xpath = "(//input[@id='finalExam'])[2]")
    public WebElement finalExamEdit;

    @FindBy(xpath = "(//button[.='Submit'])[2]")
    public WebElement submitButtonEdit;
}
