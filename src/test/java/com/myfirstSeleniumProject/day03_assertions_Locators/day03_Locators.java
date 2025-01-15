package com.myfirstSeleniumProject.day03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day03_Locators {

    //Create a class : Locators
    //Create a class: Locators
    //When user goes to :
    //     https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
    //And enter username
    //And enter password
    //And click on submit button
    //Then verify the login is successful
    //Then logout the application
    //Then verify the logout is successful

    static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }



    @Test
    public void test03(){

        //When user goes to :
        //     https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        //And enter username
            //1. adım Web Elementi tanımlamak
            WebElement username= driver.findElement(By.name("username"));
            //2. adım web elementi ile işlem yapmak
            username.sendKeys("Admin");

        //And enter password
            //1. adım web elementini tanımla
            WebElement password=driver.findElement(By.name("password"));
            //2. adım web elementi ile işlem yapmak
            password.sendKeys("admin123");



        //And click on login button
           WebElement loginButton= driver.findElement(By.tagName("button"));
            loginButton.click();

        //Then verify the login is successful
        Assertions.assertTrue(driver.getCurrentUrl().contains("dashboard"));

        //Then logout the application
            //1. adım web elemenitini tanımlama
            WebElement porfileButton= driver.findElement(By.className("oxd-userdropdown-name"));

            porfileButton.click();

            WebElement logout= driver.findElement(By.linkText("Logout"));

            logout.click();

        //Then verify the logout is successful
        Assertions.assertTrue(driver.getCurrentUrl().contains("login"));
        Assertions.assertFalse(driver.getCurrentUrl().contains("dashboard"));




    }



}
