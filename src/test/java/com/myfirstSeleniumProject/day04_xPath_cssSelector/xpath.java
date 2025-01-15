package com.myfirstSeleniumProject.day04;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class xpath extends TestBase {
    /*
    /  -> bir alt child ı seçer
    // -> sayfadaki herhangi bir web elementi seçer
    @  -> web elementin attribute nı seçer
    [] -> index veya koşul belirtmek için kullanılır
    *  -> herhangi bir web elementi seçer (farketmeksizin)


        SYNTEX:
        //tagName[@attributeİsmi='attributeValue']
        //*[@*='attributeValue']
        //(tagName[@attributeİsmi='attributeValue'])[indx]
     */

    @Test
    void test01() throws InterruptedException {
     //web sayfasına gidin https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        driver.navigate().refresh();
        driver.navigate().refresh();
        Thread.sleep(3000);
     //arama kutusunda "city bike" aratın
        WebElement arama=driver.findElement(By.xpath("//input[@role='searchbox']"));
        arama.sendKeys("city bike", Keys.ENTER);

     //arama kutusunda görüntülenen ilgili sonuçları sayısını yazdırın
        WebElement resultText = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println("sonuç sayısı = " + resultText.getText());//sonuç sayısı = 1-16 of 126 results for "city bike"
        //sadece sonuç sayısını yazdırın
        System.out.println("sayısı = " + resultText.getText().split(" ")[2]);
        //karşımıza çıkan ilk sonucun metnini yazdırın


    }
}
