package com.myfirstSeleniumProject.day07;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day07_Alert extends TestBase {


    @Test
    public void acceptAlert() throws InterruptedException {

        //Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        // Create a class: AlertTest
        // Create setUp method Create 3 test methods:
        // acceptAlert() => click on the first alert, verify the text “I am a JS Alert”
        WebElement clickAlert= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        Thread.sleep(3000);
        // click OK
        clickAlert.click();
        Thread.sleep(3000);
        Assertions.assertTrue(driver.switchTo().alert().getText().contains("I am a JS Alert"));
        //switcTo yaparak alert mesajını pnaylayıyoruz
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        //
        WebElement result= driver.findElement(By.xpath("//p[@id='result']"));
        Assertions.assertTrue(result.getText().contains("You successfully clicked an alert"));


        // and Verify “You successfully clicked an alert”
        // dismissAlert()=> click on the second alert, verify text "I am a JS Confirm”
        // click cancel
        // and Verify “You clicked: Cancel”
        // sendKeysAlert()=> click on the third alert, verify text “I am a JS prompt”,
        // type “Hello World”, click OK
        // and Verify “You entered: Hello World”

    }

    @Test
    public void dismissAlert() throws InterruptedException {


        //    Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        Thread.sleep(3000);

//    dismissAlert()=> click on the second alert, verify text "I am a JS Confirm"

        WebElement confirmButton = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));

        confirmButton.click();

        Thread.sleep(3000);
        Assertions.assertTrue(driver.switchTo().alert().getText().contains("I am a JS Confirm"));



//    click cancel

        driver.switchTo().alert().dismiss();

        Thread.sleep(3000);

//    and Verify "You clicked: Cancel"

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

        Thread.sleep(3000);
        Assertions.assertTrue(result.getText().contains("Cancel"));



    }


    @Test
    public void sendKeysAlert() throws InterruptedException {

        //    Go to https://testcenter.techproeducation.com/index.php?page=javascript-alerts

        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");
        Thread.sleep(3000);

//    dismissAlert()=> click on the second alert, verify text "I am a JS Confirm"

        WebElement confirmButton = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

        confirmButton.click();

        Thread.sleep(3000);
        Assertions.assertTrue(driver.switchTo().alert().getText().contains("I am a JS prompt"));

        driver.switchTo().alert().sendKeys("Hello World");
        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        WebElement result = driver.findElement(By.xpath("//p[@id='result']"));

        Thread.sleep(3000);
        Assertions.assertFalse(result.getText().contains("Turkey"));




    }

}
