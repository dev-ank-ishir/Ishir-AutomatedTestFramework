package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.about.AboutPage;
import com.ishir.pages.about.EventsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EventsPageSteps {
    HomePage homePage = new HomePage(DriverFactory.getDriver());
    EventsPage eventsPage = homePage.eventsPageFromHomePage();

    AboutPage aboutPage = homePage.aboutPageFromHomePage();


    @And("selects the Events option")

    public void selectsTheEventsOption() {

        eventsPage.selectEventOption();

    }


    @Then("Events page should appear")
    public void eventsPageShouldAppear() {

        Assert.assertEquals(eventsPage.doGetCurrentPageURL(),"https://www.ishir.com/events.htm");

    }

    @Given("the user is on the Events page")
    public void theUserIsOnTheEventsPage() {

    }

    @When("the user clicks the Stay Updated button on Events Page")
    public void theUserClicksTheStayUpdatedButtonOnEventsPage() {

        homePage.allowCookie();
        aboutPage.openAboutDropDown();
        eventsPage.selectEventOption();
        eventsPage.selectStayUpdatedOption();

    }

    @When("the user clicks Read More over available event")
    public void theUserClicksReadMoreOverAvailableEvent() {

        homePage.allowCookie();
        aboutPage.openAboutDropDown();
        eventsPage.selectEventOption();
        eventsPage.selectReadMoreEventLink();


    }

    @And("the user clicks Let's talk image")
    public void theUserClicksLetSTalkImage() {
        eventsPage.selectLetsTalkWidget();
    }

    @When("the user clicks the trending blog")
    public void theUserClicksTheTrendingBlog() {
        homePage.allowCookie();
        aboutPage.openAboutDropDown();
        eventsPage.selectEventOption();
        eventsPage.selectTrendingBlogLink();
    }

    @And("click Get Started button under blog page")
    public void clickGetStartedButtonUnderBlogPage() {
        eventsPage.clickGetStartedBlogsPage();
    }

}
