package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage extends BasePage {

    public NestedFramesPage(WebDriver driver) {
        super(driver);
    }

    public NestedFramesPage verifyNestedFrames() {

        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        softly.assertThat(driver.findElement(By.tagName("body")).getText())
                .contains("LEFT");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");
        softly.assertThat(driver.findElement(By.tagName("body")).getText())
                .contains("MIDDLE");

        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-right");
        softly.assertThat(driver.findElement(By.tagName("body")).getText())
                .contains("RIGHT");

        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        softly.assertThat(driver.findElement(By.tagName("body")).getText())
                .contains("BOTTOM");

        assertAll();
        return this;
    }
}
