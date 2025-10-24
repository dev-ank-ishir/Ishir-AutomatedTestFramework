package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DigitalProductDevelopmentPage extends BasePage {


    By loc_DigitalProductInnovation_menu = By.linkText("Digital Product Innovation");
    By loc_digitalProduct_Dev_menu = By.linkText("Digital Product Development");
    By loc_getStarted_main_Dev = By.cssSelector("section#inner_banner div.custom_button a");
    By loc_getStarted_ProductJourney = By.cssSelector("div.product_journey a");


    public DigitalProductDevelopmentPage(WebDriver driver) {
        super(driver);
    }

    public void selectDigitalProductInnovationMenu() {
        hoverToElement(loc_DigitalProductInnovation_menu);
    }

    public void selectDigitalProductDevMenu() {
        hoverToElement(loc_digitalProduct_Dev_menu);
        doClickAction(loc_digitalProduct_Dev_menu);
    }

    public void selectGetStartedMainBannerDigitalProductDevMenu() {
        doClickAction(loc_getStarted_main_Dev);
    }

    public void selectGetStartedProductJourneyDigitalProductDevMenu() {
        doClickAction(loc_getStarted_ProductJourney);
    }


}
