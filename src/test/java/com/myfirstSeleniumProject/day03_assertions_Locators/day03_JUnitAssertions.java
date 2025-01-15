package com.myfirstSeleniumProject.day03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class day03_JUnitAssertions {

    @Test
    public void assertions(){
        Assertions.assertEquals(5,4);//Fail
    }

    @Test
    public void assertEquels(){
        Assertions.assertEquals("apple","APPLE");//Fail
        Assertions.assertEquals("apple","APPLE".toLowerCase());//pass
    }
    @Test
    public void assertEquels2(){
        Assertions.assertEquals(5.12,5.13);//Fail
    }
    @Test
    public void assertEquels3(){
        Assertions.assertTrue(10>8);//PASS
    }
    @Test
    public void assertEquels4() {
        Assertions.assertTrue(5 > 6);//Fail
        Assertions.assertTrue(5 == 5);// üst satırı fail bulduğu için bu satıra bakmakz.
        //Hard assertions denir buna

    }
    @Test
    public void assertEquels5() {

        Assertions.assertFalse(2>3);//PASS

        Assertions.assertFalse(5>3);//FAİL
    }

    @Test
    public void assertEquels6() {

   String a=null;
   Assertions.assertNull(a);
    }

}
