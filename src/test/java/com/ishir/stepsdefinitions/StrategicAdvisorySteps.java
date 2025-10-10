package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.StrategicAdvisoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StrategicAdvisorySteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    StrategicAdvisoryPage StrategicAdvisoryPage = new StrategicAdvisoryPage(DriverFactory.getDriver());

    @When("the user clicks the Services Menu")
    public void the_user_clicks_the_Services_Menu() {
        homePage.handleCookieAndPopups();
        StrategicAdvisoryPage.selectServicesMenu();
    }

    @And("click Strategic & Advisory Menu option")
    public void click_Strategic_Advisory_Menu_option() {
        StrategicAdvisoryPage.selectStrategicMenu();

    }

    @Then("Strategic Advisory Services Menu should appear")
    public void strategic_Advisory_Services_Menu_should_appear() {
    }

    @Given("the user is on the Strategic & Advisory page")
    public void the_user_is_on_the_Strategic_Advisory_page() {
    }

    @When("the user clicks Start Your Journey button")
    public void the_user_clicks_Start_Your_Journey_button() {
        homePage.handleCookieAndPopups();
        StrategicAdvisoryPage.selectServicesMenu();
        StrategicAdvisoryPage.selectStrategicMenu();
        StrategicAdvisoryPage.clickStartJourney();
    }
}
