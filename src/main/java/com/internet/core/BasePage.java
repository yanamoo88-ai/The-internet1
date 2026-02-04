package com.internet.core;

import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;
    public static SoftAssertions softly;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        softly = new SoftAssertions(); // инициализация на каждую страницу
        PageFactory.initElements(driver, this);
    }

    public void click(WebElement element) {
        element.click();
    }

    public static void assertAll() {
        softly.assertAll();
    }
}