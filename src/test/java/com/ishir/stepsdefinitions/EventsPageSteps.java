package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.about.EventsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EventsPageSteps {

    EventsPage eventsPage = new EventsPage(DriverFactory.getDriver());
    HomePage homePage = new HomePage(DriverFactory.getDriver());

    @And("selects the Events option")

    public void selectsTheEventsOption() {
        homePage.allowCookie();
        eventsPage.selectEventOption();

    }


    @Then("Events page should appear")
    public void eventsPageShouldAppear() {


    }

    @Given("the user is on the Events page")
    public void theUserIsOnTheEventsPage() {

    }

    @When("the user clicks the Stay Updated button on Events Page")
    public void theUserClicksTheStayUpdatedButtonOnEventsPage() {

        homePage.allowCookie();
        eventsPage.selectEventOption();
        eventsPage.selectStayUpdatedOption();

    }
}
