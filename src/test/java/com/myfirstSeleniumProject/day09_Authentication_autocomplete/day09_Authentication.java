package com.myfirstSeleniumProject.day09_Authentication;

import com.myfirstSeleniumProject.utilities.TestBase;
import org.junit.jupiter.api.Test;

public class day09_Authentication extends TestBase {

    @Test
    void authentication() throws InterruptedException {


        // syntax: https://username:password@URL
      //  driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Thread.sleep(10000);


        //username : admin
        //password : admin
        //url	: the-internet.herokuapp.com/basic_auth
        //
        //URL FOR AUTH:
        //https://admin:admin@the-internet.herokuapp.com/basic_auth
        //
        //driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth"); This will auth the page



    }

}
