package com.myfirstSeleniumProject.day05;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class checkbox extends TestBase {

    @Test
    void Test01() throws InterruptedException {
        // https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        // checkbox 1 ve 2 yi locate et
        WebElement checkBox1 = driver.findElement(By.xpath("( //input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("( //input[@type='checkbox'])[2]"));
        // checkbox1 seçili değilse onay kutusuna tıkla
        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        Thread.sleep(3000);
        // checkbox2 seçili değilse onay kutusuna tıkla
        if (!checkBox2.isSelected()){
            checkBox2.click();


        }
        Thread.sleep(3000);
    }

}
