package com.ishir.pages.services.mainMenu;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SoftwareDevPage extends BasePage {

    By loc_SoftwareDevSupport = By.linkText("Software Development & Support");
    By loc_Start_Your_Project = By.cssSelector("div.custom_button>a");

    public SoftwareDevPage(WebDriver driver) {
        super(driver);
    }

    public void selectSoftwareDevSupportMenu() {

        doClickAction(loc_SoftwareDevSupport);


    }

    public void clickStartYourProjectToday() {

        doClickAction(loc_Start_Your_Project);

    }


}
