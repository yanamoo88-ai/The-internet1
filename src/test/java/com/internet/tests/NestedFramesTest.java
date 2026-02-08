package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Test;

public class NestedFramesTest extends TestBase {

    @Test
    void nestedFramesTest() {
        new HomePage(driver)
                .open()
                .goToNestedFrames()
                .verifyNestedFrames();
    }
}
