package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.TalentAndSkillsPage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.OnDemandTalentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OnDemandTalentSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();
    TalentAndSkillsPage talentAndSkillsPage = homePage.talentAndSkillsPageFromHomePage();
    OnDemandTalentPage onDemandTalentPage = homePage.OnDemandTalentPageFromHomePage();



    @And("clicks On Demand & Fractional Talent Menu")
    public void clicksOnDemandFractionalTalentMenu() {

        onDemandTalentPage.clickOnDemandTalentMenu();

    }

    @Then("On Demand page should appear")
    public void onDemandPageShouldAppear() {
        Assert.assertEquals(onDemandTalentPage.doGetCurrentPageURL(),"https://www.ishir.com/on-demand-talent.htm");

    }

    @Given("the user is on the On Demand Talent page")
    public void theUserIsOnTheOnDemandTalentPage() {

    }


    @When("the user clicks Get Started button on demand page")
    public void theUserClicksGetStartedButtonOnDemandPage() {

        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        talentAndSkillsPage.hoverTalentAndSkillsMenu();
        onDemandTalentPage.clickOnDemandTalentMenu();
        onDemandTalentPage.clickGetStartedOverOnDemandTalentPage();

    }


}
