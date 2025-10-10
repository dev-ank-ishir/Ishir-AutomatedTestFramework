package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.insight.InsightPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InsightPageSteps {

    private HomePage homePage = new HomePage(DriverFactory.getDriver());
    private InsightPage insightPage = homePage.insightPageFromHomePage();
    @When("the user clicks the Insight option")
    public void theUserClicksTheInsightOption() {

        homePage.handleCookieAndPopups();
        insightPage.clickInsightLink();
    }

    @Then("Insight page should appear")
    public void insightPageShouldAppear() {
        Assert.assertEquals(insightPage.doGetCurrentPageURL(),"https://www.ishir.com/blog.htm");
    }

    @Given("the user is on the Insight page")
    public void theUserIsOnTheInsightPage() {
    }

    @When("the user clicks the Read More link")
    public void theUserClicksTheReadMoreLink() {

        homePage.handleCookieAndPopups();
        insightPage.clickInsightLink();
        insightPage.clickReadMoreLink();

    }

    @And("user clicks Get Started button over Insight detail")
    public void userClicksGetStartedButtonOverInsightDetail() {

        insightPage.clickGetStartedWithinInsight();
    }
}
