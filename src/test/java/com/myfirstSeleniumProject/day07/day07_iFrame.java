package com.myfirstSeleniumProject;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class day07_iFrame extends TestBase {

    @Test
    public void iframe(){


//    Go to
//    https://testpages.herokuapp.com/styled/frames/frames-test.html

        driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");

        //1.Adim==> Left tablosuna gitmen gerekiyor ama iframe bu yuzden switch to yapman lazim left iframe gecmek icin...

        driver.switchTo().frame(1);


//    Then Assert that "Left List Item 29" is the last element in the "Left"

        List<WebElement> leftAll = driver.findElements(By.xpath("//li"));

        String left29 = leftAll.get(leftAll.size()-1).getText();


        Assertions.assertTrue(left29.contains("29"));

        WebElement leftlist29 =driver.findElement(By.xpath("//li[@id='left29']"));

        System.out.println(left29);

//         WebElement leftlist39 =driver.findElement(By.xpath("//li[@id='left29']"));



//    And Assert that "Middle List Item 39" is the last element in the "Middle"

        driver.switchTo().defaultContent();

        driver.switchTo().frame("middle");


        List <WebElement> middleAll = driver.findElements(By.xpath("//li"));


        String middle39 = middleAll.get(middleAll.size()-1).getText();
        System.out.println(middle39);

        Assertions.assertTrue(middle39.contains("39"));


    }


}
