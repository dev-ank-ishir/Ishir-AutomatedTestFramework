package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SoftwareProductDevelopmentPage extends BasePage {


    By loc_DigitalInnovation_menu = By.linkText("Digital Innovation");
    By loc_softwareProduct_Dev_menu = By.linkText("Software Product Development");
    By loc_getStarted_main_Dev = By.cssSelector("section#inner_banner div.custom_button a");
    By loc_getStarted_ProductJourney = By.cssSelector("div.product_journey a");


    public SoftwareProductDevelopmentPage(WebDriver driver) {
        super(driver);
    }

    public void selectDigitalInnovationMenu() {
        hoverToElement(loc_DigitalInnovation_menu);
    }

    public void selectSoftwareProductDevMenu() {
        hoverToElement(loc_DigitalInnovation_menu);
        doClickAction(loc_softwareProduct_Dev_menu);
    }

    public void selectGetStartedMainBannerSoftwareProductDevMenu() {
        doClickAction(loc_getStarted_main_Dev);
    }

    public void selectGetStartedProductJourneySoftwareProductDevMenu() {
        doClickAction(loc_getStarted_ProductJourney);
    }


}
