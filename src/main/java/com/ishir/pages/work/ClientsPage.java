package com.ishir.pages.work;

import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientsPage extends BasePage {

    By btn_Innovation = By.cssSelector("div.custom_button>a");
    By link_letsTalk = By.cssSelector("a.contentLink");

    By link_Work = By.linkText("Work");

    By link_Clients = By.linkText("Clients");

    public ClientsPage(WebDriver driver) {
        super(driver);
    }

    public void clickWorkMenu() {

        doClickAction(link_Work);

    }


    public void selectClientsOption() {

        doClickAction(link_Clients);

    }

    public void clickInnovationJourney() {

        doClickAction(btn_Innovation);
    }

    public void clickLetsTak() {

        doClickAction(link_letsTalk);
    }

    public String getClientPageURL() {

        return doGetCurrentPageURL();
    }

}
