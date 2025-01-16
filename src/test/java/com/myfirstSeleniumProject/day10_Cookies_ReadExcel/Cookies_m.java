package com.myfirstSeleniumProject.day09_Authentication_autocomplete_cookies;

import com.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class Cookies extends TestBase {
    /*
    cookie denildiğinde aklımıza manage() methodu gelmeli.
    cookie iler le alakalı tüm işlemleri manage methodu ile yapabilriz
     */

    @Test
    void cookies() {
        // 1- amazon sayfasın gidin
        driver.get("https://www.amazon.com.tr/");
        driver.navigate().refresh();
        driver.navigate().refresh();
        waitForSecond(2);

        // 2- tüm cookie leri konsolda bir loop ile yazdırın
        Set<Cookie> cookieSet = driver.manage().getCookies();
        int counter=1;
        for (Cookie w:cookieSet){
            System.out.println(counter+ ". cookie : " + w);
            System.out.println(counter+ ". cookie name : " + w.getName());
            System.out.println(counter+ ". cookie value : " + w.getValue());
            System.out.println("************************************************");
            counter++;
        }

        // 3- sayfadaki cookies sayısının 5'ten büyük olduğunu test edin
        Assertions.assertTrue(cookieSet.size()>5);

        // 4- ismi i18n-prefs olan cookie değerinin TRY olduğunu test edin
        String actualCookieValue = driver.manage().getCookieNamed("i18n-prefs").getValue();
        Assertions.assertEquals("TRY",actualCookieValue);

        // 5- ismi "en sevdiğim cookie" ve değeri "cikolatali" olan bir cookie oluşturun ve sayfaya ekleyin
        Cookie cookie= new Cookie("en sevdiğim cookie","cikolatali");
        driver.manage().addCookie(cookie);
        cookieSet=driver.manage().getCookies();


        int counter2=1;
        for (Cookie w:cookieSet){
            System.out.println(counter2+ ". cookie : " + w);
            System.out.println(counter2+ ". cookie name : " + w.getName());
            System.out.println(counter2+ ". cookie value : " + w.getValue());
            System.out.println("************************************************");
            counter2++;
        }
        
        
        // 6- eklediğiniz cookie nin sayfaya eklendiğini test edin
        Assertions.assertTrue(cookieSet.contains(cookie));

        // 7- ismi skin olan cookie yi silin ve silindiğini test edin
        driver.manage().deleteCookieNamed("skin");

        Assertions.assertNull(driver.manage().getCookieNamed("skin"));

        // 8- tüm cookie leri silin ve silindiğini test edin

        driver.manage().deleteAllCookies();//tüm cookie ler silindi

        cookieSet= driver.manage().getCookies();
        Assertions.assertTrue(cookieSet.isEmpty()); //cookie set inin içinin boş olup olmadığını test eder

    }
}
