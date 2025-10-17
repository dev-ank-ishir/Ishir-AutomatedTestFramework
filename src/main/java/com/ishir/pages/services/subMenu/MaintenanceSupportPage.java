package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MaintenanceSupportPage extends BasePage {

    By loc_maintenance_menu = By.linkText("Maintenance & Support");
    By loc_getStarted_MaintenanceSupport = By.cssSelector("div.custom_button>a");

    public MaintenanceSupportPage(WebDriver driver) {
        super(driver);
    }


    public void clickMaintenanceSupportMenu() {

        doClickAction(loc_maintenance_menu);
    }

    public void clickGetStaredMaintenanceSupport() {

        doClickAction(loc_maintenance_menu);

    }

    public void hoverMaintenanceSupportMenu() {

        hoverToElement(loc_maintenance_menu);
    }



}
