package com.myfirstSeleniumProject.day04;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.checkerframework.checker.units.qual.Prefix.one;

public class relativeLocators extends TestBase {


    @Test
    void relativeLocators() throws InterruptedException {
        // https://www.calculator.net/ adresine git
        driver.get("https://www.calculator.net/");
        //  '1' düğmesini locate etme
        WebElement one = driver.findElement(By.xpath("//span[.='1']"));

        //  Relative Locators kullanarak '0' düğmesini bul ('1' in altında)
        WebElement zero = driver.findElement(RelativeLocator.with(By.tagName("span")).below(one));

        //  Relative Locators kullanarak '2' düğmesini bul ('1' in sağında)
        WebElement two = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(one));

        //  Relative Locators kullanarak '3' düğmesini bul ('2' in sağında)
        WebElement three = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(two));

        //  Relative Locators kullanarak '4' düğmesini bul ('1' in üstünde)
        WebElement four = driver.findElement(RelativeLocator.with(By.tagName("span")).above(one));

        //  Relative Locators kullanarak '5' düğmesini bul ('4' in sağında)
        WebElement five = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(four));

        //  Relative Locators kullanarak '6' düğmesini bul ('5' in sağında)
        WebElement six = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(five));

        //  Relative Locators kullanarak '7' düğmesini bul ('4' in üstünde)
        WebElement seven = driver.findElement(RelativeLocator.with(By.tagName("span")).above(four));

        //  Relative Locators kullanarak '8' düğmesini bul ('7' in sağında, 5' in üzerinde)
        WebElement eight = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(seven).above(five));

        //  Relative Locators kullanarak '9' düğmesini bul ('8' in sağında, 6 nın üzerinde)
        WebElement nine = driver.findElement(RelativeLocator.with(By.tagName("span")).toRightOf(eight).above(six));

        //  Relative Locators kullanarak sonuç satırını bul ('7, 8, 9' un üzerinde)
        WebElement result = driver.findElement(RelativeLocator.with(By.tagName("div")).above(seven).above(nine));

        //  her düğmeye tıkla
        one.click();
        Thread.sleep(1000);
        two.click();
        Thread.sleep(1000);
        zero.click();
        Thread.sleep(1000);
        three.click();
        Thread.sleep(1000);
        four.click();
        Thread.sleep(1000);
        five.click();
        Thread.sleep(1000);
        six.click();
        Thread.sleep(1000);
        seven.click();
        Thread.sleep(1000);
        eight.click();
        Thread.sleep(1000);
        nine.click();
        Thread.sleep(1000);
        //  sonucu yazdır
        System.out.println("result.getText() = " + result.getText());






    }


}
