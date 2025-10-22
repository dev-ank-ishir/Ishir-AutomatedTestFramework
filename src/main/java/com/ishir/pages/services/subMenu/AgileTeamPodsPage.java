package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgileTeamPodsPage extends BasePage {

    By loc_agileTeamPods_menu = By.linkText("Agile Team Pods");
    By loc_GetStarted_Main_AgilePods = By.cssSelector("div.custom_button>a");
    By loc_GetStarted_Engage_AgilePods = By.cssSelector("div#HowWeEngage a");

    public AgileTeamPodsPage(WebDriver driver) {
        super(driver);
    }


    public void clickAgileTeamPodsMenu() {
        hoverToElement(loc_agileTeamPods_menu);
        doClickAction(loc_agileTeamPods_menu);
    }

    public void clickGetStartedMainBannerAgileTeamPods() {
        doClickAction(loc_GetStarted_Main_AgilePods);
    }


    public void clickGetStartedHowWeEngageAgileTeamPods() {
        doClickAction(loc_GetStarted_Engage_AgilePods);
    }
}
