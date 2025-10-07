package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomSoftwareDevPage extends BasePage {
    By loc_SoftDev_Support = By.linkText("Software Development & Support");
    By loc_Custom_Dev = By.linkText("Custom Software Development");

    By loc_btn_GetStarted = By.cssSelector("div.custom_button>a");

    public CustomSoftwareDevPage(WebDriver driver) {
        super(driver);
    }


    public void hoverSoftDevMenu() {

        hoverToElement(loc_SoftDev_Support);


    }

    public void clickCustomSoftwareDevelopmentMenu() {

        doClickAction(loc_Custom_Dev);
    }

    public void clickGetStartedButton() {

        doClickAction(loc_btn_GetStarted);
    }

}
