package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterpriseAIPage extends BasePage {

    By loc_EnterpriseAI_Menu = By.linkText("Enterprise AI");
    By loc_DataAI_Menu = By.linkText("Data + AI");
    By loc_getStarted_EnterPriseAI_MainBanner = By.cssSelector("div.custom_button>a");
    By loc_getStarted_EnterPriseAI_HowWeEngage = By.cssSelector("div#HowWeEngage a");

    public EnterpriseAIPage(WebDriver driver) {
        super(driver);
    }


    public void hoversDataAIMenu() {

        hoverToElement(loc_DataAI_Menu);
        doClickAction(loc_DataAI_Menu);

    }
    public void selectEnterpriseAIMenu() {

        hoverToElement(loc_EnterpriseAI_Menu);
        doClickAction(loc_EnterpriseAI_Menu);
    }

    public void selectGetStartedMainBannerEnterpriseAI() {

        doClickAction(loc_getStarted_EnterPriseAI_MainBanner);
    }

    public void selectGetStartedHowWeEngageSectionEnterpriseAI() {

        doClickAction(loc_getStarted_EnterPriseAI_HowWeEngage);
    }



}
