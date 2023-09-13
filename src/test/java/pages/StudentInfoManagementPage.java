package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentInfoManagementPage {

    public StudentInfoManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy(xpath = "//button[.='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//a[.='Student Info Management']")
    public WebElement studentInfoManagement;

    @FindBy(id = "lessonId")
    public WebElement chooseLesson;

    @FindBy(xpath = "//select//option[.='Selenium']")
    public WebElement selenium;

    @FindBy(id = "studentId")
    public WebElement chooseStudent;

    @FindBy(id = "educationTermId")
    public WebElement chooseEducationTerm;

    @FindBy(xpath = "//input[@id='absentee']")
    public WebElement absentee;

    @FindBy(xpath = "//input[@id='midtermExam']")
    public WebElement midtermExam;

    @FindBy(xpath = "//input[@id='finalExam']")
    public WebElement finalExam;

    @FindBy(xpath = "//input[@id='infoNote']")
    public WebElement infoNote;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@info='Student Info saved Successfully']")
    public WebElement successMessage;

    @FindBy(xpath = "//tbody/tr/td[1]")
    public WebElement nameField;

    @FindBy(xpath = "//tbody/tr/td[2]")
    public WebElement lessonNameField;

    @FindBy(xpath = "//tbody/tr/td[3]")
    public WebElement absenteeField;

    @FindBy(xpath = "//tbody/tr/td[4]")
    public WebElement midtermExamField;

    @FindBy(xpath = "//tbody/tr/td[5]")
    public WebElement finalExamField;

    @FindBy(xpath = "//tbody/tr/td[6]")
    public WebElement noteField;

    @FindBy(xpath = "//tbody/tr/td[7]")
    public WebElement infoNoteField;

    @FindBy(xpath = "//tbody/tr/td[8]")
    public WebElement averageField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[9]/span/button/text()")
    public WebElement editButton1;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[2]/td[9]/span/button/text()")
    public WebElement editButton2;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[9]/span/button/text()")
    public WebElement editButton3;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[4]/td[9]/span/button/text()")
    public WebElement editButton4;

    @FindBy(xpath = "(//button//i[@class='fa-solid fa-trash'])[1]")
    public WebElement deleteButton1;

    @FindBy(xpath = "(//button//i[@class='fa-solid fa-trash'])[2]")
    public WebElement deleteButton2;

    @FindBy(xpath = "(//button//i[@class='fa-solid fa-trash'])[3]")
    public WebElement deleteButton3;

    @FindBy(xpath = "(//button//i[@class='fa-solid fa-trash'])[4]")
    public WebElement deleteButton4;









}
