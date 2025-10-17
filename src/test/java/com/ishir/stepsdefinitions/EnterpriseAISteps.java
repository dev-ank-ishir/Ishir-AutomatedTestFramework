package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.EnterpriseAIPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EnterpriseAISteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage AdvisoryServicesPage = homePage.advisoryServicesFromHomePage();
    EnterpriseAIPage enterpriseAIPage=homePage.EnterpriseAIPageFromHomePage();

    @When("the user hovers Strategic Advisory Menu")

    public void theuserhoversStrategicAdvisoryMenu(){

        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();



    }

    @And("click EnterpriseAI Menu")
    public void clickEnterpriseAIMenu() {

        enterpriseAIPage.selectEnterpriseAIMenu();

    }

    @Then("EnterpriseAI page should appear")
    public void enterpriseaiPageShouldAppear() {

        Assert.assertEquals(enterpriseAIPage.doGetCurrentPageURL(),"https://www.ishir.com/artificial-intelligence.htm");
    }

    @Given("the user is on the EnterpriseAI page")
    public void theUserIsOnTheEnterpriseAIPage() {

    }

    @When("user clicks Get Started button on main banner of EnterpriseAI Page")
    public void userClicksGetStartedButtonOnMainBannerOfEnterpriseAIPage() {

        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();

        enterpriseAIPage.selectEnterpriseAIMenu();
        enterpriseAIPage.selectGetStartedMainBannerEnterpriseAI();
    }

    @When("user clicks Get Started on how we engage section of EnterpriseAI Page")
    public void userClicksGetStartedOnHowWeEngageSectionOfEnterpriseAIPage() {
        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();

        enterpriseAIPage.selectEnterpriseAIMenu();
        enterpriseAIPage.selectGetStartedHowWeEngageSectionEnterpriseAI();
    }
}
