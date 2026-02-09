package com.internet.pages;

import com.internet.core.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;

public class FileUploaderPage extends BasePage {

    public FileUploaderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "file-upload")
    WebElement fileInput;

    public void selectFileAndUpload(String filePath) {
        fileInput.sendKeys(filePath);
        uploadButton.click();
    }

    @FindBy(id = "file-submit")
    WebElement uploadButton;

    public String getUploadedFileName() {
        return uploadedFileName.getText();
    }

    @FindBy(id = "uploaded-files")
    WebElement uploadedFileName;

    public static String getTestFilePath() {
        return new File("C:/Tools/deli7.jpg").getAbsolutePath();
    }

    public FileUploaderPage clickUploadButton() {
        click(uploadButton);
        return this;
    }
}