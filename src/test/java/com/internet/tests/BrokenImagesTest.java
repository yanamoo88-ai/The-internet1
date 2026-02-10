package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.BrokenImagesPage;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Test;


public class BrokenImagesTest extends TestBase {

    @Test
    void checkBrokenImagesTest() {
        HomePage home = new HomePage(driver);
        BrokenImagesPage broken = home.goToBrokenImagesPage();
        broken.checkBrokenImages();
    }
}