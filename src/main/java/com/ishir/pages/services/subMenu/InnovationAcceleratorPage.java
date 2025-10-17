package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InnovationAcceleratorPage extends BasePage {
    public InnovationAcceleratorPage(WebDriver driver) {
        super(driver);
    }

    By loc_InnovationAccelerator_Menu = By.linkText("Innovation Accelerator");
    By loc_getStartedMainBanner = By.cssSelector("div.custom_button > a");
    By loc_startInnovationJourneySection = By.cssSelector("div#InnovationAccelerator a");
    By loc_getStartedReadyToInnovateSection = By.cssSelector("div#ReadyToInnovate a");

    // Methods

    public void selectInnovationAcceleratorMenu() {
        hoverToElement(loc_InnovationAccelerator_Menu);
        doClickAction(loc_InnovationAccelerator_Menu);
    }

    public void selectGetStartedMainBannerInnovationAccelerator() {
        doClickAction(loc_getStartedMainBanner);
    }

    public void selectStartInnovationJourneySection() {
        doClickAction(loc_startInnovationJourneySection);
    }

    public void selectGetStartedReadyToInnovateSection() {
        doClickAction(loc_getStartedReadyToInnovateSection);
    }

}
