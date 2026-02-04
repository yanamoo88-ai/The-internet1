package com.internet.pages;

import com.internet.core.BasePage;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowsPage extends BasePage {

    public MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Click Here")
    public WebElement clickHereLink;

    public MultipleWindowsPage openNewWindow() {
        click(clickHereLink);
        return this;
    }

    public MultipleWindowsPage switchToWindow(int index) {
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;
    }

    public MultipleWindowsPage verifyTitle(String expectedTitle) {
        Assertions.assertEquals(
                expectedTitle,
                driver.getTitle(),
                "Window title is incorrect"
        );
        return this;
    }
}
