package com.internet.pages;

import com.internet.core.BasePage;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HoversPage extends BasePage {

    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".figure")
    private List<WebElement> figures;

    @FindBy(css = ".figcaption")
    private List<WebElement> captions;

    // 🔹 Навести курсор на фигуру по индексу
    public HoversPage hoverOverFigure(int index) {
        moveToElement(figures.get(index));
        return this;
    }

    public HoversPage verifyCaptionVisible(int index, String expectedText) {
        // Находим саму фигуру по индексу
        WebElement figure = figures.get(index);

        // Ждём, пока элемент figcaption станет видимым
        WebElement caption = figure.findElement(By.cssSelector(".figcaption"));
        waitOfElementVisibility(caption, 10);

        // Берём только заголовок h5 внутри caption
        WebElement header = caption.findElement(By.tagName("h5"));
        waitOfElementVisibility(header, 10); // можно добавить ожидание для h5, если нужно

        // Сравниваем текст h5 с ожидаемым
        String actualText = header.getText().trim();
        Assertions.assertEquals(expectedText, actualText,
                "Caption text is not as expected for figure " + index);

        return this;
    }

}
