package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.SoftwareDevPage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.CustomSoftwareDevPage;
import com.ishir.pages.services.subMenu.MaintenanceSupportPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MaintenanceSupportSteps {

    HomePage homePage=new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage AdvisoryServicesPage = homePage.advisoryServicesFromHomePage();
    CustomSoftwareDevPage customSoftwareDevPage=homePage.customSoftwareDevPageFromHomePage();

    SoftwareDevPage softwareDevPage= homePage.SoftwareDevPageFromHomePage();
    MaintenanceSupportPage maintenanceSupportPage=homePage.maintenanceSupportPageFromHomePage();


    @And("click Maintenance Support Menu")
    public void clickMaintenanceSupportMenu() {

        maintenanceSupportPage.hoverMaintenanceSupportMenu();

        maintenanceSupportPage.clickMaintenanceSupportMenu();


    }

    @Then("Maintenance Support page should appear")
    public void maintenanceSupportPageShouldAppear() {
        Assert.assertEquals(maintenanceSupportPage.doGetCurrentPageURL(),"https://www.ishir.com/application-maintenance-services-india.htm");
    }

    @Given("the user is on the Maintenance Support page")
    public void theUserIsOnTheMaintenanceSupportPage() {
    }

    @When("user clicks Get Started button on main banner of Maintenance Support Page")
    public void userClicksGetStartedButtonOnMainBannerOfMaintenanceSupportPage() {

        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
        maintenanceSupportPage.hoverMaintenanceSupportMenu();
        maintenanceSupportPage.clickMaintenanceSupportMenu();
        maintenanceSupportPage.clickGetStaredMaintenanceSupport();


    }
}
