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

        // TOP → LEFT
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");

        WebElement body = driver.findElement(By.tagName("body"));
        softly.assertThat(body.getText())
                .as("Verify LEFT frame text")
                .contains("LEFT");

        // TOP → MIDDLE
        driver.switchTo().parentFrame();
        driver.switchTo().frame("frame-middle");

        body = driver.findElement(By.tagName("body"));
        softly.assertThat(body.getText())
                .as("Verify MIDDLE frame text")
                .contains("MIDDLE");

        // BOTTOM
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");

        body = driver.findElement(By.tagName("body"));
        softly.assertThat(body.getText())
                .as("Verify BOTTOM frame text")
                .contains("BOTTOM");

        assertAll();
        return this;
    }
}
