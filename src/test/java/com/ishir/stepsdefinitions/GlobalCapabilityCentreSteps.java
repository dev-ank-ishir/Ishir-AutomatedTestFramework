package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.TalentAndSkillsPage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.GlobalCapabilityCentrePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GlobalCapabilityCentreSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();
    TalentAndSkillsPage talentAndSkillsPage = homePage.talentAndSkillsPageFromHomePage();
    GlobalCapabilityCentrePage globalCapabilityCentrePage = homePage.globalCapabilityCentrePageFromHomePage();

    @And("clicks Global Capability Centre Menu")
    public void clickGlobalCapabilityCentreMenu() {
        globalCapabilityCentrePage.clickGlobalCapabilityCentreMenu();

    }

    @Then("Global Capability Centre page should appear")
    public void globalCapabilityCentrePageShouldAppear() {

        Assert.assertEquals(globalCapabilityCentrePage.doGetCurrentPageURL(),"https://www.ishir.com/global-capability-centers.htm");

    }

    @Given("the user is on the Global Capability Centre page")
    public void theUserIsOnTheGlobalCapabilityCentrePage() {

    }

    @When("the user clicks Get Started button on main banner GCC")
    public void theUserClicksGetStartedButtonOnMainBannerGCC() {

        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        talentAndSkillsPage.hoverTalentAndSkillsMenu();
        globalCapabilityCentrePage.clickGlobalCapabilityCentreMenu();
        globalCapabilityCentrePage.clickGetStartedOverGlobalCapabilityCentrePage();

    }




}
