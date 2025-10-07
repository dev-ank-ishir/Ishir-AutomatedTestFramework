
package com.ishir.pages.work;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessStoriesPage extends BasePage {

    By link_success_stories = By.linkText("Success Stories");
    By link_View_CaseStudy = By.cssSelector("div#casestudy0 a");
    By link_contact_us_today = By.linkText("Contact Us Today!");

    public SuccessStoriesPage(WebDriver driver) {
        super(driver);
    }


    public void clickSuccessStoriesLink() {
        doClickAction(link_success_stories);

    }

    public void clickViewCaseStudyLink() {

        doClickAction(link_View_CaseStudy);
    }

    public void clickContactUsLink() {

        doClickAction(link_contact_us_today);
    }

}
