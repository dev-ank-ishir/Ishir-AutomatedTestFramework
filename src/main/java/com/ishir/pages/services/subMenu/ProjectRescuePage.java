package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectRescuePage extends BasePage {

    By loc_ProjectRescue = By.linkText("Project Rescue");
    By loc_GetStarted = By.cssSelector("custom_button");


    public ProjectRescuePage(WebDriver driver) {
        super(driver);
    }


    public void selectProjectRescueMenu() {
        hoverToElement(loc_ProjectRescue);
        doClickAction(loc_ProjectRescue);

    }

    public void clickGetStarted() {

        doClickAction(loc_GetStarted);
    }


}
