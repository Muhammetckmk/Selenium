package com.myfirstSeleniumProject;

import org.junit.jupiter.api.*;

public class day03_JUnitAnnotations {

    //@Test annotations bizim test case oluşturmamızı sağlar
    //bu en çok kullandığımız test methodudur
    //@BeforeAll ve @AfterAll bunlar her clastan önce birir kez çalışır
    //@BeforeEach ve @AfterEach her bir test caseden (test annotation) önce ve sonra bir kez çalışır



    // @BeforeAll

    @BeforeAll
    public static void setUpClass(){

        System.out.println("Before All");
    }


    // @AfterAll

    @AfterAll
    public static void tearDownClass(){

        System.out.println("AfterAll");
    }



    // @BeforeEach

    @BeforeEach
    public void setUpMethods(){

        System.out.println("Before each");
    }


    // @AfterEach

    @AfterEach
    public void tearDownMethods(){


        System.out.println("After Each");
    }


    @Test
    public void test01(){

        System.out.println("Test01");
    }

    @Test
    public void test02(){


        System.out.println("Test02");
    }


    @Test
    public void test03(){

        System.out.println("Test03");
    }

    @Test
    public void test04(){


        System.out.println("Test04");
    }



    @Test
    public void test05(){


        System.out.println("Test05");
    }
}
