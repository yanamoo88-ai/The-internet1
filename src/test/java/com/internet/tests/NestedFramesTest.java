package com.internet.tests;

import com.internet.pages.HomePage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFramesTest {

    WebDriver driver;

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void nestedFramesTest() {
        new HomePage(driver)
                .open()
                .goToNestedFrames()
                .verifyNestedFrames();
    }
}
