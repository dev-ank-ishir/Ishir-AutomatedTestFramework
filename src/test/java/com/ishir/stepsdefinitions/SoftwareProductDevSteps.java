package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.SoftwareProductDevelopmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SoftwareProductDevSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();
    SoftwareProductDevelopmentPage softwareProductDevelopmentPage=homePage.softwareProductDevelopmentPage();


    @And("hovers Digital Innovation Menu")
    public void hoversDigitalInnovationMenu() {
        softwareProductDevelopmentPage.selectDigitalInnovationMenu();
    }

    @And("clicks Software Product Development Menu")
    public void clicksSoftwareProductDevelopmentMenu() {

        softwareProductDevelopmentPage.selectSoftwareProductDevMenu();
    }
    @Then("Software Product Development page should appear")
    public void softwareProductDevelopmentPageShouldAppear() {
        Assert.assertEquals(softwareProductDevelopmentPage.doGetCurrentPageURL(),"https://www.ishir.com/software-product-development.htm");
    }

    @Given("the user is on the Software Product Development page")
    public void theUserIsOnTheSoftwareProductDevelopmentPage() {
    }

    @When("the user clicks Get Started button on main banner of Software Product Development page")
    public void theUserClicksGetStartedButtonOnMainBannerOfSoftwareProductDevelopmentPage() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        softwareProductDevelopmentPage.selectDigitalInnovationMenu();
        softwareProductDevelopmentPage.selectSoftwareProductDevMenu();
        softwareProductDevelopmentPage.selectGetStartedMainBannerSoftwareProductDevMenu();
    }

    @When("the user clicks Get Started within Start Your Product Journey section")
    public void theUserClicksGetStartedWithinStartYourProductJourneySection() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        softwareProductDevelopmentPage.selectDigitalInnovationMenu();
        softwareProductDevelopmentPage.selectSoftwareProductDevMenu();
        softwareProductDevelopmentPage.selectGetStartedProductJourneySoftwareProductDevMenu();
    }


}
