package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.about.CompanyPage;
import com.ishir.pages.about.LeadershipPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class LeadershipPageSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    LeadershipPage leadershipPage = homePage.leadershipPageFromHomePage();
    CompanyPage companyPage = homePage.companyPageFromHomePage();
    private final Logger logger = LogManager.getLogger(this.getClass());


    @Then("Leadership page should appear")
    public void leadershipPageShouldAppear() {
        Assert.assertEquals("https://www.ishir.com/team.htm",homePage.doGetCurrentPageURL());
        logger.info("Leadership Page appeared successfully");
    }

    @And("selects the Leadership option")
    public void selectsTheLeadershipOption() {
        leadershipPage.selectLeadershipOption();
    }

    @When("the user clicks the Get Started button on Leadership Page")
    public void theUserClicksTheGetStartedButtonOnLeadershipPage() {
        homePage.handleCookieAndPopups();
        companyPage.openAboutDropDown();
        leadershipPage.selectLeadershipOption();
        leadershipPage.clickGetStartedLeadershipPage();
    }
}
