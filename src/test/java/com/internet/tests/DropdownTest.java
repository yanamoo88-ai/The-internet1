package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.HomePage;
import org.junit.jupiter.api.Test;

public class DropdownTest extends TestBase {

    @Test
    void dropdownTest() {
        new HomePage(driver)
                .open()
                .goToDropdown()
                .selectOption("Option 2");
    }
}