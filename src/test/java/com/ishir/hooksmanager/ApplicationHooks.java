package com.ishir.hooksmanager;

import com.ishir.factory.DriverFactory;
import com.ishir.utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.mail.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ApplicationHooks {

    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;

    Properties prop;

    static int i=0;

    Scenario scenario;

    @Before(order = 0)

    public void getProperty() {

        configReader = new ConfigReader();

        prop = configReader.init_Props();
    }

    @Before (order = 1)

    public void getBrowserName() {

        String browserName = prop.getProperty("browser");

       System.out.println("The Selected Browser Name is : " + browserName);

        driverFactory = new DriverFactory();

      driver = driverFactory.init_Driver(browserName);

    }


    @Before(order = 2)

    public void getAppLicationURL() {

        String applicationURL = prop.getProperty("appURL");

        System.out.println("The Application URL is : " + applicationURL);

        driver.get(applicationURL);


    }




 @After(order = 0)

  public void quitBrowser() throws InterruptedException {

       Thread.sleep(25000);

     // driver.quit();

}

    @After(order = 1)

    public void tearDown(Scenario scenario) {

     if (scenario.isFailed()) {

         String screenshotName=scenario.getName().replaceAll(" ","_");

         System.out.println(scenario.getName()+screenshotName);

          byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);

                scenario.attach(sourcePath,"image/png",screenshotName);




     }
         }


    @After(order = 1)

    public void sendEmailOnFailure(Scenario scenario) throws EmailException {

        if (scenario.isFailed()){

            Email email = new SimpleEmail();

            EmailAttachment emailAttachment= new EmailAttachment();
            email.setHostName(prop.getProperty("Email_SMTPHostName"));
            email.setSmtpPort(Integer.valueOf(prop.getProperty("Email_PortNumber")));
            email.setAuthenticator(new DefaultAuthenticator(prop.getProperty("Email_UserName"), prop.getProperty("Email_Password")));
            email.setStartTLSEnabled(true);
            //email.setSSLOnConnect(true);
            email.setFrom(prop.getProperty("Email_UserName"));
            email.setSubject("Scenario Failed:"+scenario.getSourceTagNames());
            email.setMsg("Failed Scenario: "+scenario.getName());
            email.addTo("ankit@eno8.com");
            email.addTo(prop.getProperty("Email_UserName"));
            email.send();

        }


    }



    }



