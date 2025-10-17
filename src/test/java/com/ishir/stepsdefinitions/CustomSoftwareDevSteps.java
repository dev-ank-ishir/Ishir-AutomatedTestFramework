package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.SoftwareDevPage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.CustomSoftwareDevPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CustomSoftwareDevSteps {

    HomePage homePage=new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage AdvisoryServicesPage = homePage.advisoryServicesFromHomePage();

    SoftwareDevPage softwareDevPage= homePage.SoftwareDevPageFromHomePage();
    CustomSoftwareDevPage customSoftwareDevPage=homePage.customSoftwareDevPageFromHomePage();

    @When("the user hovers Software dev support Menu")
    public void theUserHoversSoftwareDevSupportMenu() {
        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
    }

    @And("click Custom Software Development")
    public void clickCustomSoftwareDevelopment() {
        customSoftwareDevPage.clickCustomSoftwareDevelopmentMenu();
    }

    @Then("Custom Software Dev page should appear")
    public void customSoftwareDevPageShouldAppear() {

        Assert.assertEquals(customSoftwareDevPage.doGetCurrentPageURL(),"https://www.ishir.com/software-product-development.htm");

    }

    @Given("the user is on the custom software dev page")
    public void theUserIsOnTheCustomSoftwareDevPage() {


    }


    @When("user clicks Get Started on main banner custom software dev page")
    public void userClicksGetStartedOnMainBannerCustomSoftwareDevPage() {
        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
        customSoftwareDevPage.clickCustomSoftwareDevelopmentMenu();
        customSoftwareDevPage.clickGetStartedButton();
    }

    @When("user clicks Get Started on product Journey section")
    public void userClicksGetStartedOnProductJourneySection() {
        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
        customSoftwareDevPage.clickCustomSoftwareDevelopmentMenu();
        customSoftwareDevPage.clickGetStartedButtonProductJourney();
        
    }

    @When("user clicks Get Started on Find Business problem section")
    public void userClicksGetStartedOnFindBusinessProblemSection() {
        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
        customSoftwareDevPage.clickCustomSoftwareDevelopmentMenu();
        customSoftwareDevPage.clickGetStartedButtonFindProblem();
    }
}
