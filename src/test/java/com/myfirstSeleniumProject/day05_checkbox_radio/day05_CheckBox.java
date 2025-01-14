package com.myfirstSeleniumProject.day05;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day05_CheckBox extends TestBase {
    //Create a class : CheckBox
    //
    //Create test method and complete the following task.
    //Go to https://testcenter.techproeducation.com/index.php?page=checkboxes
    //Locate the elements of checkboxes
    //
    //Then click on checkbox1 if box is not selected
    //
    //Then click on checkbox2 if box is not selected
    //
    //Then verify that checkbox1 is checked.

 //   static WebDriver driver;
 //   @BeforeAll
 //   public static void setUp(){
 //       driver=new ChromeDriver();
//
 //       driver.manage().window().maximize();
//
 //       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
 //   }

    @Test
    public void checkBox() throws InterruptedException {
        driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");
        WebElement checkbox1= driver.findElement(By.xpath("//input[@id='box1']"));
        Thread.sleep(3000);
        WebElement checkbox2=  driver.findElement(By.xpath("//input[@id='box2']"));

        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        Thread.sleep(3000);

        if (!checkbox2.isSelected()){
            checkbox2.click();
        }
        Thread.sleep(3000);


        Assertions.assertTrue(checkbox1.isSelected());
        Assertions.assertTrue(checkbox2.isSelected());

    }
}
