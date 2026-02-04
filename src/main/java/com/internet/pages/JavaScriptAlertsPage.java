package com.internet.pages;

import com.internet.core.BasePage;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JavaScriptAlertsPage extends BasePage {

    public JavaScriptAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()='Click for JS Alert']")
    public WebElement jsAlertButton;

    public JavaScriptAlertsPage clickJsAlert() {
        click(jsAlertButton);
        driver.switchTo().alert().accept();
        return this;
    }

    @FindBy(xpath = "//button[text()='Click for JS Confirm']")
    public WebElement jsConfirmButton;

    public JavaScriptAlertsPage clickJsConfirm(String result) {
        click(jsConfirmButton);
        Alert alert = driver.switchTo().alert();

        if ("Ok".equalsIgnoreCase(result)) {
            alert.accept();
        } else {
            alert.dismiss();
        }
        return this;
    }

    @FindBy(xpath = "//button[text()='Click for JS Prompt']")
    public WebElement jsPromptButton;

    public JavaScriptAlertsPage sendTextToPrompt(String text) {
        click(jsPromptButton);
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
        alert.accept();
        return this;
    }

    @FindBy(id = "result")
    public WebElement resultText;

    public JavaScriptAlertsPage verifyResult(String expectedText) {
        Assertions.assertTrue(
                resultText.getText().contains(expectedText),
                "Expected result to contain: " + expectedText
        );
        return this;
    }
}
