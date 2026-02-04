package com.internet.tests;

import com.internet.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlertsTest {
    WebDriver driver;
    HomePage home;

    @BeforeEach
    public void setUp() {
        this.driver = new ChromeDriver();
        this.home = (new HomePage(this.driver)).open();
    }

    @AfterEach
    public void tearDown() {
        this.driver.quit();
    }

    @Test
    public void jsAlertTest() {
        this.home.goToJavaScriptAlerts().clickJsAlert()
                .verifyResult("You successfully clicked");
    }

    @Test
    public void jsConfirmTest() {
        this.home.goToJavaScriptAlerts().clickJsConfirm("Ok")
                .verifyResult("You clicked: Ok");
    }

    @Test
    public void jsPromptTest() {
        this.home.goToJavaScriptAlerts()
                .sendTextToPrompt("QA is the best!")
                .verifyResult("QA is the best!");
    }
}
