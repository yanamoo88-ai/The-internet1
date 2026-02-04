package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage open() {
        driver.get("https://the-internet.herokuapp.com");
        return this;
    }

    @FindBy(linkText = "JavaScript Alerts")
    public WebElement jsAlertsLink;

    public JavaScriptAlertsPage goToJavaScriptAlerts() {
        click(jsAlertsLink);
        return new JavaScriptAlertsPage(driver);
    }

    @FindBy(linkText = "Multiple Windows")
    public WebElement multipleWindowsLink;

    public MultipleWindowsPage goToMultipleWindows() {
        click(multipleWindowsLink);
        return new MultipleWindowsPage(driver);
    }

    @FindBy(linkText = "Nested Frames")
    public WebElement nestedFrames;

    public NestedFramesPage goToNestedFrames() {
        click(nestedFrames);
        return new NestedFramesPage(driver);
    }

    @FindBy(linkText = "Dropdown")
    public WebElement dropdown;

    public DropdownPage goToDropdown() {
        click(dropdown);
        return new DropdownPage(driver);
    }
}
