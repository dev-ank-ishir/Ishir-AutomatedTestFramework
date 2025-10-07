package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.StrategicAdvisoryPage;
import com.ishir.pages.services.subMenu.CustomSoftwareDevPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomSoftwareDevSteps {

    HomePage homePage=new HomePage(DriverFactory.getDriver());
    StrategicAdvisoryPage StrategicAdvisoryPage = new StrategicAdvisoryPage(DriverFactory.getDriver());
    CustomSoftwareDevPage customSoftwareDevPage=new CustomSoftwareDevPage(DriverFactory.getDriver());

    @When("the user hovers Software dev support Menu")
    public void theUserHoversSoftwareDevSupportMenu() {
        homePage.allowCookie();
        StrategicAdvisoryPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
    }

    @And("click Custom Software Development")
    public void clickCustomSoftwareDevelopment() {
        customSoftwareDevPage.clickCustomSoftwareDevelopmentMenu();
    }

    @Then("Custom Software Dev page should appear")
    public void customSoftwareDevPageShouldAppear() {

    }

    @Given("the user is on the custom software dev page")
    public void theUserIsOnTheCustomSoftwareDevPage() {


    }

    @When("the user clicks Get Started on custom software dev page")
    public void theUserClicksGetStartedOnCustomSoftwareDevPage() throws InterruptedException {

        homePage.allowCookie();
        StrategicAdvisoryPage.selectServicesMenu();
        Thread.sleep(8000);
        customSoftwareDevPage.hoverSoftDevMenu();

        customSoftwareDevPage.clickCustomSoftwareDevelopmentMenu();
        customSoftwareDevPage.clickGetStartedButton();

    }
}
