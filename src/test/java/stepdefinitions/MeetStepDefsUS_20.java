package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import utilities.JSUtils;
import utilities.WaitUtils;

public class MeetStepDefsUS_20 {
    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    MeetManagementPage meetManagementPage = new MeetManagementPage();
    @Given("user clicks on home page login button")
    public void user_clicks_on_home_page_login_button() {
        meetManagementPage.login.click();
        WaitUtils.waitFor(1);
    } @And("user clicks on the submit button")
    public void userClicksOnTheSubmitButton() {
        JSUtils.clickWithTimeoutByJS(meetManagementPage.Submit);

        meetManagementPage.date.sendKeys(day_of_meet);
        WaitUtils.waitFor(4);

        meetManagementPage.selectStartTime.click();
        meetManagementPage.selectStartTime.sendKeys(start_time);
        WaitUtils.waitFor(4);
        meetManagementPage.selectStopTime.click();
        meetManagementPage.selectStopTime.sendKeys(stop_time);
        WaitUtils.waitFor(4);

        @And("user clicks on the submit button")
        public void userClicksOnTheSubmitButton () {
            JSUtils.clickWithTimeoutByJS(meetManagementPage.Submit);

            WaitUtils.waitFor(2);


        }
    }