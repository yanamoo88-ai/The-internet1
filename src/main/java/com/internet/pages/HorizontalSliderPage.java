package com.internet.pages;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HorizontalSliderPage extends BasePage {

    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "input")
    WebElement slider;

    public HorizontalSliderPage moveSliderTo(double targetValue) {
        double currentValue = Double.parseDouble(rangeValue.getText());
        while (currentValue < targetValue) {
            slider.sendKeys(Keys.ARROW_RIGHT);
            currentValue = Double.parseDouble(rangeValue.getText());
        }

        return this;
    }

    @FindBy(id = "range")
    WebElement rangeValue;

    public HorizontalSliderPage verifySliderValue(String expectedValue) {
        Assertions.assertEquals(expectedValue, rangeValue.getText(), "Slider value is incorrect");
        return this;
    }
}

