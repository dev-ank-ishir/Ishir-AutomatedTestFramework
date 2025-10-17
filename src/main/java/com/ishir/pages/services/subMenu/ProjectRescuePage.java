package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectRescuePage extends BasePage {

    By loc_ProjectRescue = By.linkText("Project Rescue");
    By loc_GetStarted_main = By.cssSelector("div.inner_Banner_New a");

    By loc_GetStarted_CommonIssues=By.cssSelector("div#CommonIssues a");

    By loc_GetStarted_Engage=By.cssSelector("div#HowWeEngage a");


    public ProjectRescuePage(WebDriver driver) {
        super(driver);
    }


    public void selectProjectRescueMenu() {
        hoverToElement(loc_ProjectRescue);
        doClickAction(loc_ProjectRescue);

    }

    public void clickGetStarted() {

        doClickAction(loc_GetStarted_main);
    }

    public void clickGetStartedCommonIssues() {

        doClickAction(loc_GetStarted_CommonIssues);
    }

    public void clickGetStartedHowWeEngage() {

        doClickAction(loc_GetStarted_Engage);
    }

}
