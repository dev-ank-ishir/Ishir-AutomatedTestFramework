package com.ishir.pages.about;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompanyPage extends BasePage {

    By AboutLink = By.linkText("About");
    By companyLink = By.linkText("Company");
    By loc_btn_getStarted_Banner = By.cssSelector("div.custom_button>a");
    By loc_btn_getStarted_Engage = By.cssSelector("div[class*='how_we_engage'] a");


    public CompanyPage(WebDriver driver) {
        super(driver);
    }


    public void openAboutDropDown() {
        doClickAction(AboutLink);
    }

    public void selectCompanyOption() {
        doClickAction(companyLink);
    }

    public void clickGetStartedButtonBanner() {
        doClickAction(loc_btn_getStarted_Banner);
    }

    public void clickGetStartedButtonEnagage() {
        doClickAction(loc_btn_getStarted_Engage);
    }

}





