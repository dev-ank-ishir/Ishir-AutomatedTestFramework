package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.AcceleratorPage;
import com.ishir.pages.services.subMenu.DigitalProductDevelopmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class DigitalProductDevSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AcceleratorPage acceleratorPage = homePage.acceleratorPageFromHomePage();
    DigitalProductDevelopmentPage digitalProductDevelopmentPage =homePage.fromDigitalProductDevelopmentPage();

    private final Logger logger = LogManager.getLogger(this.getClass());



    @And("hovers Digital Product Innovation Menu")
    public void hoversDigitalProductInnovationMenu() {

        digitalProductDevelopmentPage.selectDigitalProductInnovationMenu();
    }

    @And("clicks Digital Product Development Menu")
    public void clicksDigitalProductDevelopmentMenu() {

        digitalProductDevelopmentPage.selectDigitalProductDevMenu();

    }

    @Then("Digital Product Development page should appear")
    public void digitalProductDevelopmentPageShouldAppear() {
        Assert.assertEquals("https://www.ishir.com/software-product-development.htm",digitalProductDevelopmentPage.doGetCurrentPageURL());
        logger.info("Digital Product Development page appeared successfully");
    }

    @Given("the user is on the Digital Product Development page")
    public void theUserIsOnTheDigitalProductDevelopmentPage() {
    }

    @When("the user clicks Get Started button on main banner of Digital Product Development page")
    public void theUserClicksGetStartedButtonOnMainBannerOfDigitalProductDevelopmentPage() {

        homePage.handleCookieAndPopups();
        acceleratorPage.selectExpertiseMenu();
        digitalProductDevelopmentPage.selectDigitalProductInnovationMenu();
        digitalProductDevelopmentPage.selectDigitalProductDevMenu();
        digitalProductDevelopmentPage.selectGetStartedMainBannerDigitalProductDevMenu();
    }
    @When("the user clicks Get Started within Start Your Product Journey section")
    public void theUserClicksGetStartedWithinStartYourProductJourneySection() {
        homePage.handleCookieAndPopups();
        acceleratorPage.selectExpertiseMenu();
        digitalProductDevelopmentPage.selectDigitalProductInnovationMenu();
        digitalProductDevelopmentPage.selectDigitalProductDevMenu();
        digitalProductDevelopmentPage.selectGetStartedProductJourneyDigitalProductDevMenu();
    }




}
