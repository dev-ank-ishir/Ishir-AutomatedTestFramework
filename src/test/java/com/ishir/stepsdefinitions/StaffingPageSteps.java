package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.StaffingPage;
import com.ishir.pages.services.mainMenu.StrategicAdvisoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StaffingPageSteps {


    HomePage homePage = new HomePage(DriverFactory.getDriver());
    StaffingPage staffingPage = new StaffingPage(DriverFactory.getDriver());

    StrategicAdvisoryPage strategicAdvisoryPage = new StrategicAdvisoryPage(DriverFactory.getDriver());

    @Given("the user is on the Staffing page")
    public void theUserIsOnTheStaffingPage() {

    }

    @And("click Staffing Menu option")
    public void clickStaffingMenuOption() {

        homePage.allowCookie();
        staffingPage.selectStaffingMenu();
    }

    @Then("Staffing page should appear")
    public void staffingPageShouldAppear() {
    }

    @When("the user clicks Get Started button")
    public void theUserClicksGetStartedButton() {
        homePage.allowCookie();
        strategicAdvisoryPage.selectServicesMenu();
        staffingPage.selectStaffingMenu();
        staffingPage.clickGetStarted();


    }
}
