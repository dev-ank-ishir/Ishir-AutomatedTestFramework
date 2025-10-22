package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.DataAnalyticsPage;
import com.ishir.pages.services.subMenu.EnterpriseAIPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DataAnalyticsSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();
    EnterpriseAIPage enterpriseAIPage = homePage.EnterpriseAIPageFromHomePage();
    DataAnalyticsPage dataAnalyticsPage = homePage.dataAnalyticsPageFromHomePage();


    @And("clicks Data Analytics Menu")
    public void clicksDataAnalyticsMenu() {

        dataAnalyticsPage.selectDataAnalyticsMenu();


    }


    @Then("Data Analytics page should appear")
    public void dataAnalyticsPageShouldAppear() {
        Assert.assertEquals(dataAnalyticsPage.doGetCurrentPageURL(), "https://www.ishir.com/data-analytics.htm");
    }

    @Given("the user is on the Data Analytics page")
    public void theUserIsOnTheDataAnalyticsPage() {
    }

    @When("user clicks Get Started button on main banner of Data Analytics Page")
    public void userClicksGetStartedButtonOnMainBannerOfDataAnalyticsPage() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        enterpriseAIPage.hoversDataAIMenu();
        dataAnalyticsPage.selectDataAnalyticsMenu();
        dataAnalyticsPage.selectGetStartedMainBannerDataAnalytics();
    }

    @When("user clicks Get Started on How We Engage section of Data Analytics Page")
    public void userClicksGetStartedOnHowWeEngageSectionOfDataAnalyticsPage() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        enterpriseAIPage.hoversDataAIMenu();
        dataAnalyticsPage.selectDataAnalyticsMenu();
        dataAnalyticsPage.selectGetStartedHowWeEngageSectionDataAnalytics();
    }


}
