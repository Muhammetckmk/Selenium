package com.myfirstSeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_GetPageSource {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com.tr/");


        //        Test if amazon contains "Registry" on the homepage
       String actuaResult= driver.getPageSource();
        if (actuaResult.contains("Registry")) {
            System.out.println("PASSED -- amazon has registry keyword and our test case");
        }else {
            System.err.println(" amazon has not registry keyword and our test case FAILED");
        }

        //        Create a new class : GetPageSource
            driver.quit();
    }
}
