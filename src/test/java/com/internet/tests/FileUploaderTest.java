package com.internet.tests;

import com.internet.core.TestBase;
import com.internet.pages.FileUploaderPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileUploaderTest extends TestBase {

    @Test
    void uploadFilePositiveTest(){
    driver.get("https://the-internet.herokuapp.com/upload");
    FileUploaderPage page = new FileUploaderPage(driver);
    page.selectFileAndUpload(FileUploaderPage.getTestFilePath());

    assertEquals("deli7.jpg", page.getUploadedFileName());
    }
}
