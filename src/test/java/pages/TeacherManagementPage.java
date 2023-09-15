package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeacherManagementPage {
    public TeacherManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButtonclick;
    @FindBy(linkText = "Teacher Management")
    public WebElement teacherManagement;

    @FindBy(xpath = "//*[@class='css-8mmkcg']")
    public WebElement chooselessonbutton;

    @FindBy(id="name")
    public WebElement teachername;

    @FindBy(id="surname")
    public WebElement teachersurname;

    @FindBy(id="birthPlace")
    public WebElement teacherbirthPlace;

    @FindBy(id="email")
    public WebElement teacheremail;

    @FindBy(id="phoneNumber")
    public WebElement teacherphoneNumber;

    @FindBy(id="isAdvisorTeacher")
    public WebElement isAdvisorTeacher;

    @FindBy(xpath = "//input[@name='gender']")
    public WebElement genderFemale;

    @FindBy(xpath = "//input[@value='MALE']")
    public WebElement genderMale;

    @FindBy(id="birthDay")
    public WebElement teacherbirthDay;

    @FindBy(id="ssn")
    public WebElement teacherssnNumber;

    @FindBy(id="username")
    public WebElement teacherusername;

    @FindBy(id="password")
    public WebElement passwordTeacher;

    @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
    public WebElement submitTeacher;
}
