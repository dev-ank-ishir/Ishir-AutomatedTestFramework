package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.work.ClientsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ClientsPageSteps {

    private HomePage homePage = new HomePage(DriverFactory.getDriver());
    private ClientsPage clientsPage = new ClientsPage(DriverFactory.getDriver());

    @When("the user opens the Work dropdown")
    public void theUserOpensTheWorkDropdown() {

        homePage.allowCookie();
        clientsPage.clickWorkMenu();

    }

    @And("selects the Clients option")

    public void selectsTheClientsOption() {

        clientsPage.selectClientsOption();

    }


    @Then("Clients page should appear")
    public void clientsPageShouldAppear() {

        Assert.assertEquals(clientsPage.getClientPageURL(), "https://www.ishir.com/clients.htm");

    }

    @Given("the user is on the clients page")
    public void theUserIsOnTheClientsPage() {
    }

    @When("the user clicks start your innovation journey button")
    public void theUserClicksStartYourInnovationJourneyButton() {

        homePage.allowCookie();
        clientsPage.clickInnovationJourney();
    }

    @When("the user clicks Let's talk link")
    public void theUserClicksLetSTalkLink() {

        clientsPage.clickWorkMenu();
        clientsPage.selectClientsOption();
        homePage.allowCookie();
        clientsPage.clickLetsTak();
    }
}
