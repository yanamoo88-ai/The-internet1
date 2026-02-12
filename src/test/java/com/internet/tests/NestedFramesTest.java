package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class NestedFramesTest extends TestBase {

    @Test
    @Tag("smoky")
    void nestedFramesTest() {
        new HomePage(driver)
                .open()
                .goToNestedFrames()
                .verifyNestedFrames();
    }

    @Test
    @Tag("parameters")
    void nestedFramesTestWithParametrs() {
        new HomePage(driver)
                .open()
                .goToNestedFrames()
                .verifyNestedFrames();
    }
}
