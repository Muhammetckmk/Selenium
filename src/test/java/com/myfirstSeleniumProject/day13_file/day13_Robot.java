package com.myfirstSeleniumProject;

import com.utilities.TestBase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

import static com.myfirstSeleniumProject.day04_xPath_cssSelector.day04_Xpath.driver;
import static com.utilities.TestBase.waitFor;

public class day13_Robot extends TestBase {
    @Test
    public void test01() throws AWTException {

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_O);
        robot.keyRelease(KeyEvent.VK_O);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.delay(3000);

    }

    //Go to "https://www.ilovepdf.com/compress_pdf"
    // upload the file
    //test if the file has been uploaded successfully


    @Test
    public void uploadFileTest() {
        waitFor(2);

        //"https://www.ilovepdf.com/compress_pdf" sitesine gidin
        driver.get("https://www.ilovepdf.com/compress_pdf");
        waitFor(2);

        //  dosyayi yukleyin
        driver.findElement(By.id("pickfiles")).click();

        String path = System.getProperty("user.home") + "\\Downloads\\FileUpload.pdf";
        uploadFilePath(path);

        //   dosyanin basariyla yuklendigini test edin
        WebElement uploadedFile = driver.findElement(By.xpath("//span[.='FileUpload.pdf']"));
        Assertions.assertTrue(uploadedFile.isDisplayed());

    }
}
