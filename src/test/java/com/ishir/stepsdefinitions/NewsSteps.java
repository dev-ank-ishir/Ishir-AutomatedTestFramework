package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.about.AboutPage;
import com.ishir.pages.about.EventsPage;
import com.ishir.pages.about.NewsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class NewsSteps {

    HomePage homePage = new HomePage(DriverFactory.getDriver());
    AboutPage aboutPage = homePage.aboutPageFromHomePage();
    NewsPage newsPage = homePage.newsPageFromHomePage();



    @And ("selects the News option")

    public void selectstheNewsoption() {

        newsPage.selectNewsMenu();

    }


    @Then("News page should appear")
    public void newsPageShouldAppear() {
        Assert.assertEquals(newsPage.doGetCurrentPageURL(),"https://www.ishir.com/inthenews-2.htm");
    }

    @Given("the user is on the News page")
    public void theUserIsOnTheNewsPage() {
    }

    @When("the user clicks the Stay Updated button on News Page")
    public void theUserClicksTheStayUpdatedButtonOnNewsPage() {

        homePage.allowCookie();
        aboutPage.openAboutDropDown();
        newsPage.selectNewsMenu();
        newsPage.clickStayUpdatedOverNewsPage();

    }
}
