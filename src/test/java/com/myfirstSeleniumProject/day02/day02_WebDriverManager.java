package com.myfirstSeleniumProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_WebDriverManager {
    public static void main(String[] args) {

        //Webdrivermanager dependency i pom.xml dosyasına ekledil ve bizim için artık System.setPropety kullanmamıza gerek kalmadı


        //WebDriverManager ekleyince ne oluyor
        WebDriverManager.chromedriver().setup();

        //webdiriver interface clasından driver objesi oluşturuyoruz
        WebDriver driver = new ChromeDriver();

        //pencereyi büyüt
        driver.manage().window().maximize();

        //navigate to page

        driver.get("https://www.kitapyurdu.com/");

        //sayfayı kapat
        driver.close();




    }

}
