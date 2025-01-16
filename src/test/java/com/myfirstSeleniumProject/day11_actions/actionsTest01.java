package com.myfirstSeleniumProject.day11_actions;

import com.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class actions extends TestBase {
    @Test
    void test(){
        // https://testcenter.techproeducation.com/index.php?page=context-menu sitesine git
        driver.get("https://testcenter.techproeducation.com/index.php?page=context-menu");
        waitForSecond(3);

        // kutuya sağ tıklayın
        WebElement box = driver.findElement(By.id("hot-spot"));
        Actions actions=new Actions(driver);
        actions.contextClick(box).perform();// kullandığımız action methodlarının aktif olması için perform kullanmalıyız
waitForSecond(3);
        // Alert te çıkan yazının "You selected a context menu" olduğunu test edin
        String expectedData= "You selected a context menu";
        String actualData = driver.switchTo().alert().getText();
        assertEquals(expectedData,actualData,"Actual Data ile expected Data uyumlu değil");

        // Tamam diyerek alert i kapatın
        driver.switchTo().alert().accept();
        waitForSecond(3);

    }
}
