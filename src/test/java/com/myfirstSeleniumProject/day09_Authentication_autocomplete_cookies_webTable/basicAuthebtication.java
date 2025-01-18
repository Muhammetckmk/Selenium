package com.myfirstSeleniumProject.day09_Authentication_autocomplete_cookies;

import com.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class basicAuthebtication extends TestBase {

    @Test
    void test01() {

        //aşağıdaki bilgileri kullanarak Authentication yapınız
        //  Url: https://the-internet.herokuapp.com/basic_auth
        //  Username : admin
        //  Password : admin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        waitForSecond(2);
        //Congratulations! you must have the proper credentials. yazısının çıktığını doğrulayın
        WebElement element = driver.findElement(By.xpath("//p"));
        Assertions.assertEquals("Congratulations! You must have the proper credentials.",element.getText());
        waitForSecond(2);

        // Elemental Selenium linkine tıklayın
        driver.findElement(By.xpath("//a[@target='_blank']")).click();
        waitForSecond(2);

        // başlığın Elemental Selenium içerdiğini test edelim
        switchNewWindowByIndex(1);
        Assertions.assertTrue(driver.getTitle().contains("Elemental Selenium"));
        waitForSecond(2);

    }
}
