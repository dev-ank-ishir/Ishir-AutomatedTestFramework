package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.mainMenu.AcceleratorPage;
import com.ishir.pages.services.subMenu.InnovationAcceleratorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class InnovationAcceleratorSteps {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();
    AcceleratorPage acceleratorPage = homePage.acceleratorPageFromHomePage();
    InnovationAcceleratorPage innovationAcceleratorPage = homePage.innovationAcceleratorPageFromHomePage();

    private final Logger logger = LogManager.getLogger(this.getClass());




    @And("hovers Accelerator Menu")
    public void hoversAcceleratorMenu() {

        acceleratorPage.hoverOverAcceleratorMenu();
    }
    @And("clicks Innovation Accelerator Menu")
    public void clicksInnovationAcceleratorMenu() {
        innovationAcceleratorPage.selectInnovationAcceleratorMenu();

    }

    @Then("Innovation Accelerator page should appear")
    public void innovationAcceleratorPageShouldAppear() {
        Assert.assertEquals("https://www.ishir.com/innovation-accelerator.htm",innovationAcceleratorPage.doGetCurrentPageURL());
        logger.info("Innovation Accelerator page appeared successfully");
    }

    @Given("the user is on the Innovation Accelerator page")
    public void theUserIsOnTheInnovationAcceleratorPage() {

    }

    @When("the user clicks Get Started button on main banner of Innovation Accelerator Page")
    public void clicksGetStartedButtonOnMainBanner() {
        homePage.handleCookieAndPopups();
        acceleratorPage.selectExpertiseMenu();
        acceleratorPage.hoverOverAcceleratorMenu();
        innovationAcceleratorPage.selectInnovationAcceleratorMenu();
        innovationAcceleratorPage.selectGetStartedMainBannerInnovationAccelerator();
    }

    @When("the user clicks Start Innovation Journey today within Innovation Journey section")
    public void clicksStartInnovationJourneySection() {
        homePage.handleCookieAndPopups();
        acceleratorPage.selectExpertiseMenu();
        acceleratorPage.hoverOverAcceleratorMenu();
        innovationAcceleratorPage.selectInnovationAcceleratorMenu();
        innovationAcceleratorPage.selectStartInnovationJourneySection();
    }

    @When("the user clicks Get Started within Ready to Innovate section")
    public void clicksReadyToInnovateSection() {
        homePage.handleCookieAndPopups();
        acceleratorPage.selectExpertiseMenu();
        acceleratorPage.hoverOverAcceleratorMenu();
        innovationAcceleratorPage.selectInnovationAcceleratorMenu();
        innovationAcceleratorPage.selectGetStartedReadyToInnovateSection();
    }



}
