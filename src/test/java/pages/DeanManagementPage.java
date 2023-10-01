package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DeanManagementPage {


    public DeanManagementPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/header/div[1]/div/div/div[2]/a[2]")
    public WebElement login;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='fw-semibold btn btn-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//button[normalize-space()='Menu']")
    public WebElement menu;

    @FindBy(xpath = "//a[normalize-space()='Contact Get All']")
    public WebElement contactGetAll;

    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement nameContact;

    @FindBy(xpath = "//tbody/tr[1]/td[2]")
    public WebElement emailContact;

    @FindBy(xpath = "//tbody/tr[1]/td[3]")
    public WebElement dateContact;

    @FindBy(xpath = "//tbody/tr[1]/td[4]")
    public WebElement subjectContact;

    @FindBy(xpath = "//tbody/tr[1]/td[5]")
    public WebElement messageContact;

}