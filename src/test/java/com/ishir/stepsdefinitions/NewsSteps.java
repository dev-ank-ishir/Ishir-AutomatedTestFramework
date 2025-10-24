package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.about.CompanyPage;
import com.ishir.pages.about.NewsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class NewsSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    CompanyPage companyPage = homePage.companyPageFromHomePage();
    NewsPage newsPage = homePage.newsPageFromHomePage();

    private final Logger logger = LogManager.getLogger(this.getClass());




    @And ("selects the News option")

    public void selectstheNewsoption() {

        newsPage.selectNewsMenu();

    }


    @Then("News page should appear")
    public void newsPageShouldAppear() {
        Assert.assertEquals("https://www.ishir.com/inthenews-2.htm",newsPage.doGetCurrentPageURL());
        logger.info("News page appeared successfully");
    }

    @Given("the user is on the News page")
    public void theUserIsOnTheNewsPage() {
    }

    @When("the user clicks the Stay Updated button on News Page")
    public void theUserClicksTheStayUpdatedButtonOnNewsPage() {

        homePage.handleCookieAndPopups();
        companyPage.openAboutDropDown();
        newsPage.selectNewsMenu();
        newsPage.clickStayUpdatedOverNewsPage();

    }
}
