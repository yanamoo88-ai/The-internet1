package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Test;

public class HoversTest extends TestBase {

    @Test
    public void hoverThirdProfileTest() {
        new HomePage(driver)
                .open()
                .goToHovers()
                .hoverOverFigure(0)                        // третий профиль (индекс 2)
                .verifyCaptionVisible(0, "name: user1");  // ожидаемый текст подписи
    }
}
