package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.ContextMenuPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContextMenuTest extends TestBase {


    @Test
    public void contextMenuScenarioTest(){
        driver.get("https://the-internet.herokuapp.com/context_menu");
        ContextMenuPage page = new ContextMenuPage(driver);
        page.rightClickOnArea();
        page.accertAlert();
        page.pressDownAndEnter();
        assertEquals("The Internet", driver.getTitle());
    }
}
