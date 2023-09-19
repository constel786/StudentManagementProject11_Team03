package pages;

import io.cucumber.java.zh_cn.假如;
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

    @FindBy(xpath = "(//*[.='Student Info saved Successfully'])[5]")
    public WebElement successMessage;

    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[3]/div/div/div[3]/div/div")
    public WebElement selectLessonErrorMessage;

    @FindBy(xpath = "/html/body/div/div/main/div/div[1]/div[3]/div/div/div[3]/div/div/div[1]/div[2]")
    public WebElement selectEducationTermErrorMessage;

    @FindBy(xpath = "/html/body/div[1]/div/main/div/div[1]/div[3]/div/div/div[3]/div/div/div[1]/div[2]")
    public WebElement successMessage1;

    @FindBy(xpath= "/html/body/div/div/main/div/div[1]/div[3]/div/div/div[3]/div/div/div[1]/div[2]")
    public WebElement errorMessage;

    @FindBy(xpath = "//h5[.='Student Info List']")
    public WebElement studentInfoList;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[1]/td[1]/span")
    public WebElement jamesBondNameField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[2]/td[1]/span")
    public WebElement malikaMorarField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[3]/td[1]/span")
    public WebElement jessiePinkmanField;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[1]/div[3]/div/div/div[1]/table/tbody/tr[4]/td[1]/span")
    public WebElement aliCanNameField;

    @FindBy(xpath = "(//td/span/button[@type='button'])[1]")
    public WebElement editButton1;

    @FindBy(xpath = "(//button[@type='button'])[12]")
    public WebElement editButton4;

    @FindBy(xpath = "(//button[@type='button'])[13]")
    public WebElement deleteButton4;

    @FindBy(xpath = "(//*[.='Student Info deleted Successfully'])[5]")
    public WebElement deleteSuccessMessage;

  //  @FindBy(xpath = "/html/body/div/div/main/div/div[2]/div/div/div[1]/div[2]")
 //   public WebElement deleteSuccessMessage;

    @FindBy(xpath = "//*[@fill='currentColor']")
    public WebElement deleteSuccessIcon;

    @FindBy(xpath = "//div[@class='Toastify__toast Toastify__toast-theme--colored Toastify__toast--success Toastify__toast--close-on-click']")
    public WebElement successIcon;











}
