package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcceleratorPage extends BasePage {

    public AcceleratorPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    By loc_Accelerator_Menu = By.linkText("Accelerator");
    By loc_getStarted_MainBanner = By.cssSelector("div.custom_button > a");
    By loc_getStarted_AccelerateYourSuccess = By.cssSelector("div#ScheduleaConsultation a");

    // Actions
    public void selectAcceleratorMenu() {
        hoverToElement(loc_Accelerator_Menu);
        doClickAction(loc_Accelerator_Menu);
    }

    public void selectGetStartedMainBanner() {
        doClickAction(loc_getStarted_MainBanner);
    }

    public void selectGetStartedAccelerateYourSuccessSection() {
        doClickAction(loc_getStarted_AccelerateYourSuccess);
    }

    public void hoverOverAcceleratorMenu() {
        hoverToElement(loc_Accelerator_Menu);
    }
}
