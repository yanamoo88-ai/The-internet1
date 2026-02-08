package com.internet.pages;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "column-a")
    WebElement columnA;

    public DragAndDropPage dragAToB() {
        actions.dragAndDrop(columnA,columnB).perform();
        return this;
    }

    @FindBy(id = "column-b")
    WebElement columnB;


    public DragAndDropPage verifyColumnsSwapped() {
        Assertions.assertEquals("B", columnA.getText());
        Assertions.assertEquals("A", columnB.getText());
        return this;
    }
}
