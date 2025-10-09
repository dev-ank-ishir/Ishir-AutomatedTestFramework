package com.ishir.pages.about;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewsPage extends BasePage {

    By loc_News_Menu = By.linkText("In the News");
    By loc_news_stayUpdated = By.cssSelector("Stay Updated");

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    public void selectNewsMenu() {
        doClickAction(loc_News_Menu);

    }

    public void clickStayUpdatedOverNewsPage() {
        doClickAction(loc_news_stayUpdated);


    }


}
