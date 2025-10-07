package com.ishir.pages.insight;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InsightPage extends BasePage {

    By readMoreLink= By.cssSelector("div.date_and_link a");
    By insightMenu= By.linkText("Insights");

    By linkGetStarted=By.linkText("Get Started");

    public InsightPage(WebDriver driver) {
        super(driver);
    }

    public void clickInsightLink(){

        doClickAction(insightMenu);
    }

    public void clickReadMoreLink(){

        doClickAction(readMoreLink);

    }

    public void clickGetStartedWithinInsight(){

        doClickAction(linkGetStarted);

    }




}
