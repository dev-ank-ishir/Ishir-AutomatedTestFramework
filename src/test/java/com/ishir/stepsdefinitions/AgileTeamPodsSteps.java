package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.TalentAndSkillsPage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.AgileTeamPodsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AgileTeamPodsSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage AdvisoryServicesPage = homePage.advisoryServicesFromHomePage();
    TalentAndSkillsPage talentAndSkillsPage = homePage.talentAndSkillsPageFromHomePage();
    AgileTeamPodsPage agileTeamPodsPage = homePage.agileTeamPodsPageFromHomePage();

    @And("hovers Talent & Skills Menu option")
    public void hoversTalentSkillsMenuOption() {

        talentAndSkillsPage.hoverTalentAndSkillsMenu();
    }
    @And("click Agile Team Pods Menu")
    public void clickAgileTeamPodsMenu() {

        agileTeamPodsPage.clickAgileTeamPodsMenu();

    }

    @Then("On Agile Team Pods page should appear")
    public void onAgileTeamPodsPageShouldAppear() {

        Assert.assertEquals(agileTeamPodsPage.doGetCurrentPageURL(), "https://www.ishir.com/agile-team-pods.htm");
    }

    @Given("the user is on the Agile Team Pods page")
    public void theUserIsOnTheAgileTeamPodsPage() {
    }

    @When("the user clicks Get Started button on Agile Pods main banner")
    public void theUserClicksGetStartedButtonOnAgilePodsMainBanner() {

        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        talentAndSkillsPage.hoverTalentAndSkillsMenu();
        agileTeamPodsPage.clickAgileTeamPodsMenu();
        agileTeamPodsPage.clickGetStartedMainBannerAgileTeamPods();

    }

    @When("user clicks Get Started under How we engage section")
    public void userClicksGetStartedUnderHowWeEngageSection() {


        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        talentAndSkillsPage.hoverTalentAndSkillsMenu();
        agileTeamPodsPage.clickAgileTeamPodsMenu();
        agileTeamPodsPage.clickGetStartedHowWeEngageAgileTeamPods();
    }


}
