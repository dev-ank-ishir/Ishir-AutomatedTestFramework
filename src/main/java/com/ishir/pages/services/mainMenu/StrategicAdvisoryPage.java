package com.ishir.pages.services.mainMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StrategicAdvisoryPage extends BasePage {

    By loc_startJounery = By.linkText("Start Your Journey");
    By loc_strategy = By.linkText("Strategic & Advisory");

    By loc_Services = By.linkText("Services");

    By loc_GetInTouch_bottom = By.cssSelector("div#GetStartedToday a");


    public StrategicAdvisoryPage(WebDriver driver) {
        super(driver);
    }

    public void selectServicesMenu() {

        doClickAction(loc_Services);

    }


    public void selectStrategicMenu() {


        doClickAction(loc_strategy);
    }

    public void clickStartJourney() {

        doClickAction(loc_startJounery);

    }


}



