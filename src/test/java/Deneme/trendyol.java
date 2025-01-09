package Deneme;

import com.github.javafaker.Faker;
import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class allovercommerce extends TestBase {


//  static WebDriver driver;

//  @BeforeAll
//  static void beforeAll() {
//      driver= new ChromeDriver();
//      driver.manage().window().maximize();
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//  }

    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.trendyol.com/");
        Thread.sleep(5000);
        Faker fake= new Faker();

        //register
        WebElement singin =driver.findElement(By.xpath("//p[@class='link-text']"));
        //driver.findElement(By.cssSelector("p[class='link-text']"));

        singin.click();

        WebElement kayıt= driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[2]/div/button[2]"));
        kayıt.click();
        Thread.sleep(5000);

        //mail
        WebElement email= driver.findElement(By.xpath("//input[@class='q-input']"));
        email.sendKeys(fake.internet().emailAddress());
        Thread.sleep(5000);

        //pass
        WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));

        pass.sendKeys("Adsad12345689");
        Thread.sleep(5000);

        //gender
        WebElement gender = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        gender.click();
        Thread.sleep(3000);
        //checkBox
        WebElement checkBox= driver.findElement(By.xpath("//*[@id=\"login-register\"]/div[3]/div[1]/form/div[6]/div/div[1]/div"));

       // if (!checkBox.isSelected()){
            checkBox.click();
       // }
        Thread.sleep(10000);
        //robot
        //driver.findElement(By.xpath("//label[@id='recaptcha-anchor-label']")).click();
       // Thread.sleep(3000);


        //üye ol
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        Thread.sleep(3000);





    }

   // @AfterAll
   // static void afterAll() {
   //     driver.close();
   // }
}
