package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataAnalyticsPage extends BasePage {
    By loc_DataAnalytics_Menu = By.linkText("Data & Analytics");

    By loc_getStarted_DataAnalytics_MainBanner = By.cssSelector("div.custom_button > a");

    By loc_getStarted_DataAnalytics_HowWeEngage = By.cssSelector("div#HowWeEngage a");

    public DataAnalyticsPage(WebDriver driver) {
        super(driver);
    }

    public void selectDataAnalyticsMenu() {
        hoverToElement(loc_DataAnalytics_Menu);
        doClickAction(loc_DataAnalytics_Menu);
    }

    public void selectGetStartedMainBannerDataAnalytics() {
        doClickAction(loc_getStarted_DataAnalytics_MainBanner);
    }

    public void selectGetStartedHowWeEngageSectionDataAnalytics() {
        doClickAction(loc_getStarted_DataAnalytics_HowWeEngage);
    }


}
