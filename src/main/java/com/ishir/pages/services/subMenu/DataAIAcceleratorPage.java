package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DataAIAcceleratorPage extends BasePage {
    public DataAIAcceleratorPage(WebDriver driver) {
        super(driver);
    }

    // Locators
    By loc_DataAIAccelerator_Menu = By.linkText("Data+AI Accelerator");
    By loc_getStartedMainBanner = By.cssSelector("section#inner_banner div.custom_button>a");
    By loc_getStartedReadyToAccelerateSection = By.cssSelector("div#ReadytoAccelerateAIwithISHIR a");

    // Methods

    public void selectDataAIAcceleratorMenu() {
        hoverToElement(loc_DataAIAccelerator_Menu);
        doClickAction(loc_DataAIAccelerator_Menu);
    }

    public void selectGetStartedMainBannerDataAIAccelerator() {
        doClickAction(loc_getStartedMainBanner);
    }

    public void selectGetStartedReadyToAccelerateSection() {
        doClickAction(loc_getStartedReadyToAccelerateSection);
    }




}
