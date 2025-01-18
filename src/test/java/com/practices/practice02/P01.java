package com.practices.practice02;

import com.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class P01 extends TestBase {
    // Go to https://testpages.herokuapp.com/styled/calculator
    // Test the application for mathematical operations by creating four different test methods.


// Dört farkli test metdhodu olusturarak matematiksel işlem icin uygulamayi test edin.

    @Test
    void plus() throws InterruptedException {
        // https://testpages.herokuapp.com/styled/calculator adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        // toplama işlemi seç
        WebElement dropdown = driver.findElement(By.cssSelector("select[id='function']"));
        Select opinion= new Select(dropdown);
        opinion.selectByValue("plus");
Thread.sleep(3000);
        //birimvi sayıyı gir
        driver.findElement(By.id("number1")).sendKeys("5");

        Thread.sleep(3000);

        //ikinci sayıyı gir
        driver.findElement(By.id("number2")).sendKeys("6");

        // sonucu göster e tıkla
        driver.findElement(By.cssSelector("input[id='calculate']")).click();
        Thread.sleep(3000);

        //return u kontrol et
        WebElement sonuc = driver.findElement(By.cssSelector("span[id='answer']"));
        Assertions.assertTrue(sonuc.getText().equals("11"));
        Thread.sleep(3000);



    }
    @Test
    void times() throws InterruptedException {
        // https://testpages.herokuapp.com/styled/calculator adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        // toplama işlemi seç
        WebElement dropdown = driver.findElement(By.cssSelector("select[id='function']"));
        Select opinion= new Select(dropdown);
        opinion.selectByValue("times");
        Thread.sleep(3000);

        //birimvi sayıyı gir
        driver.findElement(By.id("number1")).sendKeys("-9");

        Thread.sleep(3000);

        //ikinci sayıyı gir
        driver.findElement(By.id("number2")).sendKeys("-3");

        // sonucu göster e tıkla
        driver.findElement(By.cssSelector("input[id='calculate']")).click();
        Thread.sleep(3000);

        //return u kontrol et
        WebElement sonuc = driver.findElement(By.cssSelector("span[id='answer']"));
        Assertions.assertEquals("27", sonuc.getText(),"negatif sayılarda çarpma işlemi yapamıyor");
        Thread.sleep(3000);



    }
    @Test
    void minus() throws InterruptedException{
        // https://testpages.herokuapp.com/styled/calculator adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        // toplama işlemi seç
        WebElement dropdown = driver.findElement(By.cssSelector("select[id='function']"));
        Select opinion= new Select(dropdown);
        opinion.selectByValue("minus");
        Thread.sleep(3000);

        //birimvi sayıyı gir
        driver.findElement(By.id("number1")).sendKeys("0");

        Thread.sleep(3000);

        //ikinci sayıyı gir
        driver.findElement(By.id("number2")).sendKeys("-666");

        // sonucu göster e tıkla
        driver.findElement(By.cssSelector("input[id='calculate']")).click();
        Thread.sleep(3000);

        //return u kontrol et
        WebElement sonuc = driver.findElement(By.cssSelector("span[id='answer']"));
        Assertions.assertEquals("666", sonuc.getText(),"negatif sayılarda bölme işlemi yapamıyor");
        Thread.sleep(3000);



    }

    @Test
    void divide() throws InterruptedException{
        // https://testpages.herokuapp.com/styled/calculator adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        // toplama işlemi seç
        WebElement dropdown = driver.findElement(By.cssSelector("select[id='function']"));
        Select opinion= new Select(dropdown);
        opinion.selectByValue("divide");
        Thread.sleep(3000);

        //birimvi sayıyı gir
        driver.findElement(By.id("number1")).sendKeys("-6");

        Thread.sleep(3000);

        //ikinci sayıyı gir
        driver.findElement(By.id("number2")).sendKeys("0");

        // sonucu göster e tıkla
        driver.findElement(By.cssSelector("input[id='calculate']")).click();
        Thread.sleep(3000);

        //return u kontrol et
        WebElement sonuc = driver.findElement(By.cssSelector("span[id='answer']"));
        Assertions.assertEquals("ERR", sonuc.getText(),"sıfıra bölme işlemi yapılamamalı");
        Thread.sleep(3000);



    }
    @Test
    void divide2() throws InterruptedException{
        // https://testpages.herokuapp.com/styled/calculator adresine gidin
        driver.get("https://testpages.herokuapp.com/styled/calculator");
        // toplama işlemi seç
        WebElement dropdown = driver.findElement(By.cssSelector("select[id='function']"));
        Select opinion= new Select(dropdown);
        opinion.selectByValue("divide");
        Thread.sleep(3000);

        //birimvi sayıyı gir
        driver.findElement(By.id("number1")).sendKeys("0");

        Thread.sleep(3000);

        //ikinci sayıyı gir
        driver.findElement(By.id("number2")).sendKeys("0");

        // sonucu göster e tıkla
        driver.findElement(By.cssSelector("input[id='calculate']")).click();
        Thread.sleep(3000);

        //return u kontrol et
        WebElement sonuc = driver.findElement(By.cssSelector("span[id='answer']"));
        Assertions.assertEquals("ERR", sonuc.getText(),"sıfıra bölme işlemi yapılamamalı");
        Thread.sleep(3000);



    }
}
