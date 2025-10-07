package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.utils.LogsHandler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

public class HomePageSteps {

    private HomePage homePage = new HomePage(DriverFactory.getDriver());
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Given("the user is on the Home page")
    public void the_user_is_on_the_Home_page() {
        System.out.println();
    }

    @When("the user clicks the Get Started button in the header")
    public void userClicksGetStartedButtonInHeader() {
        homePage.allowCookie();
        homePage.clikcGetStartedHeader();


    }

    @Then("the Get in Touch form should appear")
    public void getInTouchFormAppears() {

        Assert.assertEquals(homePage.getCurrentPageTitle(),"Get in Touch | Hire Developers | Contact Our Tech Experts | 24/7 Support | India, Dallas, Tx - ISHIR");
        Assert.assertEquals(homePage.getCurrentPageURL(),"https://www.ishir.com/get-in-touch.htm");
        logger.info("Latest Get In Touch Form Appeared");

    }

    @When("the user clicks the Get Started button in the page content")
    public void userClicksGetStartedButtonInPageContent() {

        homePage.allowCookie();
        homePage.clikcGetStartedPageContent();


    }

    @When("the user clicks the Get Started button in the Ready to Start section")
    public void userClicksGetStartedButtonInReadyToStartSection() {

        homePage.allowCookie();
        homePage.clikcGetStartedReadyToStart();

    }
}
