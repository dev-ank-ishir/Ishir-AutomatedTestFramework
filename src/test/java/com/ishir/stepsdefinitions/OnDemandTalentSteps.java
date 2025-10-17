package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.StaffingPage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.OnDemandTalentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OnDemandTalentSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage AdvisoryServicesPage = homePage.advisoryServicesFromHomePage();
    StaffingPage staffingPage = homePage.staffingPageFromHomePage();
    OnDemandTalentPage onDemandTalentPage = homePage.OnDemandTalentPageFromHomePage();

    @When("the user hovers Staffing Menu")
    public void theUserHoversStaffingMenu() {

        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        staffingPage.hoverStaffingMenu();

    }

    @And("click On Demand Talent Menu")
    public void clickOnDemandTalentMenu() {
        onDemandTalentPage.clickOnDemandTalentMenu();
    }

    @Then("On Demand page should appear")
    public void onDemandPageShouldAppear() {
    }

    @Given("the user is on the On Demand Talent page")
    public void theUserIsOnTheOnDemandTalentPage() {

        Assert.assertEquals(onDemandTalentPage.doGetCurrentPageURL(),"https://www.ishir.com/on-demand-talent.htm");
    }


    @When("the user clicks Get Started button on demand page")
    public void theUserClicksGetStartedButtonOnDemandPage() {

        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        staffingPage.hoverStaffingMenu();
        onDemandTalentPage.clickOnDemandTalentMenu();
        onDemandTalentPage.clickGetStartedOverOnDemandTalentPage();

    }
}
