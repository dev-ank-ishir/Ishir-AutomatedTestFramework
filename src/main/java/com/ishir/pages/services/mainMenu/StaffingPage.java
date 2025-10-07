package com.ishir.pages.services.mainMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaffingPage extends BasePage {

    public StaffingPage(WebDriver driver) {

        super(driver);
    }

    By loc_Staffing = By.linkText("Staffing & Augmentation");
    By loc_GetStarted = By.cssSelector("div.custom_button>a");

    public void selectStaffingMenu() {

        doClickAction(loc_Staffing);

    }

    public void clickGetStarted() {

        doClickAction(loc_GetStarted);

    }


}




