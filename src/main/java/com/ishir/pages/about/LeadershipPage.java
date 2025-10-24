package com.ishir.pages.about;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadershipPage extends BasePage {
    By btn_getStarted = By.cssSelector("div.custom_button>a");
    By leadershipLink = By.linkText("Leadership");

    public LeadershipPage(WebDriver driver) {
        super(driver);
    }

    public void selectLeadershipOption() {
        doClickAction(leadershipLink);
    }

    public void clickGetStartedLeadershipPage() {
        doClickAction(btn_getStarted);
    }
}
