package com.ishir.pages.services.mainMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TalentAndSkillsPage extends BasePage {

    public TalentAndSkillsPage(WebDriver driver) {
        super(driver);
    }

    By loc_TalentAndSkills = By.linkText("Talent & Skills");
    By loc_GetStarted_main = By.cssSelector("div.custom_button>a");
    By loc_GetInTouch_bottom = By.cssSelector("div#GetStartedToday a");

    public void selectTalentAndSkillsMenu() {
        hoverToElement(loc_TalentAndSkills);
        doClickAction(loc_TalentAndSkills);
    }

    public void clickGetStartedMain() {
        doClickAction(loc_GetStarted_main);
    }

    public void clickGetStartedBottom() {
        doClickAction(loc_GetInTouch_bottom);
    }

    public void hoverTalentAndSkillsMenu() {
        hoverToElement(loc_TalentAndSkills);
    }
}
