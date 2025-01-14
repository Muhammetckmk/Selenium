package com.myfirstSeleniumProject.day06;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class day06_dropDown extends TestBase {
    //Go to https://testcenter.techproeducation.com/index.php?page=dropdown

    //1.Create method selectByIndexTest and Select Option 1 using index
    //2.Create method selectByValueTest Select Option 2 by value
    //3.Create method selectByVisibleTextTest Select Option 1 value by visible text
    //4.Create method printAllTest Print all dropdown value
    //5.Verify the dropdown has Option 2 text
    //6.Create method printFirstSelectedOptionTest Print first selected option
    //7.Find the size of the dropdown, Print “Expected Is Not Equal Actual” if there are not 3 elements in the dropdown.

    @Test
    public void dropDown() throws InterruptedException {
        //Go to https://testcenter.techproeducation.com/index.php?page=dropdown
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        //1.Create method selectByIndexTest and Select Option 1 using index

        //1.adım simple dropdown için locator al
                WebElement simpleDropdown=driver.findElement(By.id("dropdown"));

                //2. adım select clasından obje oluştur
                Select options = new Select(simpleDropdown);

                //3. adım index numarasında göre options 1 i seç...
                options.selectByIndex(1);


                Thread.sleep(3000);
                Assertions.assertTrue(simpleDropdown.getText().contains("1"));


        //2.Create method selectByValueTest Select Option 2 by value
                //select clasından oluşturduğum için o objeyi aynı dropdown da tekrar kullanabilirim
                options.selectByValue("2");
                Thread.sleep(3000);
                Assertions.assertTrue(simpleDropdown.getText().contains("2"));



        //3.Create method selectByVisibleTextTest Select Option 1 value by visible text
                options.selectByVisibleText("Option 1");
                Thread.sleep(3000);
                Assertions.assertTrue(simpleDropdown.getText().contains("1"));

        //4.Create method printAllTest Print all dropdown value
               List<WebElement> allElement= options.getOptions();

               for (WebElement eachElement: allElement){
                   System.out.println(eachElement.getText());
               }


        //5.Verify the dropdown has Option 2 text
                options.selectByValue("2");
                Assertions.assertTrue(simpleDropdown.getText().contains("2"));

        //6.Create method printFirstSelectedOptionTest Print first selected option
                WebElement firstSelectedOption= options.getFirstSelectedOption();
                System.out.println("seçilen ilk elementi göster " + firstSelectedOption.getText());
                Assertions.assertTrue(firstSelectedOption.getText().contains("2"));

        //7.Find the size of the dropdown, Print “Expected Is Not Equal Actual” if there are not 3 elements in the dropdown.
                List<WebElement> allItem= options.getOptions();
                int numberOfElement= allItem.size();
                if (numberOfElement==3){
                    System.out.println("Test Passed");
                }else {
                    System.out.println("Expected Is Not Equal Actual");
                }
    }

    @Test
    public void dob() throws InterruptedException {

        //    Go to https://testcenter.techproeducation.com/index.php?page=dropdown



        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

            Thread.sleep(3000);
//    Create method selectByIndexTest and Select 2015 using index

                 // 1 adım yıl için locator al
                 WebElement year = driver.findElement(By.id("year"));


                 //2. adım select clası ile obje oluştur ve year ı içine at
                 Select year2015= new Select(year);//şuan bütün aylar bu year2015 in içinde

                 //3. adım index numarasını kullanarak 2015 i seç
                 year2015.selectByIndex(10);
                Thread.sleep(3000);

        //    Create method selectByValueTest Select January by value
                WebElement month = driver.findElement(By.id("month"));

                //2. adım select clası ile obje oluştur ve year ı içine at
                Select january = new Select(month);

                //3. adım value ile kullanarak january i seç
                january.selectByValue("0");
        Thread.sleep(3000);

        //    Create method selectByVisibleTextTest Select 15 value by visible text
                WebElement day = driver.findElement(By.id("day"));

                 //2. adım select clası ile obje oluştur ve year ı içine at
                 Select days = new Select(day);

                 //3. adım value ile kullanarak january i seç
                 days.selectByValue("15");
                Thread.sleep(3000);



    }

    @Test
    public void state() throws InterruptedException {
        //sayfaya git
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        Thread.sleep(3000);

        //california yı seç
       WebElement state= driver.findElement(By.id("state"));

       //select ten obje oluşturma
        Select states= new Select(state);

        //california yı seç
        states.selectByVisibleText("California");

        Thread.sleep(3000);


       List<WebElement> allStates=  states.getOptions();
       for (WebElement eachstates: allStates){

           System.out.println(eachstates.getText());
       }

        System.out.println(allStates.size());


    }


}
