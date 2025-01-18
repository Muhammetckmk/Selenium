package com.myfirstSeleniumProject.day09_Authentication_autocomplete_cookies;

import com.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class day09_autocomplete extends TestBase {


//    Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete page=autocomplete
//When user type "uni" in the search box
//And select the 'United Kingdom' from the suggestions
//And click on submit button
//Then verify the result contains 'United Kingdom'


    @Test
    public void autoComplete() throws InterruptedException {


        //    Given user is on https://testcenter.techproeducation.com/index.php?page=autocomplete page=autocomplete

        driver.get("https://testcenter.techproeducation.com/index.php?page=autocomplete");

//When user type "uni" in the search box
        WebElement countrySearchBox = driver.findElement(By.id("myCountry"));

        countrySearchBox.sendKeys("uni");
        Thread.sleep(3000);

//And select the 'United Kingdom' from the suggestions
        WebElement unitedKingdom = driver.findElement(By.xpath("//div[@id='myCountryautocomplete-list']//div[text()='ted Kingdom']"));
        Thread.sleep(3000);
        unitedKingdom.click();
        //And click on submit button

        driver.findElement(By.xpath("//input[@value='Submit']")).click();


//Then verify the result contains 'United Kingdom'

        WebElement result =  driver.findElement(By.id("result"));

        Assertions.assertTrue(result.getText().contains("You selected: United Kingdom"));

        Thread.sleep(3000);





    }
}