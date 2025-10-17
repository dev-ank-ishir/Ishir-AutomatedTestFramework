package com.ishir.pages.services.mainMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdvisoryServicesPage extends BasePage {

    By loc_startJounery = By.linkText("Start Your Journey");
    By loc_Advisory = By.linkText("Advisory Services");

    By loc_Services = By.linkText("Services");

    By loc_Schedule_Consultation = By.cssSelector("div#GetStartedToday a");

    By loc_learn_more = By.cssSelector("div#Reachouttous a");


    public AdvisoryServicesPage(WebDriver driver) {
        super(driver);
    }

    public void selectServicesMenu() {

        doClickAction(loc_Services);

    }


    public void selectAdvisoryMenu() {


        doClickAction(loc_Advisory);
    }

    public void clickStartJourney() {

        doClickAction(loc_startJounery);

    }

    public void clickScheduleConsultation() {

        doClickAction(loc_Schedule_Consultation);

    }

    public void clickLearnMore() {

        doClickAction(loc_learn_more);

    }




}



