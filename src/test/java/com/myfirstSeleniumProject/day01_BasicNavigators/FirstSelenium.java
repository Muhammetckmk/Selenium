package com.myfirstSeleniumProject.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) {

        // 1. step; System property is used to iniate the driver
        // driver i atamak icin sistem propertty kullanilir
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        //2. step create the crome driver
        //2. adım crome sürücüsünü oluştur
        WebDriver driver = new ChromeDriver();

        //3. step go to the website
        //3. adım siteye git
        driver.get("https://www.techproeducation.com/");
        driver.get("https://www.techproeducation.com/program/full-stack-python-developer");


    }
}
