package features.US_13.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class StudentManagement {
    public StudentManagement(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(linkText = "Contact Get All")
    public WebElement contactGetAll;

    //no delete button on the contact page
    public WebElement deleteButton;


    @FindBy(xpath = "//button[@class='fw-semibold text-white bg-primary navbar-toggler collapsed']")
    public WebElement menuButton;

    @FindBy(linkText = "Student Management")
    public WebElement studentManagementlink;

    @FindBy(xpath = "//*[@id=\"advisorTeacherId\"]")
    public WebElement advisorTeacher;

    @FindBy(id = "name")
    public WebElement studentName;

    @FindBy(id = "surname")
    public WebElement studentSurname;

    @FindBy(id = "birthPlace")
    public WebElement studentBirthPlace;

    @FindBy(id = "email")
    public WebElement studentEmail;

    @FindBy(id = "phoneNumber")
    public WebElement studentPhone;

    @FindBy(xpath = "//input[@name='gender' and @value='FEMALE']")
    public WebElement studentGenderFemale;

    @FindBy(xpath = "//input[@name='gender' and @value='MALE']")
    public WebElement studentGenderMale;

    @FindBy(xpath = "//*[@id=\"birthDay\"]")
    public WebElement studentDateOfBirth;

    @FindBy(id = "ssn")
    public WebElement studentSSN;

    @FindBy(id = "username")
    public WebElement studentUsername;


    @FindBy(id = "fatherName")
    public WebElement studentFatherName;

    @FindBy(id = "motherName")
    public WebElement studentMotherName;

    @FindBy(id = "password")
    public WebElement studentPassword;

    @FindBy(xpath = "//button[@class=\"fw-semibold btn btn-primary btn-lg\"]")
    public WebElement submitNewStudent;

    @FindBy(xpath = "//*[@id=\"21\"]/button")
    public WebElement errorMessageClose;

    @FindBy(xpath = "//*[@id=\"14\"]/div[1]/div[2]")
    public WebElement successMessage;










}


