package com.myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01_BasicNavigators {
    public static void main(String[] args) throws InterruptedException {
//       When user goes to walmart

        //1.adım driverın freamworkte nerede olduğunu tanımlama
        System.setProperty("webdriver.chrome","driver/chromedriver");

        //2. adım driver oluşturu
        WebDriver driver = new ChromeDriver();

        //3. adım sayfayı büyüt
        driver.manage().window().maximize();

//        Then goes to Techpro
        driver.get("https://www.techproeducation.com/");

//        Navigate to Walmart

        driver.navigate().to("https://www.walmart.com/");
        Thread.sleep(3000);

//        Navigate back to techpro

        driver.navigate().back();


//        Navigate forward to Walmart

        driver.navigate().forward();

//        Refresh the page
//          sayfayı yenile

        driver.navigate().refresh();

//        Close/Quit the browser
//          browser ı kapat
        driver.close();



    }
}
