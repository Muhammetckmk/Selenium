package com.myfirstSeleniumProject.day11_actions;

import com.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class actionsTest extends TestBase {
    @Test
    void name() {
        // amazon a gidelim "https://www.amazon.com/"
        driver.get("https://www.amazon.com/");

        // sağ üst bölümde bulunan "Account & Lists" menüsüne git "Account" seçeneğine tıkla
        WebElement accountList = driver.findElement(By.id("nav-link-accountList"));

        Actions actions=new Actions(driver);
        actions.moveToElement(accountList).perform();//üzerinde bekledik
waitForSecond(3);
        driver.findElement(By.xpath("//span[.='Account']")).click();


        // açılan sayfanın titlesini "Your Account" içerdiğini doğrula
        Assertions.assertTrue(driver.getTitle().contains("Your Account"));
    }
}
