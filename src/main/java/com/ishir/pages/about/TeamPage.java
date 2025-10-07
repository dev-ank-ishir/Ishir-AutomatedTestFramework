package com.ishir.pages.about;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TeamPage extends BasePage {


    By btn_getStarted = By.cssSelector("div.custom_button>a");
    By TeamLink = By.linkText("Team");

    public TeamPage(WebDriver driver) {
        super(driver);
    }

    public void selectTeamOption() {
        doClickAction(TeamLink);

    }

    public void clickGetStartedTeamsPage() {
        doClickAction(btn_getStarted);

    }



}
