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
import org.junit.Assert;

public class DataAIAcceleratorSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();
    AcceleratorPage acceleratorPage = homePage.acceleratorPageFromHomePage();
    DataAIAcceleratorPage dataAIAcceleratorPage = homePage.dataAIAcceleratorPageFromHomePage();




    @And("clicks Data+AI Accelerator Menu")
    public void clicksDataAIAcceleratorMenu() {
        dataAIAcceleratorPage.selectDataAIAcceleratorMenu();
    }

    @Then("Data+AI Accelerator page should appear")
    public void dataAIAcceleratorPageShouldAppear() {
        Assert.assertEquals(dataAIAcceleratorPage.doGetCurrentPageURL(), "https://www.ishir.com/data-ai-acceleration.htm");
    }

    @Given("the user is on the Data+AI Accelerator page")
    public void theUserIsOnTheDataAIAcceleratorPage() {

    }

    @When("the user clicks Get Started button on main banner of Data+AI Accelerator Page")
    public void clicksGetStartedButtonOnMainBanner() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        acceleratorPage.hoverOverAcceleratorMenu();
        dataAIAcceleratorPage.selectDataAIAcceleratorMenu();
        dataAIAcceleratorPage.selectGetStartedMainBannerDataAIAccelerator();
    }

    @When("the user clicks Get Started within Ready to Accelerate section")
    public void clicksReadyToAccelerateSection() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();

        acceleratorPage.hoverOverAcceleratorMenu();
        dataAIAcceleratorPage.selectDataAIAcceleratorMenu();
        dataAIAcceleratorPage.selectGetStartedReadyToAccelerateSection();
    }
}
