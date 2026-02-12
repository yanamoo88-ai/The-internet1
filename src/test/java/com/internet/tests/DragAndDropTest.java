package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class DragAndDropTest extends TestBase {
    @Test
    @Tag("smoky")
    public void dragAndDropTest() {
        new HomePage(driver)
                .open()
                .goToDragAndDrop()
                .dragAToB()
                .verifyColumnsSwapped();
    }
}
