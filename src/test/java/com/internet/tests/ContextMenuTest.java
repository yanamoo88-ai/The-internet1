package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.ContextMenuPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContextMenuTest extends TestBase {


    @Test
    public void contextMenuScenarioTest(){
        // 1. Зайти на страницу Context Menu
        driver.get("https://the-internet.herokuapp.com/context_menu");
        ContextMenuPage page = new ContextMenuPage(driver);

        // 2. Правый клик по элементу с пунктирной линией
        page.rightClickOnArea();

        // 3. Кликнуть OK в alert
        page.accertAlert();

        // 4. Нажать ARROW_DOWN и ENTER
        page.pressDownAndEnter();

        // 5. Убедиться, что мы вернулись на домашнюю страницу
        assertEquals("The Internet", driver.getTitle());

    }
}
