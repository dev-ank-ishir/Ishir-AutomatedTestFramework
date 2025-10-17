package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.StaffingPage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StaffingPageSteps {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();
    StaffingPage staffingPage = homePage.staffingPageFromHomePage();


    @Given("the user is on the Staffing page")
    public void theUserIsOnTheStaffingPage() {

    }

    @And("click Staffing Menu option")
    public void clickStaffingMenuOption() {

        staffingPage.selectStaffingMenu();
    }

    @Then("Staffing page should appear")
    public void staffingPageShouldAppear() {

        Assert.assertEquals(staffingPage.doGetCurrentPageURL(),"https://www.ishir.com/staffing-and-augmentation.htm");
    }

    @When("the user clicks main Get Started button")
    public void theUserClicksMainGetStartedButton() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        staffingPage.selectStaffingMenu();
        staffingPage.clickGetStartedMain();

    }

    @When("the user clicks bottom Get Started button")
    public void theUserClicksBottomGetStartedButton() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        staffingPage.selectStaffingMenu();
        staffingPage.clickGetStartedBottom();
    }
}
