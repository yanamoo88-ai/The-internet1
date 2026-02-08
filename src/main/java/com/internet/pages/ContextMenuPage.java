package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ContextMenuPage extends BasePage {
    @FindBy(id = "hot-spot")
    WebElement contextMenuArea;

    public ContextMenuPage(WebDriver driver) {
        super(driver);
    }

    // Правый клик по элементу
    public void rightClickOnArea() {
        Actions actions = new Actions(driver);
        actions.contextClick(contextMenuArea).perform();
    }

    // Подтвердить alert
    public void accertAlert() {
        driver.switchTo().alert().accept();
    }
    // Нажатие клавиш: DOWN + ENTER
    public void pressDownAndEnter() {
        Actions actions = new Actions(driver);
        actions
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();
    }
}
