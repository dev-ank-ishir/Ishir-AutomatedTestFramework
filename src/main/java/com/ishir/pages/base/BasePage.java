package com.ishir.pages.base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class BasePage {

    // Base Page class includes all the generic actions

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected FluentWait fluentWait;

    // BasePage Class Constructor
    public BasePage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        this.fluentWait = new FluentWait(driver);

    }

    // Generic Method to launch URL

    public void doLaunchURL(String URL) {
        driver.get(URL);
    }

    // Generic Method to get Current Page Title

    public String doGetCurrentPageURL() {

        return driver.getCurrentUrl();
    }

    public String getCurrentPageTitle() {

        return driver.getTitle();
    }

    // Generic Method to perform Click action for a locator
    public void doClickAction(By locator) {


        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();

        // driver.findElement(locator).click();

    }

    // Generic Method to perform sendkeys action for a locator
    public void doSendKeysAction(By locator, CharSequence charSequence) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(charSequence);

        // driver.findElement(locator).sendKeys(charSequence);

    }

    // Generic Method to get WebElement list matching with a locator

    public List<WebElement> getElementsList(By locator) {

        return driver.findElements(locator);

    }

    // Generic Method to get Text from a matching locator

    public String getTextFromLocator(By locator) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();

        //  driver.findElement(locator).getText();
    }

    public void selectFromDropdownValuesByIndex(int index, By locator) {

        new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(locator))).selectByIndex(index);

    }

    public void selectFromDropdownValuesByValue(String value, By locator) {

        new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(locator))).selectByValue(value);

    }

    public void selectFromDropdownValuesByVisibleText(String visibleText, By locator) {

        new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(locator))).selectByVisibleText(visibleText);

    }

    public boolean isElementVisible(By locator) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();

    }

    public boolean isElementEnabled(By locator) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isEnabled();

    }

    public boolean isElementSelected(By locator) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isSelected();


    }


    public void hoverToElement(By locator) {

        new Actions(driver).moveToElement(driver.findElement(locator)).build().perform();

    }


}
