package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentManagementPage {
    public StudentManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButtonclick;
    @FindBy(linkText = "Student Management")
    public WebElement studentManagement;

    @FindBy(xpath = "//*[@class='form-select']")
    public WebElement isAdvisorTeacher;

    @FindBy(id="name")
    public WebElement studentname;

    @FindBy(id="surname")
    public WebElement studentsurname;

    @FindBy(id="birthPlace")
    public WebElement studentbirthPlace;

    @FindBy(id="email")
    public WebElement studentemail;

    @FindBy(id="phoneNumber")
    public WebElement studentphoneNumber;

    @FindBy(xpath = "//*[@name='gender']")
    public WebElement studentFemale;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement studentMale;

    @FindBy(id="birthDay")
    public WebElement studentbirthDay;

    @FindBy(id="ssn")
    public WebElement studentssnNumber;

    @FindBy(id="username")
    public WebElement studentusername;

    @FindBy(id="fatherName")
    public WebElement studentfatherName;

    @FindBy(id="motherName")
    public WebElement studentmotherName;

    @FindBy(id="password")
    public WebElement studentPassword;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement studentSubmit;
}
