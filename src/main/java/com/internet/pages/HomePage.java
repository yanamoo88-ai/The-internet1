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
    WebElement jsAlertsLink;

    public JavaScriptAlertsPage goToJavaScriptAlerts() {
        click(jsAlertsLink);
        return new JavaScriptAlertsPage(driver);
    }

    @FindBy(linkText = "Multiple Windows")
    WebElement multipleWindowsLink;

    public MultipleWindowsPage goToMultipleWindows() {
        click(multipleWindowsLink);
        return new MultipleWindowsPage(driver);
    }

    @FindBy(linkText = "Nested Frames")
    WebElement nestedFrames;

    public NestedFramesPage goToNestedFrames() {
        click(nestedFrames);
        return new NestedFramesPage(driver);
    }

    @FindBy(linkText = "Dropdown")
    WebElement dropdown;

    public DropdownPage goToDropdown() {
        click(dropdown);
        return new DropdownPage(driver);
    }

    @FindBy(linkText = "Drag and Drop")
    WebElement dragAndDrop;

    public DragAndDropPage goToDragAndDrop() {
        click(dragAndDrop);
        return new DragAndDropPage(driver);
    }

    @FindBy(linkText = "Horizontal Slider")
    WebElement horizontalSlider;

    public HorizontalSliderPage goToHorizontalSlider() {
        click(horizontalSlider);
        return new HorizontalSliderPage(driver);
    }

    @FindBy(linkText = "Hovers")
    WebElement hoversLink;

    public HoversPage goToHovers() {
        click(hoversLink);
        return new HoversPage(driver);
    }

    @FindBy(css = "a[href='/broken_images']")
    WebElement brokenImagesLink;

    public BrokenImagesPage goToBrokenImagesPage() {
        click(brokenImagesLink);
        return new BrokenImagesPage(driver);
    }
}
