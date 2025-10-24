package com.ishir.pages.about;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EventsPage extends BasePage {
    By loc_events_dropdown = By.linkText("Events");
    By loc_StayUpdated_button = By.cssSelector("div.custom_button>a");
    By loc_readMore_events = By.cssSelector("div.blogger a");

    By loc_TrendingBlog = By.cssSelector("div.rpwe-block a");

    By loc_LetsTalk = By.cssSelector("div.threeBox");

    By loc_getStarted_BlogsPage = By.cssSelector("div.linkWrapper>a");

    By loc_iframe_AI_ToastMsg=By.cssSelector("ai-welcome-msg-close-button");
    By loc_AI_Toast_frame=By.id("hubspot-conversations-iframe");

    public EventsPage(WebDriver driver) {
        super(driver);
    }

    public void selectEventOption() {

        doClickAction(loc_events_dropdown);
    }

    public void selectStayUpdatedOption() {

        doClickAction(loc_StayUpdated_button);
    }

    public void selectReadMoreEventLink() {

        doClickAction(loc_readMore_events);
    }

    public void selectTrendingBlogLink() {

        doClickAction(loc_TrendingBlog);
    }

    public void selectLetsTalkWidget() {

        getElementsList(loc_LetsTalk).get(0).click();
    }

    public void clickGetStartedBlogsPage() {

       // doSwitchToFrame(loc_AI_Toast_frame);
       // doClickAction(loc_iframe_AI_ToastMsg);
        getElementsList(loc_getStarted_BlogsPage).get(0).click();
    }

}
