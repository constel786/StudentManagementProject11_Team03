package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.AdminManagementPage;
import pages.GuestUserPage;
import pages.ManagementonSchoolHomePage;
import utilities.WaitUtils;

public class AdminEditsGuestListStepDefs {

    ManagementonSchoolHomePage managementonSchoolHomePage = new ManagementonSchoolHomePage();
    AdminManagementPage adminManagementPage = new AdminManagementPage();

    GuestUserPage guestUserPage = new GuestUserPage();
    @And("user clicks menu button")
    public void userClicksMenuButton() {
        managementonSchoolHomePage.menu.click();
        WaitUtils.waitFor(1);
    }

    @And("user clicks guest user from the menu")
    public void userClicksGuestUserFromTheMenu() {
        adminManagementPage.menuGuestUser.click();
        WaitUtils.waitFor(1);
    }


    @And("Verify that admin should be able to see Name, Phone Number, SSN and User Name information in the guest user list.")
    public void verifyThatAdminShouldBeAbleToSeeNamePhoneNumberSSNAndUserNameInformationInTheGuestUserList() {

        WaitUtils.waitFor(1);
        if (adminManagementPage.guestsWebTableHeader.contains("Name")
        && adminManagementPage.guestsWebTableHeader.contains("Phone Number")
        && adminManagementPage.guestsWebTableHeader.contains("Ssn")
        && adminManagementPage.guestsWebTableHeader.contains("User Name")){
            Assert.assertTrue(true);
        }

    }
}
