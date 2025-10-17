package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdvisoryServicesSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();

    @When("the user clicks the Services Menu")
    public void the_user_clicks_the_Services_Menu() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
    }

    @And("clicks advisory Services Menu option")
    public void clicks_advisory_Services_Menu_option() {

        advisoryServicesPage.selectAdvisoryMenu();


    }

    @Then("Advisory Services Menu should appear")
    public void advisoryServicesMenuShouldAppear() {

        Assert.assertEquals(advisoryServicesPage.doGetCurrentPageURL(),"https://www.ishir.com/strategic-advisory-services.htm");

    }

    @Given("the user is on the Advisory Services page")
    public void theUserIsOnTheAdvisoryServicesPage() {
    }

    @When("the user clicks Start Your Journey button")
    public void the_user_clicks_Start_Your_Journey_button() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        advisoryServicesPage.selectAdvisoryMenu();
        advisoryServicesPage.clickStartJourney();
    }

    @When("user clicks Schedule a Consultation button on AdvisoryPage")
    public void userClicksScheduleAConsultationButtonOnAdvisoryPage() {

        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        advisoryServicesPage.selectAdvisoryMenu();
        advisoryServicesPage.clickScheduleConsultation();

    }

    @When("user clicks Learn More button over Reach out to us section")
    public void userClicksLearnMoreButtonOverReachOutToUsSection() {

        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        advisoryServicesPage.selectAdvisoryMenu();
        advisoryServicesPage.clickLearnMore();
    }




}
