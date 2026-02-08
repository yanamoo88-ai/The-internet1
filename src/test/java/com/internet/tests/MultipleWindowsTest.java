package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Test;

public class MultipleWindowsTest extends TestBase {

    @Test
    void newWindowTest() {
        new HomePage(driver)
                .open()
                .goToMultipleWindows()
                .openNewWindow()
                .switchToWindow(1)
                .verifyTitle("New Window");
    }
}
