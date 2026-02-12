package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class JavaScriptAlertsTest extends TestBase {

    @Test
    @Tag("smoky")
    void jsAlertTest() {
        new HomePage(driver)
                .open()
                .goToJavaScriptAlerts()
                .clickJsAlert()
                .verifyResult("You successfully clicked");
    }

    @Test
    @Tag("smoky")
    void jsConfirmTest() {
        new HomePage(driver)
                .open()
                .goToJavaScriptAlerts()
                .clickJsConfirm("Ok")
                .verifyResult("You clicked: Ok");
    }

    @Test
    @Tag("smoky")
    void jsPromptTest() {
        new HomePage(driver)
                .open()
                .goToJavaScriptAlerts()
                .sendTextToPrompt("QA is the best!")
                .verifyResult("QA is the best!");
    }
}
