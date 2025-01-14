package com.myfirstSeleniumProject.day05;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class radioButton extends TestBase {


    @Test
    void test() throws InterruptedException {
        // https://www.facebook.com adresine git
        driver.get("https://www.facebook.com/");

        // "Create an Account" butonuna basın
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

        // "radio buttons" elementlerini locat edin
       WebElement female = driver.findElement(By.xpath("//input[@value='1']"));
       WebElement male = driver.findElement(By.xpath("//input[@value=\"2\"]"));

        // cinsiyet butonundan uygun olanı seçiniz
        Thread.sleep(3000);
        male.click();
        Thread.sleep(3000);
        female.click();
        Thread.sleep(3000);
        male.click();
        Thread.sleep(3000);
        male.click();


    }
}
