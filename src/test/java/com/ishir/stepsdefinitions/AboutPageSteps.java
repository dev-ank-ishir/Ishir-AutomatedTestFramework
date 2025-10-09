package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.about.AboutPage;
import com.ishir.pages.base.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AboutPageSteps {

    private HomePage homePage = new HomePage(DriverFactory.getDriver());
     AboutPage aboutPage = homePage.aboutPageFromHomePage();


    @When("the user opens the About dropdown")

    public void the_user_opens_the_About_dropdown() {
        homePage.allowCookie();
        aboutPage.openAboutDropDown();

    }

    @And("selects the Our Story option")
    public void selectsTheOurStoryOption() {

        aboutPage.selectOurStoryOption();
    }

    @Then("the Our Story page should appear")
    public void theOurStoryPageShouldAppear() {

        Assert.assertEquals(aboutPage.doGetCurrentPageURL(), "https://www.ishir.com/company.htm");

    }

    @Given("the user is on the Our Story page")
    public void theUserIsOnTheOurStoryPage() {

    }

    @When("the user clicks the Get Started button under banner")
    public void theUserClicksTheGetStartedButtonUnderBanner() throws InterruptedException {

        homePage.allowCookie();
        Thread.sleep(8000);
        aboutPage.openAboutDropDown();
        aboutPage.selectOurStoryOption();
        aboutPage.clickGetStartedButtonBanner();
    }

    @When("the user clicks the Get Started button under How We Engage")
    public void theUserClicksTheGetStartedButtonUnderHowWeEngage() throws InterruptedException {

        homePage.allowCookie();
        Thread.sleep(8000);
        aboutPage.openAboutDropDown();
        aboutPage.selectOurStoryOption();
        aboutPage.clickGetStartedButtonEnagage();

    }
}
