package com.myfirstSeleniumProject.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02_VerfyTitleTest {
    public static void main(String[] args) {
        //Create a new class: VerifyTitleTest
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        //Navigate to  techproeducation homepage / amazon homepage
        driver.get("https://www.techproeducation.com/");


        //3. Verify if page title is
        //"Techpro Education | Online It Courses & Bootcamps"  OR    //"Amazon.com. Spend less. Smile more."

        String actualResult = driver.getTitle();
        if (actualResult.contains("TechPro Education IT Programs")){
            System.out.println("Passed");
        }else {
            System.out.println(actualResult + " does not have 'TechPro Education IT Programs'");
        }
        //4. Close the window

        driver.close();

//           HOMEWORK
        // Verify the title of amazon.......

    }
}
