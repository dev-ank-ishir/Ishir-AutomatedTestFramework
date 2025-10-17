package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.AcceleratorPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AcceleratorSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();
    AcceleratorPage acceleratorPage = homePage.acceleratorPageFromHomePage();


    @And("user clicks Accelerator Menu")
    public void userClicksAcceleratorMenu() {
        acceleratorPage.selectAcceleratorMenu();
    }

    @Then("Accelerator page should appear")
    public void acceleratorPageShouldAppear() {
        Assert.assertEquals(acceleratorPage.doGetCurrentPageURL(), "https://www.ishir.com/accelerator-workshops.htm");
    }

    @Given("the user is on the Accelerator page")
    public void theUserIsOnTheAcceleratorPage() {

    }

    @When("the user clicks Get Started button on main banner of Accelerator Page")
    public void theUserClicksGetStartedButtonOnMainBannerOfAcceleratorPage() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        acceleratorPage.selectAcceleratorMenu();
        acceleratorPage.selectGetStartedMainBanner();
    }

    @When("the user clicks Get Started on Accelerate Your Success section")
    public void theUserClicksGetStartedOnAccelerateYourSuccessSection() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        acceleratorPage.selectAcceleratorMenu();
        acceleratorPage.selectGetStartedAccelerateYourSuccessSection();
    }
}
