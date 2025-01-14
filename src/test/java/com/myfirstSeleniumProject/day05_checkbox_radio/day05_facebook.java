package com.myfirstSeleniumProject.day05;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class day05_facebook {

    //Create a class : RadioButton
    //
    //Complete the following task.
    //
    //Go to https://www.facebook.com/
    //
    //Click on Create an Account button
    //
    //Locate the elements of radio buttons
    //
    //Then click on the radio buttons for your gender if they are not selected
    static WebDriver driver;
    @BeforeAll
    public static void setUp(){
        driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @AfterAll
    public static void tearDown(){

        driver.close();
    }


    @Test
    public void testFacebook() throws InterruptedException {
        driver.get("https://www.facebook.com/r.php?entry_point=login");


        Faker faker=new Faker();

        WebElement firsName= driver.findElement(By.xpath("//input[@name='firstname']"));
        firsName.sendKeys(faker.name().firstName());
        Thread.sleep(3000);

        WebElement lastName=driver.findElement(By.xpath("//*[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        Thread.sleep(3000);

        //Gender
        WebElement gender= driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();
        Thread.sleep(3000);

        //Mail
        WebElement eMail= driver.findElement(By.xpath("//input[@name='reg_email__']"));
        eMail.sendKeys(faker.internet().emailAddress());
        Thread.sleep(3000);

        //password
        WebElement pass= driver.findElement(By.xpath("//input[@id='password_step_input']"));
        pass.sendKeys(faker.internet().password());
        Thread.sleep(3000);

        //signup
        WebElement singup= driver.findElement(By.xpath("//button[@type='submit']"));
        singup.click();
        Thread.sleep(3000);
    }
}
//     List<WebElement> allGender  = driver.findElements(By.xpath("//input"));
//
//        for (WebElement each: allGender) {
//
//            each.click();
//
//        }