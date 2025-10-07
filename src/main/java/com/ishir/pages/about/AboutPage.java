package com.ishir.pages.about;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutPage extends BasePage {

    By AboutLink = By.linkText("About");
    By OurStoryLink = By.linkText("Our Story");

    By loc_btn_getStarted=By.cssSelector("div.custom_button>a");

    By loc_close_Popup=By.cssSelector("div#exitpopup");
    By loc_Close_btn_Popup=By.cssSelector("div#exitpopup>div.closeExitPopup");

    private By allowAllCookies = By.cssSelector("button[id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");


    public AboutPage(WebDriver driver) {
        super(driver);
    }


    public void openAboutDropDown() {

        doClickAction(AboutLink);
    }

    public void selectOurStoryOption() {
        doClickAction(OurStoryLink);

    }

    public void clickGetStartedButton() {
        doClickAction(loc_btn_getStarted);

    }

    public void checkAndDismissPopup() {

        if (isElementVisible(loc_close_Popup)) {

            doClickAction(loc_Close_btn_Popup);

        }

    }

    public void allowCookie() {

        doClickAction(allowAllCookies);

    }




}
