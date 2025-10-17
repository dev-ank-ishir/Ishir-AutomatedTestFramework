package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GlobalCapabilityCentrePage extends BasePage {

    By loc_GlobalCapabilityCentre_menu= By.linkText("Global Capacity Center");
    By loc_getStarted_GlobalCapabilityCentre=By.cssSelector("div.custom_button>a");
    public GlobalCapabilityCentrePage(WebDriver driver) {
        super(driver);
    }

    public void clickGlobalCapabilityCentreMenu(){

        doClickAction(loc_GlobalCapabilityCentre_menu);

    }

    public void clickGetStartedOverGlobalCapabilityCentrePage(){

        doClickAction(loc_getStarted_GlobalCapabilityCentre);


    }




}
