package com.myfirstSeleniumProject.day04;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.*;

public class cssSelector extends TestBase {
    /*
    1)  tagName[attributeName='attributaValue']
    2)  eğer id ile css alacaksak ==> #idAttributeValue
    3)  eğer class ile attribute alacaksak ==> .classAttributeValue

    X-path ile cssSelector arasındaki farklar
    1) xpath te birden fazla element olursa indx ile bunu teke düşürebiliriz
        Fakat cssSelector ile index alamayız
    2) x path ile bir web elementi sadece text ile locate edebiliriz
        ama css ile bunu yapamayız
    3) cssSelector x-path e göre daha hızlıdır
     */
    @Test
    void test01() throws InterruptedException {
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine git
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        //add element butonuna bas
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();

        //delete butonunun görünür oldupğunu test et
        WebElement deleteDsiabled = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        assertTrue(deleteDsiabled.isDisplayed());
        Thread.sleep(3000);
        //delete butonuna bas
        deleteDsiabled.click();
        //"Add/Remove Elements" yazısının görünür olduğunu test et
        WebElement addRemoveText = driver.findElement(By.cssSelector("h3"));assertTrue(addRemoveText.isDisplayed());
        assertTrue(addRemoveText.isDisplayed());
    }

}
