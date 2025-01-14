package com.myfirstSeleniumProject.day07;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class day07_window extends TestBase {

    @Test
    public void windowOperation() throws InterruptedException {

//        Go to https://the-internet.herokuapp.com/windows
        driver.get("https://the-internet.herokuapp.com/windows");


//        Assert if the window 1 title equals "The Internet"
        Assertions.assertTrue(driver.getTitle().contains("The Internet"));
        Thread.sleep(3000);

//        Click on the link
        WebElement clickBoutton= driver.findElement(By.linkText("Click Here"));
        clickBoutton.click();
        Thread.sleep(3000);
//        Assert if the window 2 title equals "New Window"

       String theInternetWin= driver.getWindowHandle();
       //yeni pencereye geçmem için yeni pencerenin hashcode sini seçeceğim

        Set<String> allHashCodes=driver.getWindowHandles();

        String newWindow="";
        for (String each:allHashCodes){
            System.out.println("each = " + each);

            if (!each.equals(theInternetWin)){
                newWindow=each;
            }

        }
        Thread.sleep(3000);

        driver.switchTo().window(newWindow);
        Thread.sleep(3000);

        Assertions.assertTrue(driver.getTitle().contains("New Window"));//buranın true dönmesi için yeni window un hashcode si ne geçiş yapması gerekiyor
        Thread.sleep(3000);



//        Switch back to window 1 title and assert if URL contains "windows"


//        And assert if the URL doesn't contains 'new'


    }

}
