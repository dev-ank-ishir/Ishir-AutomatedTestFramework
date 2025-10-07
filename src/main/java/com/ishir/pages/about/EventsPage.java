package com.ishir.pages.about;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EventsPage extends BasePage {

    By loc_events_dropdown = By.linkText("Events");
    By loc_StayUpdated_button = By.cssSelector("div.custom_button>a");


    public EventsPage(WebDriver driver) {
        super(driver);
    }

    public void selectEventOption() {

        doClickAction(loc_events_dropdown);
    }

    public void selectStayUpdatedOption() {

        doClickAction(loc_StayUpdated_button);
    }


}
