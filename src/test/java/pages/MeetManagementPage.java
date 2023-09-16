package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MeetManagementPage {
    public MeetManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
//LOGIN

    @FindBy(xpath = "//i[@class='fa fa-lock']")//    classs olarak almayın  birde bu exceptin veren
    public WebElement login;

   @FindBy(xpath ="(//a[@role='button'])[12]")
   public WebElement logout;


    @FindBy(xpath = "//button[.= 'Menu']")
    public WebElement Menu;

    @FindBy(xpath = "//a[.='Meet Management']")
    public WebElement MeetManagement;

    @FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement studentClick;

    @FindBy(xpath = "//input[@id='react-select-2-input']")
    public WebElement student;

    @FindBy(id = "date")
    public WebElement date;


    @FindBy(xpath = "//input[@id='startTime']")
    public WebElement selectStartTime;
    @FindBy(xpath = "//input[@id='stopTime']")
    public WebElement selectStopTime;
    @FindBy(xpath = "//input[@placeholder='Description']")
    public WebElement Description;
    @FindBy(xpath = "//button[.='Submit']")
    public WebElement Submit;


    @FindBy(xpath = "(//div[.='Error: Meet schedule cannot be selected for the same hour and day'])[5]")
    public WebElement errorMessage;

   @FindBy(xpath = "//div[@class='invalid-feedback']")
    public WebElement required;
   @FindBy(xpath = "//div[@class= ' css-19bb58m']")
    public WebElement selectStudent;

   @FindBy(xpath = "(//*[.='Meet Saved Successfully']/div/div/div/div)[2]")
    public WebElement verify;
//@FindBy(xpath = "//div[@class='Toastify-toast-body']")
 //   public WebElement error2;

    @FindBy(xpath = "(//*[.='must be a future date']/div/div/div/div)[2]" )
    public WebElement alert;

@FindBy(xpath = "(//*[.='Error: Meet schedule cannot be selected for the same hour and day'])[5]")
    public WebElement meetSchedule;


}
