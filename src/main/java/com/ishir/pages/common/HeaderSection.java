package com.ishir.pages.common;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderSection extends BasePage {

    private By GetStarted_header = By.cssSelector("li.get_started>a");
    private By loc_App_Logo_Header = By.cssSelector("img[title='ISHIR']");


    public HeaderSection(WebDriver driver) {
        super(driver);
    }


    public void clickGetStartedHeader() {

        doClickAction(GetStarted_header);

    }

    public void clickApplicationHeaderLogo() {

        doClickAction(loc_App_Logo_Header);

    }



}
