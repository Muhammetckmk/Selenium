package com.myfirstSeleniumProject.day04;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class xpathWork extends TestBase {

    @Test
    void test01() throws InterruptedException {
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine git
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        //add element butonuna bas
        driver.findElement(By.xpath("//button[text()='Add Element']")).click();

        //dlelte butonunun görünür oldupğunu test et
        WebElement deleteDsiabled = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        Assertions.assertTrue(deleteDsiabled.isDisplayed());
Thread.sleep(3000);
        //delete butonuna bas
        deleteDsiabled.click();
        //"Add/Remove Elements" yazısının görünür olduğunu test et
        WebElement addRemoveText = driver.findElement(By.xpath("//h3"));
        Assertions.assertTrue(addRemoveText.isDisplayed());
    }
}
