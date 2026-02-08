package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Test;

public class HorizontalSliderTest extends TestBase {

    @Test
    public void horizontalSliderTest() {
        new HomePage(driver)
                .open()
                .goToHorizontalSlider()
                .moveSliderTo(4.5)
                .verifySliderValue("4.5");
    }
}
