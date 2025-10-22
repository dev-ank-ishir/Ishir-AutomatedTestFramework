package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.TalentAndSkillsPage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TalentAndSkillsPageSteps {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();
    TalentAndSkillsPage talentAndSkillsPage = homePage.talentAndSkillsPage();

    @Given("the user is on the Talent & Skills page")
    public void theUserIsOnTheTalentAndSkillsPage() {

    }

    @And("click Talent & Skills Menu option")
    public void clickTalentAndSkillsMenuOption() {
        talentAndSkillsPage.selectTalentAndSkillsMenu();
    }

    @Then("Talent & Skills page should appear")
    public void talentAndSkillsPageShouldAppear() {

        Assert.assertEquals(talentAndSkillsPage.doGetCurrentPageURL(), "https://www.ishir.com/staffing-and-augmentation.htm");
    }

    @When("the user clicks main Get Started button")
    public void theUserClicksMainGetStartedButton() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        talentAndSkillsPage.selectTalentAndSkillsMenu();
        talentAndSkillsPage.clickGetStartedMain();
    }

    @When("the user clicks bottom Get Started button")
    public void theUserClicksBottomGetStartedButton() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        talentAndSkillsPage.selectTalentAndSkillsMenu();
        talentAndSkillsPage.clickGetStartedBottom();
    }
}
