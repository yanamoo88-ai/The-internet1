package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Test;

public class JavaScriptAlertsTest extends TestBase {

    @Test
    void jsAlertTest() {
        new HomePage(driver)
                .open()
                .goToJavaScriptAlerts()
                .clickJsAlert()
                .verifyResult("You successfully clicked");
    }

    @Test
    void jsConfirmTest() {
        new HomePage(driver)
                .open()
                .goToJavaScriptAlerts()
                .clickJsConfirm("Ok")
                .verifyResult("You clicked: Ok");
    }

    @Test
    void jsPromptTest() {
        new HomePage(driver)
                .open()
                .goToJavaScriptAlerts()
                .sendTextToPrompt("QA is the best!")
                .verifyResult("QA is the best!");
    }
}
