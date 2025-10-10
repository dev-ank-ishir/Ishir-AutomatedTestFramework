package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.about.AboutPage;
import com.ishir.pages.about.TeamPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TeamsPageSteps {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    TeamPage teamPage = homePage.teamPageFromHomePage();
    AboutPage aboutPage = homePage.aboutPageFromHomePage();


    @Then("Team page should appear")

    public void teamPageShouldAppear() {

        Assert.assertEquals(homePage.doGetCurrentPageURL(),"https://www.ishir.com/team.htm");

    }


    @And("selects the Team option")
    public void selectsTheTeamOption() {

        teamPage.selectTeamOption();

    }

    @When("the user clicks the Get Started button on Teams Page")
    public void theUserClicksTheGetStartedButtonOnTeamsPage() {

        homePage.handleCookieAndPopups();
        aboutPage.openAboutDropDown();
        teamPage.selectTeamOption();
        teamPage.clickGetStartedTeamsPage();

    }
}
