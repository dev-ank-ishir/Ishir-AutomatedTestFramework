package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.SoftwareDevPage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SoftwareDevSupportPageSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());

    AdvisoryServicesPage AdvisoryServicesPage = homePage.advisoryServicesFromHomePage();

    SoftwareDevPage softwareDevPage = homePage.SoftwareDevPageFromHomePage();

    @And("click Software Dev Support Menu option")
    public void clickSoftwareDevSupportMenuOption() {
        softwareDevPage.selectSoftwareDevSupportMenu();
    }

    @Then("Software Dev Support page should appear")
    public void softwareDevSupportPageShouldAppear() {

        Assert.assertEquals(softwareDevPage.doGetCurrentPageURL(),"https://www.ishir.com/software-development-support.htm");

    }

    @Given("the user is on the Software Dev Support page")
    public void theUserIsOnTheSoftwareDevSupportPage() {
    }

    @When("the user clicks Start Your Project Today button")
    public void theUserClicksStartYourProjectTodayButton() {
        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        softwareDevPage.selectSoftwareDevSupportMenu();
        softwareDevPage.clickStartYourProjectToday();
    }

    @When("the user clicks Schedule a Consultation button")
    public void theUserClicksScheduleAConsultationButton() {

        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        softwareDevPage.selectSoftwareDevSupportMenu();
        softwareDevPage.clickScheduleConsultation();

    }
}
