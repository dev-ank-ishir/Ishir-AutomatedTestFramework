package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.work.ClientsPage;
import com.ishir.pages.work.SuccessStoriesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SuccessStoriesSteps {

    private HomePage homePage = new HomePage(DriverFactory.getDriver());
    private SuccessStoriesPage successStoriesPage = new SuccessStoriesPage(DriverFactory.getDriver());

    private ClientsPage clientsPage = new ClientsPage(DriverFactory.getDriver());


    @And("selects the Success Stories option")
    public void selectsTheSuccessStoriesOption() {

        successStoriesPage.clickSuccessStoriesLink();
    }

    @Then("the Success Stories page should appear")
    public void theSuccessStoriesPageShouldAppear() {


    }

    @Given("the user is on the Success Stories page")
    public void theUserIsOnTheSuccessStoriesPage() {
    }

    @When("the user clicks the available view case study")
    public void theUserClicksTheAvailableViewCaseStudy() {
        homePage.allowCookie();
        homePage.closePopup();
        clientsPage.clickWorkMenu();
        successStoriesPage.clickSuccessStoriesLink();
        successStoriesPage.clickViewCaseStudyLink();

    }

    @And("clicks Contact US Today over case study")
    public void clicksContactUSTodayOverCaseStudy() {
        successStoriesPage.clickContactUsLink();
    }
}
