package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.SoftwareDevPage;
import com.ishir.pages.services.mainMenu.StrategicAdvisoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SoftwareDevSupportPageSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    StrategicAdvisoryPage StrategicAdvisoryPage = new StrategicAdvisoryPage(DriverFactory.getDriver());

    SoftwareDevPage softwareDevPage = new SoftwareDevPage(DriverFactory.getDriver());

    @And("click Software Dev Support Menu option")
    public void clickSoftwareDevSupportMenuOption() {
        homePage.allowCookie();
        softwareDevPage.selectSoftwareDevSupportMenu();
    }

    @Then("Software Dev Support page should appear")
    public void softwareDevSupportPageShouldAppear() {

    }

    @Given("the user is on the Software Dev Support page")
    public void theUserIsOnTheSoftwareDevSupportPage() {
    }

    @When("the user clicks Start Your Project Today button")
    public void theUserClicksStartYourProjectTodayButton() {
        homePage.allowCookie();
        StrategicAdvisoryPage.selectServicesMenu();
        softwareDevPage.selectSoftwareDevSupportMenu();
        softwareDevPage.clickStartYourProjectToday();
    }
}
