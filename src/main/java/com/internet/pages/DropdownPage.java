package com.internet.pages;

import com.internet.core.BasePage;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage {

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdown;

    public DropdownPage selectOption(String option) {

        SoftAssertions softly = new SoftAssertions();

        Select select = new Select(dropdown);
        select.selectByVisibleText(option);

        softly.assertThat(select.getFirstSelectedOption().getText())
                .isEqualTo(option);

        softly.assertAll();
        return this;
    }
}
