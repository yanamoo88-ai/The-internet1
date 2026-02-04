package com.internet.tests;

import com.internet.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsTest {
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
    void newWindowTest() {
        this.home.goToMultipleWindows()
                .openNewWindow()
                .switchToWindow(1)
                .verifyTitle("New Window");
    }
}