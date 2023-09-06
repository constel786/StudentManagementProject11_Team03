package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Add_Admin_Page {
        public Add_Admin_Page(){
            PageFactory.initElements(Driver.getDriver(),this);

        }
        @FindBy(xpath = "//*[@class='header_link ms-2']")
        public WebElement LOGIN_BUTTON_1;

        @FindBy(id = "username" )
        public WebElement LOGIN_USERNAME;
        @FindBy(id = "password" )
        public WebElement LOGIN_PASSWORD;

        @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary']")
        public WebElement LOGIN_BUTTON_2;

        @FindBy(id = "name")
        public WebElement ADMIN_NAME;

        @FindBy(id = "surname")
        public WebElement ADMIN_SURNAME;

        @FindBy(id = "birthPlace")
        public WebElement ADMIN_BIRTHPLACE;

        @FindBy(xpath = "//input[@value='FEMALE']")
        public WebElement ADMIN_GENDER;

        @FindBy(id = "birthDay")
        public WebElement ADMIN_BIRTHDAY;

        @FindBy(id = "phoneNumber")
        public WebElement ADMIN_PHONENUMBER;

        @FindBy(id = "ssn")
        public WebElement ADMIN_SSNNUMBER;

        @FindBy(id = "username")
        public WebElement ADMIN_USERNAME;

        @FindBy(id = "password")
        public WebElement ADMIN_PASSWORD;

        @FindBy(xpath = "//*[@class='fw-semibold btn btn-primary btn-lg']")
        public WebElement SUBMIT_BUTTON;

        @FindBy(xpath = "//input[@placeholder='Name']/following-sibling::div")
        public WebElement NAME_INVALID_FEEDBACK;
        @FindBy(xpath = "//input[@placeholder='Surname']/following-sibling::div")
        public WebElement SURNAME_INVALID_FEEDBACK;

        @FindBy(xpath = "//input[@placeholder='Birth Place']/following-sibling::div")
        public WebElement BIRTHPLACE_INVALID_FEEDBACK;

        @FindBy(xpath = "//input[@type='date']/following-sibling::div")
        public WebElement BIRTHDAY_INVALID_FEEDBACK;

        @FindBy(xpath = "//input[@placeholder='Phone Number']/following-sibling::div")
        public WebElement PHONENUMBER_INVALID_FEEDBACK;

        @FindBy(xpath = "//input[@placeholder='ssn']/following-sibling::div")
        public WebElement SSN_INVALID_FEEDBACK;

        @FindBy(xpath = "//input[@placeholder='username']/following-sibling::div")
        public WebElement USERNAME_INVALID_FEEDBACK;

        @FindBy(xpath = "//input[@placeholder='Password']/following-sibling::div")
        public WebElement PASSWORD_INVALID_FEEDBACK;

}
