package com.ishir.pages.services.mainMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaffingPage extends BasePage {

    public StaffingPage(WebDriver driver) {

        super(driver);
    }

    By loc_Staffing = By.cssSelector("li#menu-item-166990>a");
    By loc_GetStarted_main = By.cssSelector("div.custom_button>a");

    By loc_GetInTouch_bottom = By.cssSelector("div#GetStartedToday a");


    public void selectStaffingMenu() {

        doClickAction(loc_Staffing);

    }

    public void clickGetStartedMain() {

        doClickAction(loc_GetStarted_main);

    }

    public void clickGetStartedBottom() {

        doClickAction(loc_GetInTouch_bottom);

    }

    public void hoverStaffingMenu() {

        hoverToElement(loc_Staffing);

    }

}




