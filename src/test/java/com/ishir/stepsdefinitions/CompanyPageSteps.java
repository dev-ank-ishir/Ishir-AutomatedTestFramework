package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.about.CompanyPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class CompanyPageSteps {

    private HomePage homePage = new HomePage(DriverFactory.getDriver());
    CompanyPage companyPage = homePage.companyPageFromHomePage();

    private final Logger logger = LogManager.getLogger(this.getClass());


    @When("the user opens the About dropdown")
    public void the_user_opens_the_About_dropdown() {
        homePage.handleCookieAndPopups();
        companyPage.openAboutDropDown();
    }

    @And("selects the Company option")
    public void selectsTheOurStoryOption() {
        companyPage.selectCompanyOption();
    }

    @Then("the Company page should appear")
    public void theOurStoryPageShouldAppear() {
        Assert.assertEquals("https://www.ishir.com/company.htm",companyPage.doGetCurrentPageURL());
        logger.info("Company page appeared");

    }

    @Given("the user is on the Company page")
    public void theUserIsOnTheOurStoryPage() {
    }

    @When("the user clicks the Get Started button under banner")
    public void theUserClicksTheGetStartedButtonUnderBanner() throws InterruptedException {
        homePage.handleCookieAndPopups();
        companyPage.openAboutDropDown();
        companyPage.selectCompanyOption();
        companyPage.clickGetStartedButtonBanner();
    }

    @When("the user clicks the Get Started button under How We Engage")
    public void theUserClicksTheGetStartedButtonUnderHowWeEngage() throws InterruptedException {
        homePage.handleCookieAndPopups();
        companyPage.openAboutDropDown();
        companyPage.selectCompanyOption();
        companyPage.clickGetStartedButtonEnagage();
    }
}
