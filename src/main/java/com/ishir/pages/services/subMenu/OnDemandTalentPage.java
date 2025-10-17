package com.ishir.pages.services.subMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnDemandTalentPage extends BasePage {

    By loc_OndemandTalent_menu= By.linkText("On-Demand Talent");
    By loc_getStarted_OndemandTalent=By.cssSelector("div.custom_button>a");
    public OnDemandTalentPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnDemandTalentMenu(){

        doClickAction(loc_OndemandTalent_menu);

    }

    public void clickGetStartedOverOnDemandTalentPage(){

        doClickAction(loc_getStarted_OndemandTalent);


    }



}
