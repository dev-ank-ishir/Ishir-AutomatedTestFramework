package com.ishir.pages;

import com.ishir.pages.about.AboutPage;
import com.ishir.pages.about.EventsPage;
import com.ishir.pages.about.NewsPage;
import com.ishir.pages.about.TeamPage;
import com.ishir.pages.base.BasePage;
import com.ishir.pages.insight.InsightPage;
import com.ishir.pages.services.mainMenu.AcceleratorPage;
import com.ishir.pages.services.mainMenu.SoftwareDevPage;
import com.ishir.pages.services.mainMenu.TalentAndSkillsPage;
import com.ishir.pages.services.mainMenu.AdvisoryServicesPage;
import com.ishir.pages.services.subMenu.*;
import com.ishir.pages.work.ClientsPage;
import com.ishir.pages.work.SuccessStoriesPage;
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

    private By loc_close_Popup = By.cssSelector("div#exitpopup");
    private By loc_Close_btn_Popup = By.cssSelector("div#exitpopup>div.closeExitPopup");

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


    public void clickLogo() {

        doClickAction(app_Logo);

    }


    public void handleCookieAndPopups() {

        try {
           
            if (isElementVisible(allowAllCookies)) {
                doClickAction(allowAllCookies);
                System.out.println("Allowed all cookies");
            }

          
            if (isElementVisible(loc_close_Popup)) {
                doClickAction(loc_Close_btn_Popup);
                System.out.println("✅ Closed exit popup");
            }

        } catch (Exception e) {
            System.out.println("No cookies or popup to handle: " + e.getMessage());
        }


    }


    public void closePopup() {

        doClickAction(closePopup);

    }

    public AboutPage aboutPageFromHomePage() {

        return new AboutPage(driver);
    }

    public TeamPage teamPageFromHomePage() {

        return new TeamPage(driver);
    }

    public EventsPage eventsPageFromHomePage() {

        return new EventsPage(driver);
    }


    public NewsPage newsPageFromHomePage() {

        return new NewsPage(driver);
    }

    public ClientsPage clientsFromHomePage() {

        return new ClientsPage(driver);
    }

    public SuccessStoriesPage successStoriesFromHomePage() {

        return new SuccessStoriesPage(driver);
    }

    public InsightPage insightPageFromHomePage() {

        return new InsightPage(driver);
    }

    public TalentAndSkillsPage talentAndSkillsPageFromHomePage() {

        return new TalentAndSkillsPage(driver);
    }

    public AdvisoryServicesPage advisoryServicesFromHomePage() {

        return new AdvisoryServicesPage(driver);

    }

    public SoftwareDevPage SoftwareDevPageFromHomePage() {

        return new SoftwareDevPage(driver);

    }

    public CustomSoftwareDevPage customSoftwareDevPageFromHomePage(){
        return new CustomSoftwareDevPage(driver);

    }

   public ProjectRescuePage projectRescuePageFromHomePage(){

       return new ProjectRescuePage(driver);

   }


  public MaintenanceSupportPage maintenanceSupportPageFromHomePage(){

      return new MaintenanceSupportPage(driver);

  }

    public OnDemandTalentPage OnDemandTalentPageFromHomePage(){

        return new OnDemandTalentPage(driver);

    }

    public AgileTeamPodsPage agileTeamPodsPageFromHomePage(){

        return new AgileTeamPodsPage(driver);


    }

    public GlobalCapabilityCentrePage globalCapabilityCentrePageFromHomePage(){

        return new GlobalCapabilityCentrePage(driver);


    }

    public EnterpriseAIPage EnterpriseAIPageFromHomePage(){

        return new EnterpriseAIPage(driver);


    }
    public DataAnalyticsPage dataAnalyticsPageFromHomePage(){

        return new DataAnalyticsPage(driver);


    }

    public AcceleratorPage acceleratorPageFromHomePage(){

        return new AcceleratorPage(driver);

    }


    public InnovationAcceleratorPage innovationAcceleratorPageFromHomePage(){

        return new InnovationAcceleratorPage(driver);

    }

    public DataAIAcceleratorPage dataAIAcceleratorPageFromHomePage(){

        return new DataAIAcceleratorPage(driver);

    }

    public SoftwareProductDevelopmentPage softwareProductDevelopmentPage(){

        return new SoftwareProductDevelopmentPage(driver);
    }

    public TalentAndSkillsPage talentAndSkillsPage(){

        return new TalentAndSkillsPage(driver);


    }
}
