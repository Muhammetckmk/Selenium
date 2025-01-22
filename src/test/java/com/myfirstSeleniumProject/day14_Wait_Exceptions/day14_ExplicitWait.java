package com.myfirstSeleniumProject;

import com.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class day14_ExplicitWait extends TestBase {

    /*
    Selenium Waits;

    1) Implicitly wait :
         Sayfa üzerindeki tüm elemanlar için genel bir bekleme süresi tanımlamak için kullanılır.
         Daha basit ve global bir çözüm sunar.
    2) Explicit wait:(Ozel bir kosul)
         Bir websayfasi yuklendikten sonra bir webelement ile iglili specific bir kosul icin max. belirtmis
         oldugumuz sure kadar bekletiriz.
            a) WebdriverWait; kosulun kontrol edilme suresi default olarak yarim saniyelik araliklar ile olur,
                               istenirse özellestirilebilir.
            b) FluenWait; Daha fazla özellestirme imkani sunar
     */

    //https://the-internet.herokuapp.com/dynamic_loading/1
    //Click the start button
    //Hello World! Test that the article is on the site

    @Test
    void webdriverWait() {


        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //Start buttonuna tıkla
        driver.findElement(By.xpath("//button")).click();


        //Hello World! Yazının sitede oldugunu test et
        //waitFor(2);==> hardwait olduğu için kullanılmamalı
            // 1-obje oluşturulmalı
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
            // 2- hangi element için bekleme yapmak istiyorsak onu locate edelim
            WebElement helloWord = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
            // 3- oluşturmuş olduğumuz wait objectimiz üzerinden koşulumuzu tanımlıyruz
            wait.until(ExpectedConditions.visibilityOf(helloWord));

        Assertions.assertTrue(helloWord.isDisplayed());



    }
    @Test
    void webdriverWait2() {


        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //Start buttonuna tıkla
        driver.findElement(By.xpath("//button")).click();
        
        //Hello World! Yazının sitede oldugunu test et
        WebElement helloWord = new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
        Assertions.assertTrue(helloWord.isDisplayed());

 /*
        Locate ini vermis oldugumuz webelementi görünür oluncaya kadar bekle ve görünür olduktan sonra o webelementi bize ver dedik
        Eger belirttigimiz  (20 sn) süre icinde aradigimiz webelement görünür hale gelirse bu kod o webelementi bize verir
        ama eger belirtilen sure icnde görünür hale gelmez ise TIMEOUTEXCEPTION firlatir
         */

    }

    @Test
    void fluentWait() {


        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //Start buttonuna tıkla
        driver.findElement(By.xpath("//button")).click();

        //Hello World! Yazının sitede oldugunu test et
        FluentWait <WebDriver> wait= new FluentWait<>(driver);
        WebElement helloWord = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        wait.withTimeout(Duration.ofSeconds(20))//max bekletme süresini belirledik
                .pollingEvery(Duration.ofMillis(200))//belirttiğimiz aralıklar ile koşulu kontrol ediyoruz
                .withMessage("Webelementi ve süreyi kontrol et")//Eğer belirtilen maximum süre içinde koşul sağlanmaz ise burad yazdığımız mesaj konsolda TİMEOUTEXEPTİON ile birlikte görünecek
                .until(ExpectedConditions.visibilityOf(helloWord));//web elementin görünür olana kadar beklemesi koşulunu tanımladık

        Assertions.assertTrue(helloWord.isDisplayed());



    }
}
