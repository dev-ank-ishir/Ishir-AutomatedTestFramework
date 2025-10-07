package com.ishir.stepsdefinitions;

import com.ishir.factory.DriverFactory;
import com.ishir.pages.HomePage;
import com.ishir.pages.services.mainMenu.StrategicAdvisoryPage;
import com.ishir.pages.services.subMenu.CustomSoftwareDevPage;
import com.ishir.pages.services.subMenu.ProjectRescuePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProjectRescueSteps {

    HomePage homePage=new HomePage(DriverFactory.getDriver());
    StrategicAdvisoryPage StrategicAdvisoryPage = new StrategicAdvisoryPage(DriverFactory.getDriver());
    ProjectRescuePage projectRescuePage=new ProjectRescuePage(DriverFactory.getDriver());

    CustomSoftwareDevPage customSoftwareDevPage=new CustomSoftwareDevPage(DriverFactory.getDriver());

    @And("click Project Rescue Menu")
    public void clickProjectRescueMenu() throws InterruptedException {

        homePage.allowCookie();
        StrategicAdvisoryPage.selectServicesMenu();
        customSoftwareDevPage.hoverSoftDevMenu();
        Thread.sleep(6000);
        projectRescuePage.selectProjectRescueMenu();
    }

    @Then("Project Rescue page should appear")
    public void projectRescuePageShouldAppear() {
    }

    @Given("the user is on the Project Rescue page")
    public void theUserIsOnTheProjectRescuePage() {
    }

    @When("the user clicks Get Started on Project Rescue page")
    public void theUserClicksGetStartedOnProjectRescuePage() throws InterruptedException {

        homePage.allowCookie();
        StrategicAdvisoryPage.selectServicesMenu();
        Thread.sleep(8000);
        customSoftwareDevPage.hoverSoftDevMenu();
        projectRescuePage.selectProjectRescueMenu();
        projectRescuePage.clickGetStarted();

    }
}
