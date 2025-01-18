package com.myfirstSeleniumProject.day05_checkbox_radio;

import com.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day05_xpath_checkbox  extends TestBase {





//
//    When user goes to :
//    https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
//    And enter username
//    And enter password
//    And click on submit button
//    Then verify the login is successful
//    Then logout the application
//    Then verify the logout is successful
        // close the application




        @Test
        public void xpath(){


            //    When user goes to :
//    https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

//    And enter username

            //1.Adim webelementi olusturmam lazim bunun icinde locatirini almam lazim....

            WebElement username = driver.findElement(By.xpath("//input[@name='username']"));

            //2.adim username gonder

            username.sendKeys("Admin");


//    And enter password

            //1.Adim webelementi olusturmam lazim bunun icinde locatirini almam lazim....

            WebElement password =  driver.findElement(By.xpath("//input[@type='password']"));

            password.sendKeys("admin123");


//    And click on login button

            WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));

            login.click();


//    Then verify the login is successful

            WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));

            Assertions.assertTrue(dashboard.getText().contains("Dashboard"));


//    Then logout the application

            driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click(); //profile buttonu


            WebElement logout = driver.findElement(By.xpath("(//a[@role='menuitem'])[4]"));


            logout.click();


//    Then verify the logout is successful


            WebElement logoutSuc = driver.findElement(By.xpath("//*[.='Login']"));


            Assertions.assertTrue(logoutSuc.getText().contains("Login"));


        }






        @Test
        public void checkbox(){

            //    Go to https://testcenter.techproeducation.com/index.php?page=checkboxes

            driver.get("https://testcenter.techproeducation.com/index.php?page=checkboxes");


//    Locate the elements of checkboxes

            WebElement checkbox1 = driver.findElement(By.cssSelector("input[name='checkbox1']"));

            WebElement checkbox2 = driver.findElement(By.xpath("//input[@id='box2']"));
//
//    Then click on checkbox1 if box is not selected


            if (!checkbox1.isSelected()){

                checkbox1.click();
            }

//
//    Then click on checkbox2 if box is not selected

            if(!checkbox2.isSelected()){

                checkbox2.click();
            }
//
//    Then verify that checkbox1 is checked.


            Assertions.assertTrue(checkbox1.isSelected());


        }
}
