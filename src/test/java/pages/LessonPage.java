package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LessonPage {


    public LessonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@id='compulsory']")
    public WebElement compulsoryCheckbox;

    @FindBy(xpath = "(//button[@id='controlled-tab-example-tab-lessonsList']")
    public WebElement lesson;

    @FindBy(xpath = "(//input[@id='creditScore']")
    public WebElement creditScore;

    @FindBy(xpath = "(//i[@class='fa-solid fa-trash'])[1]")
    public WebElement trashIcon;

    @FindBy(xpath = "(//tbody[1]/tr[1]/td[1])[2]")
    public WebElement firstLesson;

    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[2]")
    public WebElement lessonListTable;

    @FindBy(id = "controlled-tab-example-tab-lessonProgram")
    public WebElement lessonProgram;

    @FindBy(xpath = "//div[@class=' css-1xc3v61-indicatorContainer']")
    public WebElement selectLesson;

    @FindBy(xpath = "//input[@id='react-select-2-input']")
    public WebElement lessonType;

    @FindBy(id = "educationTermId")
    public WebElement educationTermDropdown;

    @FindBy(id = "day")
    public WebElement dayDropdown;

    @FindBy(id = "startTime")
    public WebElement startTime;

    @FindBy(id = "stopTime")
    public WebElement stopTime;

    @FindBy(xpath = "(//button[@class='fw-semibold btn btn-primary btn-lg'])[3]")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='Toastify__toast-container Toastify__toast-container--top-center']")
    public WebElement alert;

    @FindBy(xpath = "(//tbody[@class='table-group-divider'])[4]")
    public WebElement createdLessonList;

    @FindBy(xpath = "//input[@id='lessonName']")
    public WebElement lessonName;

    @FindBy(xpath = "//*[@id=\"root\"]/div/main/div/div[2]")
    public WebElement successMessage;

}

