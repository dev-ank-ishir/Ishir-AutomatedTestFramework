package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.about.TeamPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TeamsPageSteps {

    TeamPage teamPage = new TeamPage(DriverFactory.getDriver());
    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Then("Team page should appear")

    public void teamPageShouldAppear() {


    }


    @And("selects the Team option")
    public void selectsTheTeamOption() {

        teamPage.selectTeamOption();

    }

    @When("the user clicks the Get Started button on Teams Page")
    public void theUserClicksTheGetStartedButtonOnTeamsPage() {

        homePage.allowCookie();

        teamPage.clickGetStartedTeamsPage();

    }
}
