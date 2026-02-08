package com.internet.core;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {

    protected WebDriver driver;
    public static SoftAssertions softly;
    public static Actions actions;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        softly = new SoftAssertions(); // инициализация на каждую страницу
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);
    }

    public void click(WebElement element) {
        element.click();
    }

    public void moveToElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    public void scrollWithJS(int x, int y) {
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
    }

    public void waitOfElementVisibility(WebElement element, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
        wait.until(ExpectedConditions.visibilityOf(element));
    }


    public static void assertAll() {
        softly.assertAll();
    }

}