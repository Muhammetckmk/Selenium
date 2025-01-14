package com.myfirstSeleniumProject.day08;

public class asd {
//    Open 2 new tabs and verify their TITLES
//                                -> LinkedIn , Ebay


    @Test
    public void newTabTest() throws InterruptedException {

        //1. adim sayfaya git
        driver.get("https://www.linkedin.com/");

        //2.adim sayfanin title ni assert et
        Assertions.assertTrue(driver.getTitle().contains("LinkedIn"));

        String linkedin =  driver.getWindowHandle();

//        System.out.println("linkedin id = " + linkedin);


        //3.adim new tab ac ve ebay sayfasina git.....

        driver.switchTo().newWindow(WindowType.TAB);

        Thread.sleep(3000);


        driver.get("https://www.ebay.com/");

        String ebay =driver.getWindowHandle();

//        System.out.println("ebay id = " + ebay);


        Assertions.assertTrue(driver.getTitle().contains("eBay"));


        //24. line da linkedin hashcode nu aldigimizdan dolayi geriye rahatlikla donebiliriz......

        driver.switchTo().window(linkedin);

        Assertions.assertTrue(driver.getCurrentUrl().contains("linkedin"));


        //39 line da ebayin hashcode nu aldigimizdan dolayi ileriye rahatlikla gidebiliriz.....


        driver.switchTo().window(ebay);


        Assertions.assertTrue(driver.getCurrentUrl().contains("ebay"));

    }

}
