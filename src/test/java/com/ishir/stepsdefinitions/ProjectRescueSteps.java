package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.CustomSoftwareDevPage;
import com.ishir.pages.services.subMenu.ProjectRescuePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProjectRescueSteps {

    HomePage homePage=new HomePage(DriverFactory.getDriver());
    AdvisoryServicesPage AdvisoryServicesPage = homePage.advisoryServicesFromHomePage();
    CustomSoftwareDevPage customSoftwareDevPage=homePage.customSoftwareDevPageFromHomePage();
    ProjectRescuePage projectRescuePage=homePage.projectRescuePageFromHomePage();


    @And("click Project Rescue Menu")
    public void clickProjectRescueMenu() throws InterruptedException {

        AdvisoryServicesPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
        projectRescuePage.selectProjectRescueMenu();
    }

    @Then("Project Rescue page should appear")
    public void projectRescuePageShouldAppear() {

        Assert.assertEquals(projectRescuePage.doGetCurrentPageURL(),"https://www.ishir.com/project-rescue.htm");
    }

    @Given("the user is on the Project Rescue page")
    public void theUserIsOnTheProjectRescuePage() {
    }

    @When("the user clicks Get Started on Project Rescue page")
    public void theUserClicksGetStartedOnProjectRescuePage() throws InterruptedException {

        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
        projectRescuePage.selectProjectRescueMenu();
        projectRescuePage.clickGetStarted();

    }

    @When("the user clicks Get Started on main banner")
    public void theUserClicksGetStartedOnMainBanner() {
        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
        projectRescuePage.selectProjectRescueMenu();
        projectRescuePage.clickGetStarted();

    }

    @When("the user clicks Get Started on under common issues section")
    public void theUserClicksGetStartedOnUnderCommonIssuesSection() {

        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
        projectRescuePage.selectProjectRescueMenu();
        projectRescuePage.clickGetStartedCommonIssues();

    }

    @When("the user clicks Get Started on under how we engage section")
    public void theUserClicksGetStartedOnUnderHowWeEngageSection() {

        homePage.handleCookieAndPopups();
        AdvisoryServicesPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
        projectRescuePage.selectProjectRescueMenu();
        projectRescuePage.clickGetStartedHowWeEngage();

    }
}
