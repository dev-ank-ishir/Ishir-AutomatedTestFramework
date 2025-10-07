package com.ishir.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverFactory {

    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();



    public WebDriver init_Driver (String browser) {

        System.out.println("The Browser Value is : " + browser );


        if (browser.equals("Chrome")) {

            WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());

        }

        else if (browser.equals("Firefox")) {

            WebDriverManager.firefoxdriver().driverVersion("0.29.1").setup();

            tlDriver.set(new FirefoxDriver());


        }

        else if (browser.equals("Edge")) {

            WebDriverManager.edgedriver().setup();

            tlDriver.set(new EdgeDriver());

        }

        else if (browser.equals("Safari")) {

            WebDriverManager.safaridriver().setup();

            tlDriver.set(new SafariDriver());

        }

        else {

            System.out.println("Kindly Provide Appropriate Browser Value");
        }

       // getDriver().manage().deleteAllCookies();

       getDriver().manage().window().maximize();

        return getDriver();

    }


    public static synchronized WebDriver getDriver() {

       return tlDriver.get();

    }



}
