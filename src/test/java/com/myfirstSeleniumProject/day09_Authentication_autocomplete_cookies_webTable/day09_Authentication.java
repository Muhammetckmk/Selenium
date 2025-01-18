package com.myfirstSeleniumProject.day09_Authentication_autocomplete_cookies;

import com.utilities.TestBase;
import org.junit.jupiter.api.Test;

public class day09_Authentication extends TestBase {



    @Test
    public void authentication() throws InterruptedException {

//        username : admin
//        password : admin
//        url	: the-internet.herokuapp.com/basic_auth
//
//        URL FOR AUTH:
//        https://admin:admin@the-internet.herokuapp.com/basic_auth
//
//        driver.get(“https://admin:admin@the-internet.herokuapp.com/basic_auth”); This will auth the page
//


        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(15000);

    }



}
