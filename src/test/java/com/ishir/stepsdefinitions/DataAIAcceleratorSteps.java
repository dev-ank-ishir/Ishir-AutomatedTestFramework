package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.mainMenu.AcceleratorPage;
import com.ishir.pages.services.subMenu.DataAIAcceleratorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class DataAIAcceleratorSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AcceleratorPage acceleratorPage = homePage.acceleratorPageFromHomePage();
    DataAIAcceleratorPage dataAIAcceleratorPage = homePage.dataAIAcceleratorPageFromHomePage();
    private final Logger logger = LogManager.getLogger(this.getClass());


    @And("clicks Data+AI Accelerator Menu")
    public void clicksDataAIAcceleratorMenu() {
        dataAIAcceleratorPage.selectDataAIAcceleratorMenu();
    }

    @Then("Data+AI Accelerator page should appear")
    public void dataAIAcceleratorPageShouldAppear() {
        Assert.assertEquals("https://www.ishir.com/data-ai-acceleration.htm", dataAIAcceleratorPage.doGetCurrentPageURL());
        logger.info("Data+AI Accelerator Page appeared successfully");

    }

    @Given("the user is on the Data+AI Accelerator page")
    public void theUserIsOnTheDataAIAcceleratorPage() {

    }

    @When("the user clicks Get Started button on main banner of Data+AI Accelerator Page")
    public void clicksGetStartedButtonOnMainBanner() {
        homePage.handleCookieAndPopups();
        acceleratorPage.selectExpertiseMenu();
        acceleratorPage.hoverOverAcceleratorMenu();
        dataAIAcceleratorPage.selectDataAIAcceleratorMenu();
        dataAIAcceleratorPage.selectGetStartedMainBannerDataAIAccelerator();
    }

    @When("the user clicks Get Started within Ready to Accelerate section")
    public void clicksReadyToAccelerateSection() {
        homePage.handleCookieAndPopups();
        acceleratorPage.selectExpertiseMenu();
        acceleratorPage.hoverOverAcceleratorMenu();
        dataAIAcceleratorPage.selectDataAIAcceleratorMenu();
        dataAIAcceleratorPage.selectGetStartedReadyToAccelerateSection();
    }
}
