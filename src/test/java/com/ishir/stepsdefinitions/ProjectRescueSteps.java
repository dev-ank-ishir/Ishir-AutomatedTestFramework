package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.ProjectRescuePage;
import com.ishir.pages.services.subMenu.DigitalProductDevelopmentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProjectRescueSteps {

    HomePage homePage=new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage advisoryServicesPage = homePage.advisoryServicesFromHomePage();
    ProjectRescuePage projectRescuePage=homePage.projectRescuePageFromHomePage();
    DigitalProductDevelopmentPage digitalProductDevelopmentPage =homePage.fromDigitalProductDevelopmentPage();



    @And("click Project Rescue Menu")
    public void clickProjectRescueMenu() throws InterruptedException {
        projectRescuePage.selectProjectRescueMenu();
    }

    @Then("Project Rescue page should appear")
    public void projectRescuePageShouldAppear() {

        Assert.assertEquals(projectRescuePage.doGetCurrentPageURL(),"https://www.ishir.com/project-rescue.htm");
    }

    @Given("the user is on the Project Rescue page")
    public void theUserIsOnTheProjectRescuePage() {
    }


    @When("the user clicks Get Started on main banner")
    public void theUserClicksGetStartedOnMainBanner() {
        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        digitalProductDevelopmentPage.selectDigitalProductInnovationMenu();
        projectRescuePage.selectProjectRescueMenu();
        projectRescuePage.clickGetStarted();


    }

    @When("the user clicks Get Started on under common issues section")
    public void theUserClicksGetStartedOnUnderCommonIssuesSection() {

        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        digitalProductDevelopmentPage.selectDigitalProductInnovationMenu();
        projectRescuePage.selectProjectRescueMenu();
        projectRescuePage.clickGetStartedCommonIssues();

    }

    @When("the user clicks Get Started on under how we engage section")
    public void theUserClicksGetStartedOnUnderHowWeEngageSection() {

        homePage.handleCookieAndPopups();
        advisoryServicesPage.selectServicesMenu();
        digitalProductDevelopmentPage.selectDigitalProductInnovationMenu();
        projectRescuePage.selectProjectRescueMenu();
        projectRescuePage.clickGetStartedHowWeEngage();

    }
}
