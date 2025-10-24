package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.MaintenanceSupportPage;
import com.ishir.pages.services.subMenu.DigitalProductDevelopmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MaintenanceSupportSteps {

    HomePage homePage=new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();
    MaintenanceSupportPage maintenanceSupportPage=homePage.maintenanceSupportPageFromHomePage();
    DigitalProductDevelopmentPage digitalProductDevelopmentPage =homePage.fromDigitalProductDevelopmentPage();


    @And("click Maintenance Support Menu")
    public void clickMaintenanceSupportMenu() {

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
        advisoryServicesPage.selectServicesMenu();
        digitalProductDevelopmentPage.selectDigitalProductInnovationMenu();
        maintenanceSupportPage.clickMaintenanceSupportMenu();
        maintenanceSupportPage.clickGetStaredMaintenanceSupport();


    }
}
