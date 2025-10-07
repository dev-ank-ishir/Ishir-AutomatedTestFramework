package com.ishir.pages;

import com.ishir.pages.about.AboutPage;
import com.ishir.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

  //  private WebDriver driver;

    //---By Locators--------------


    private By uname = By.xpath("//input[@name='identifier']");
    private By pwd = By.xpath("//input[@name='Passwd']");
    private By btnemailNext = By.id("identifierNext");
    private By btnPwdNext = By.id("passwordNext");
    private By landingPageTitle = By.xpath("//div/a[@title='Gmail']");
    private By GetStarted_header = By.cssSelector("li.get_started>a");
    private By GetStarted_Pagecontent = By.cssSelector("div.page_content a");
    private By GetStarted_ReadyToSart = By.cssSelector("div.ready_to_start_cta a");

    private By app_Logo = By.className("div.logo");

    private By allowAllCookies = By.cssSelector("button[id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']");

    private By closePopup = By.cssSelector("div.closeExitPopup");

    //---Page class constructor------
    public HomePage(WebDriver driver) {
        super(driver);
        //this.driver=driver;

    }


    //---Page class actions------


    public void launchBrowser() {

        //  driver.get(prop.getProperty("appURL"));
    }

    public String getHomePageTitle() {

        return getCurrentPageTitle();

    }

    public void clikcGetStartedHeader() {

        doClickAction(GetStarted_header);

    }

    public void clikcGetStartedPageContent() {

        doClickAction(GetStarted_Pagecontent);

    }

    public void clikcGetStartedReadyToStart() {

        doClickAction(GetStarted_ReadyToSart);

    }


    public String getCurrentPageURL() {

        return doGetCurrentPageURL();
    }


    public void clikcLogo() {

        doClickAction(app_Logo);

    }


    public void allowCookie() {

        doClickAction(allowAllCookies);

    }

    public void closePopup() {

        doClickAction(closePopup);

    }

    public AboutPage fromHomePage(){

        return new AboutPage(driver);
    }


}
