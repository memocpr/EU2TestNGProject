package com.cybertek.tests.day7_testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BeforeAfterTest {
    @Test
    public void test1(){
        System.out.println("this is my test 1");
    }

    @Test
    public void test2(){
        System.out.println("this is my test 2");
    }

    @Ignore
    @Test
    public void test3(){
        System.out.println("this is my test 3");
    }

    @BeforeMethod
    public void setUp(){

        //WebDriver part
        System.out.println("BEFORE METHOD HERE");
        System.out.println("WebDriver part");
    }

    @AfterMethod

        //quit part
        public void tearDown(){

        System.out.println("AFTER METHOD HERE");
        System.out.println("quit part");

    }

    @BeforeClass

    public void setUpClass(){

        System.out.println("------BEFORE CLASS------");

        System.out.println("runs only once before everything in the class");
    }


    @AfterClass

    public void afterClass(){

        System.out.println("--------AFTER CLASS-------");

        System.out.println("runs only once after everything in the class");

        System.out.println("-------GENERATE REPORT----");
    }




}
